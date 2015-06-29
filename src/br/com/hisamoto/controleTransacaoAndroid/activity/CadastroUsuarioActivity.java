package br.com.hisamoto.controleTransacaoAndroid.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import br.com.hisamoto.controleTransacaoAndroid.R;
import br.com.hisamoto.controleTransacaoAndroid.classes.Usuario;
import br.com.hisamoto.controleTransacaoAndroid.controller.UsuarioController;

/**
 * @author Leandro Shindi
 * @version 1.0 29/06/15.
 */
public class CadastroUsuarioActivity extends Activity {

    private EditText nome;
    private EditText email;
    private Button salvar;
    private Button cancelar;
    private UsuarioController controller;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.form_cadastro_usuario);

        controller = new UsuarioController(getApplicationContext());

        nome = (EditText) findViewById(R.id.nome);
        email = (EditText) findViewById(R.id.email);
        salvar = (Button) findViewById(R.id.salvar);
        cancelar = (Button) findViewById(R.id.cancelar);

        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nm = nome.getText().toString();
                String em = email.getText().toString();

                if(nm.equals("") && nm.trim().equals("")) {

                    Toast.makeText(getApplicationContext(), "Campo nome Obrigatório", Toast.LENGTH_LONG).show();
                    return;
                }

                if(em.equals("") && em.trim().equals("")) {

                    Toast.makeText(getApplicationContext(), "Campo email Obrigatório", Toast.LENGTH_LONG).show();
                    return;
                }

                Usuario usuario = new Usuario();
                usuario.setNome(nm.trim());
                usuario.setEmail(em.trim());

                if(controller.inserirUsuario(usuario)) {

                    nome.setText("");
                    email.setText("");
                    Toast.makeText(getApplicationContext(), "Cadastro de usuário realizado com sucesso", Toast.LENGTH_LONG).show();
                } else {

                    Toast.makeText(getApplicationContext(), "Falha ao cadastrar usuário", Toast.LENGTH_LONG).show();
                }
            }
        });

        cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
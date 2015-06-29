package br.com.hisamoto.controleTransacaoAndroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import br.com.hisamoto.controleTransacaoAndroid.activity.CadastroUsuarioActivity;
import br.com.hisamoto.controleTransacaoAndroid.activity.ListarUsuariosActivity;

public class HisamotoActivity extends Activity {

    private Button btnCadastrarUsuario;
    private Button btnListarUsuarios;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        btnCadastrarUsuario = (Button) findViewById(R.id.cadastrar_usuario);
        btnCadastrarUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent();
                i.setClass(getApplicationContext(), CadastroUsuarioActivity.class);
                startActivity(i);
            }
        });

        btnListarUsuarios = (Button) findViewById(R.id.listar_usuario);
        btnListarUsuarios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent();
                i.setClass(getApplicationContext(), ListarUsuariosActivity.class);
                startActivity(i);
            }
        });
    }
}

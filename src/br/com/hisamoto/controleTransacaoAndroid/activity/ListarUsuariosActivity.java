package br.com.hisamoto.controleTransacaoAndroid.activity;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import br.com.hisamoto.controleTransacaoAndroid.adapter.UsuarioAdapter;
import br.com.hisamoto.controleTransacaoAndroid.classes.Usuario;
import br.com.hisamoto.controleTransacaoAndroid.controller.UsuarioController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Leandro Shindi
 * @version 1.0 29/06/15.
 */
public class ListarUsuariosActivity extends ListActivity {

    private UsuarioController controller;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        controller = new UsuarioController(getApplicationContext());

        List<Usuario> listaUsuarios = new ArrayList<Usuario>();

        listaUsuarios = controller.getUsuarios();

//        listaUsuarios.add(new Usuario("ekamoto.leandro@gmail.com","Leandro", Long.parseLong("1")));
//        listaUsuarios.add(new Usuario("pry_@hotmail.com","Pri", Long.parseLong("2")));

        setListAdapter(new UsuarioAdapter(this, listaUsuarios));

    }
}
package br.com.hisamoto.controleTransacaoAndroid.controller;

import android.content.ContentValues;
import android.content.Context;
import br.com.hisamoto.controleTransacaoAndroid.classes.Usuario;
import br.com.hisamoto.controleTransacaoAndroid.model.UsuarioModel;

import java.util.List;

/**
 * @author Leandro Shindi
 * @version 1.0 29/06/15.
 */
public class UsuarioController {

    private UsuarioModel model;

    public UsuarioController(Context context) {

        model = new UsuarioModel(context);
    }

    public boolean inserirUsuario(Usuario usuario) {

        ContentValues values = new ContentValues();
        values.put("nome", usuario.getNome());
        values.put("email", usuario.getEmail());

        Boolean ret = model.inserirUsuario(values);

        return ret;
    }

    public List<Usuario> getUsuarios() {

        return model.getUsuarios();
    }
}

package br.com.hisamoto.controleTransacaoAndroid.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import br.com.hisamoto.controleTransacaoAndroid.R;
import br.com.hisamoto.controleTransacaoAndroid.classes.Usuario;

import java.util.List;

/**
 * @author Leandro Shindi
 * @version 1.0 29/06/15.
 */
public class UsuarioAdapter extends BaseAdapter {

    private Context contexto;
    private List<Usuario> itens;

    public UsuarioAdapter(Context contexto, List<Usuario> itens) {

        this.contexto = contexto;
        this.itens = itens;
    }

    @Override
    public int getCount() {

        return itens.size();
    }

    @Override
    public Object getItem(int position) {

        return itens.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Usuario usuario = itens.get(position);

        LayoutInflater inflater = (LayoutInflater) contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.lista_usuario, null);

        TextView nome = (TextView) view.findViewById(R.id.nome);
        TextView email = (TextView) view.findViewById(R.id.email);

        nome.setText("Nome: "+usuario.getNome());
        email.setText("Email: "+usuario.getEmail());

        // Zebrando a ListView
        if(position % 2 == 0) {

            view.setBackgroundColor(Color.GREEN);
        } else {

            view.setBackgroundColor(Color.BLUE);
        }

        return view;

    }
}

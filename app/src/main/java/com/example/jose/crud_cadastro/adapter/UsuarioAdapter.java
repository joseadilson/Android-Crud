package com.example.jose.crud_cadastro.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.jose.crud_cadastro.model.Usuario;

import java.util.List;

/**
 * Created by Jose on 13/12/2016.
 */

public class UsuarioAdapter extends BaseAdapter {

    private Context context;
    private List<Usuario> lista;

    public UsuarioAdapter(Context ctx, List<Usuario> usuarios){
        this.context = ctx;
        this.lista = usuarios;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
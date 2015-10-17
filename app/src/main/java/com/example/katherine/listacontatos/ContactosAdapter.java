package com.example.katherine.listacontatos;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by katherine on 16/10/15.
 */
public class ContactosAdapter extends RecyclerView.Adapter<ContactosViewHolder>{

    private final List<Contacto> contactos;
    private final Context context;

    public ContactosAdapter(Context context,List<Contacto> contactos)
    {
        this.context = context;
        this.contactos = new ArrayList<>();
        this.contactos.addAll(contactos);
    }


    @Override
    public ContactosViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.casilla_contacto,parent,false);
        ContactosViewHolder contactosViewHolder=new ContactosViewHolder(view);
        return contactosViewHolder;
    }

    @Override
    public void onBindViewHolder(ContactosViewHolder holder, int position) {

        Contacto contacto = contactos.get(position);
        holder.nombreTextView.setText(contacto.getNombre());
        holder.celularTextView.setText(contacto.getCelular());
        Picasso.with(context).load(contacto.getUrl()).into(holder.fotoImageView);
    }

    @Override
    public int getItemCount() {
        return contactos.size();
    }
}

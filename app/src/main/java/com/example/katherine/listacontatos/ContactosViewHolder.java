package com.example.katherine.listacontatos;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by katherine on 16/10/15.
 */
public class ContactosViewHolder extends RecyclerView.ViewHolder {
    public View view;
    public TextView celularTextView;
    public TextView nombreTextView;
    public ImageView fotoImageView;

    public ContactosViewHolder(View view) {

        super(view);
        this.view = view;
        celularTextView = (TextView)view.findViewById(R.id.celularTextView);
        nombreTextView = (TextView)view.findViewById(R.id.nombreTextView);
        fotoImageView = (ImageView)view.findViewById(R.id.fotoImageView);
    }
}

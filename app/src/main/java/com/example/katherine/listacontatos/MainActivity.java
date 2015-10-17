package com.example.katherine.listacontatos;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private EditText buscadorEditText;
    private TextView resultadoTextView;
    private List<Contacto> contactos;
    private ContactosAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buscadorEditText = (EditText) findViewById(R.id.buscador);
        resultadoTextView = (TextView) findViewById(R.id.resultado);

        recyclerView = (RecyclerView) findViewById(R.id.lista_contactos);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        contactos = new ArrayList<>();
        contactos.add(new Contacto("Jose", "301576889", "http://www.deculture.es/wp-content/uploads/2011/03/Deculture-Ghibli-Twitter-Avatar-11-e1315619036589.png"));
        contactos.add(new Contacto("Maria", "30078559", "http://www.deculture.es/wp-content/uploads/2011/03/Deculture-Ghibli-Twitter-Avatar-03-e1315619172826.png"));
        contactos.add(new Contacto("Jesus", "30178900", "http://www.deculture.es/wp-content/uploads/2011/03/Deculture-Ghibli-Twitter-Avatar-11-e1315619036589.png"));
        contactos.add(new Contacto("Melchor", "30167890", "http://www.deculture.es/wp-content/uploads/2011/03/Deculture-Ghibli-Twitter-Avatar-11-e1315619036589.png"));
        contactos.add(new Contacto("Anastasio", "3038766", "http://cdn1.sempretops.com/wp-content/uploads/Avatares-para-Tumblr-1.jpg"));
        contactos.add(new Contacto("Euripides", "30567654", "http://www.deculture.es/wp-content/uploads/2011/03/Deculture-Ghibli-Twitter-Avatar-11-e1315619036589.png"));
        contactos.add(new Contacto("Juan", "3034556", "http://cdn1.sempretops.com/wp-content/uploads/Avatares-para-Tumblr-1.jpg"));
        contactos.add(new Contacto("Nemesio", "3055654", "http://cdn1.sempretops.com/wp-content/uploads/Avatares-para-Tumblr-1.jpg"));
        contactos.add(new Contacto("Felipe", "30256667", "http://cdn1.sempretops.com/wp-content/uploads/Avatares-para-Tumblr-1.jpg"));
        contactos.add(new Contacto("Alex", "3014665", "http://cdn1.sempretops.com/wp-content/uploads/Avatares-para-Tumblr-1.jpg"));
        contactos.add(new Contacto("Cristian", "3059965", "http://www.deculture.es/wp-content/uploads/2011/03/Deculture-Ghibli-Twitter-Avatar-11-e1315619036589.png"));
        contactos.add(new Contacto("Patrick", "30599543", "http://www.deculture.es/wp-content/uploads/2011/03/Deculture-Ghibli-Twitter-Avatar-03-e1315619172826.png"));

        adapter = new ContactosAdapter(this, contactos);
        recyclerView.setAdapter(adapter);


        buscadorEditText.addTextChangedListener(new TextWatcher() {
                                                    @Override
                                                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                                                    }

                                                    @Override
                                                    public void onTextChanged(CharSequence s, int start, int before, int count) {
                                                        String nombre = buscadorEditText.getText().toString();

                                                        List<Contacto> contactoCopia = new ArrayList<Contacto>();

                                                        for (int i = 0; i < contactos.size(); i++) {
                                                            if (contactos.get(i).getNombre().toLowerCase().contains(nombre.toLowerCase())) {
                                                                contactoCopia.add(contactos.get(i));
                                                            }
                                                        }

                                                        adapter.update(contactoCopia);

                                                    }

                                                    public void afterTextChanged(Editable s) {

                                                    }
                                                }


        );


    }


}






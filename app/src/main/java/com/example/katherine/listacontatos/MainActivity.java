package com.example.katherine.listacontatos;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView)findViewById(R.id.lista_contactos);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        List<Contacto> contactos=new ArrayList<>();
        contactos.add(new Contacto("Jose","301576889","http://www.deculture.es/wp-content/uploads/2011/03/Deculture-Ghibli-Twitter-Avatar-11-e1315619036589.png"));
        contactos.add(new Contacto("Maria","30078559",""));
        contactos.add(new Contacto("Jesus","30178900","http://www.deculture.es/wp-content/uploads/2011/03/Deculture-Ghibli-Twitter-Avatar-11-e1315619036589.png"));
        contactos.add(new Contacto("Melchor","30167890","http://www.deculture.es/wp-content/uploads/2011/03/Deculture-Ghibli-Twitter-Avatar-11-e1315619036589.png"));
        contactos.add(new Contacto("Anastasio","3038766",""));
        contactos.add(new Contacto("Euripides","30567654","http://www.deculture.es/wp-content/uploads/2011/03/Deculture-Ghibli-Twitter-Avatar-11-e1315619036589.png"));
        contactos.add(new Contacto("Juan","3034556",""));
        contactos.add(new Contacto("Nemesio","3055654",""));
        contactos.add(new Contacto("Felipe","30256667",""));
        contactos.add(new Contacto("Alex","3014665",""));
        contactos.add(new Contacto("Cristian","3059965","http://www.deculture.es/wp-content/uploads/2011/03/Deculture-Ghibli-Twitter-Avatar-11-e1315619036589.png"));
        contactos.add(new Contacto("Patrick","30599543",""));
    }


}

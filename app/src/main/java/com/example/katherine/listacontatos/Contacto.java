package com.example.katherine.listacontatos;

/**
 * Created by katherine on 16/10/15.
 */
public class Contacto {

    private String nombre;
    private String celular;
    private String url;

    public Contacto (String nombre,String celular,String url)
    {
        this.nombre = nombre;
        this.celular = celular;
        this.url=url;

    }


    public String getNombre() {
        return nombre;
    }

    public String getCelular() {
        return celular;
    }

    public String getUrl() {
        return url;
    }
}

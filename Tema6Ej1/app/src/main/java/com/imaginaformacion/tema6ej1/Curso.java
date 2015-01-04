package com.imaginaformacion.tema6ej1;

import android.graphics.drawable.Drawable;

public class Curso{

    private String titulo;
    private String descripcion;
    private Drawable imagen;
    private String url;

    public Curso(String titulo, String descripcion, Drawable imagen, String url) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.url = url;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Drawable getImagen() {
        return imagen;
    }

    public String getUrl() {
        return url;
    }

}

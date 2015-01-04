package com.imaginaformacion.tema6ej1;


import android.content.Context;

import java.util.ArrayList;

public class DataManager {

    private static DataManager dataManager;
    private ArrayList<Curso> cursosWeb;
    private ArrayList<Curso> cursosMobile;


    public static DataManager getInstance(){
        if(dataManager == null)
            dataManager = new DataManager();
        return dataManager;
    }

    public ArrayList<Curso> getData(Context context, int selection){
        switch (selection){
            case 0:
                return getCursosMobile(context);
            case 1:
                return getCursosWeb(context);
            default:
                return new ArrayList<Curso>();
        }

    }

    private ArrayList<Curso> getCursosWeb(Context context){
        if(cursosWeb == null){
            cursosWeb = new ArrayList<Curso>();
            cursosWeb.add(new Curso(context.getString(R.string.curso3title), context.getString(R.string.curso3description), context.getDrawable(R.drawable.curso3drawable),context.getString(R.string.curso3url)));
            cursosWeb.add(new Curso(context.getString(R.string.curso6title), context.getString(R.string.curso6description), context.getDrawable(R.drawable.curso6drawable),context.getString(R.string.curso6url)));
        }
        return cursosWeb;
    }

    private ArrayList<Curso> getCursosMobile(Context context){
        if(cursosMobile == null){
            cursosMobile = new ArrayList<Curso>();
            cursosMobile.add(new Curso(context.getString(R.string.curso1title), context.getString(R.string.curso1description), context.getDrawable(R.drawable.curso1drawable),context.getString(R.string.curso1url)));
            cursosMobile.add(new Curso(context.getString(R.string.curso2title), context.getString(R.string.curso2description), context.getDrawable(R.drawable.curso2drawable),context.getString(R.string.curso2url)));
            cursosMobile.add(new Curso(context.getString(R.string.curso4title), context.getString(R.string.curso4description), context.getDrawable(R.drawable.curso4drawable),context.getString(R.string.curso4url)));
            cursosMobile.add(new Curso(context.getString(R.string.curso5title), context.getString(R.string.curso5description), context.getDrawable(R.drawable.curso5drawable),context.getString(R.string.curso5url)));
        }
        return cursosMobile;
    }
}

package com.imaginaformacion.tema6ej1;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by eliseo on 21/11/14.
 */

public class PlaceholderFragment extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";

    public static PlaceholderFragment newInstance(int sectionNumber) {
        PlaceholderFragment fragment = new PlaceholderFragment();
        //TODO Crear un nuevo Bundle para ese fragment.
        //TODO Almacenar un entero con la clave ARG_SECTION_NUMBER yel valor sectionNumber
        //TODO Añade el bundle al fragment como Argumentos

        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);


        return fragment;
    }

    public PlaceholderFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        ArrayList<Curso> cursos = new ArrayList<Curso>();
        int selection;

        //TODO Obtén el valor entero almacenado en los argumentos del fragment que corresponde a ARG_SECTION_NUMBER
        //TODO Obtén el ArrayList<Curso> usando DataManager.getInstance().getData(context, El numero de selección)
        selection = getArguments().getInt(ARG_SECTION_NUMBER);
        cursos = DataManager.getInstance().getData(getActivity(), selection);


        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerView);
        MyRecyclerAdapter adapter = new MyRecyclerAdapter(getActivity(), cursos, R.layout.card);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        return rootView;
    }
}


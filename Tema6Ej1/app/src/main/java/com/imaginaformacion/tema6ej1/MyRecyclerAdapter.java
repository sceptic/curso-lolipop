package com.imaginaformacion.tema6ej1;

import android.app.Activity;
import android.app.DialogFragment;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.ViewHolder> {

    private List<Curso> items;
    private int itemLayout;
    private Context context;

    public MyRecyclerAdapter(Context context, List<Curso> items, int itemLayout) {
        this.context = context;
        this.items = items;
        this.itemLayout = itemLayout;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(itemLayout, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Curso item = items.get(position);
        holder.title.setText(item.getTitulo());
        holder.description.setText(item.getDescripcion());
        holder.image.setImageDrawable(item.getImagen());
        holder.info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchDialog(item);
            }
        });
        holder.itemView.setTag(item);
    }

    public void launchDialog(Curso curso){

        //TODO Ejercicio 2
        //Crear un DialogFragment e instanciarlo enviándole el curso
        //Mostrar fragment

    }

    public void add(Curso item, int position) {
        items.add(position, item);
        notifyItemInserted(position);
    }

    public void remove(Curso item) {
        int position = items.indexOf(item);
        items.remove(position);
        notifyItemRemoved(position);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView image;
        public TextView title;
        public TextView description;
        public Button info;

        public ViewHolder(View itemView) {
            super(itemView);
            image = (ImageView) itemView.findViewById(R.id.imageViewRow);
            title = (TextView) itemView.findViewById(R.id.textViewRowTitle);
            description = (TextView) itemView.findViewById(R.id.textViewRowDescription);
            info = (Button) itemView.findViewById(R.id.buttonRowInfo);
        }
    }
}

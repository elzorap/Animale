package com.example.animale;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CainiAdapter extends RecyclerView.Adapter<CainiAdapter.ItemViewHolder> {

    ArrayList<Caini> listaCaini;

    public CainiAdapter(ArrayList<Caini> lista) {
        this.listaCaini = lista;
    }


    @NonNull
    @Override
    public CainiAdapter.ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.caini_row, parent, false);
        return new ItemViewHolder(v);
    }

    @Override
    public int getItemCount() {
        return listaCaini.size();
    }

    static class ItemViewHolder extends RecyclerView.ViewHolder {

        ImageView img;
        TextView rasa;
        TextView nume;
        TextView varsta;
        TextView descriere;

        ItemViewHolder(@NonNull View view) {
            super(view);
            img = view.findViewById(R.id.ivCaini);
            rasa = view.findViewById(R.id.tvRasaCaine);
            nume = view.findViewById(R.id.tvNumeCaine);
            varsta = view.findViewById(R.id.tvVarstaCaine);
            descriere = view.findViewById(R.id.tvDescriereCaine);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull final ItemViewHolder holder, final int position) {

        Caini caini = listaCaini.get(position);
        
        Picasso.get().load(caini.getImg()).into(holder.img);
        holder.rasa.setText(caini.getRasa());
        holder.nume.setText(caini.getNume());
        holder.varsta.setText(String.valueOf(caini.getVarsta()));
        holder.descriere.setText(caini.getDescriere());

    }

}


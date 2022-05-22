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

public class PisiciAdapter extends RecyclerView.Adapter<PisiciAdapter.ItemViewHolder> {

    ArrayList<Pisici> listaPisici;

    public PisiciAdapter(ArrayList<Pisici> lista) {
        this.listaPisici = lista;
    }



    @NonNull
    @Override
    public PisiciAdapter.ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.pisici_row, parent, false);
        return new ItemViewHolder(v);
    }

    @Override
    public int getItemCount() {
        return listaPisici.size();
    }


    static class ItemViewHolder extends RecyclerView.ViewHolder {

        ImageView img;
        TextView rasa;
        TextView varsta;
        TextView nume;

        ItemViewHolder(@NonNull View view) {
            super(view);
            img = view.findViewById(R.id.ivPisici);
            rasa = view.findViewById(R.id.tvRasaPisica);
            varsta = view.findViewById(R.id.tvVarstaPisica);
            nume = view.findViewById(R.id.tvNumePisica);
        }
    }

    @Override
    public void onBindViewHolder(final ItemViewHolder holder, final int position) {

        Pisici pisici = listaPisici.get(position);

        Picasso.get().load(pisici.getImg()).into(holder.img);
        holder.rasa.setText(pisici.getRasa());
        holder.varsta.setText(String.valueOf(pisici.getVarsta()));
        holder.nume.setText(pisici.getNume());

    }

}



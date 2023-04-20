package com.example.listapersonas;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PersonaAdapter extends RecyclerView.Adapter<PersonaViewHolder> {
    private List<Persona> listaPersonas;

    public PersonaAdapter(List<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    @NonNull
    @Override
    public PersonaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.persona, parent, false);
        return new PersonaViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonaViewHolder holder, int position) {
        Persona persona = listaPersonas.get(position);
        holder.bind(persona);
    }

    @Override
    public int getItemCount() {
        return listaPersonas.size();
    }
}

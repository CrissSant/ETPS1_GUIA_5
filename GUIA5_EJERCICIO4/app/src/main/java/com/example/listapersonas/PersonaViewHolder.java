package com.example.listapersonas;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PersonaViewHolder extends RecyclerView.ViewHolder {
    private TextView nombreTextView;
    private TextView edadTextView;
    private TextView direccionTextView;

    public PersonaViewHolder(@NonNull View itemView) {
        super(itemView);
        nombreTextView = itemView.findViewById(R.id.nombreTextView);
        edadTextView = itemView.findViewById(R.id.edadTextView);
        direccionTextView = itemView.findViewById(R.id.direccionTextView);
    }

    public void bind(Persona persona) {
        nombreTextView.setText(persona.getNombre());
        edadTextView.setText(String.valueOf(persona.getEdad()));
        direccionTextView.setText(persona.getDireccion());
    }
}

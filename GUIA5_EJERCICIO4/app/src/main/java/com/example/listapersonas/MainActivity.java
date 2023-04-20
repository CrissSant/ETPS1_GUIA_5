package com.example.listapersonas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PersonaAdapter personaAdapter;
    private List<Persona> listaPersonas;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rcview);

        listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("Juan", 25, "Calle 1 #123"));
        listaPersonas.add(new Persona("María", 30, "Calle 2 #456"));
        listaPersonas.add(new Persona("Pedro", 20, "Calle 3 #789"));

        personaAdapter = new PersonaAdapter(listaPersonas);
        recyclerView.setAdapter(personaAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}

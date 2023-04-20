package com.example.listafrutas;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Frutas> listaFrutas;
    ListView lv1;
    Integer[] imgFrutas = {
            R.drawable.bananno,
            R.drawable.cereza,
            R.drawable.ciruela,
            R.drawable.durazno,
            R.drawable.frambuesa,
            R.drawable.fresas,
            R.drawable.higo,
            R.drawable.kiwi,
            R.drawable.mandarina,
            R.drawable.manzana,
            R.drawable.manzanaverde,
            R.drawable.melon,
            R.drawable.naranja,
            R.drawable.nispero,
            R.drawable.olivo,
            R.drawable.pera,
            R.drawable.pina,
            R.drawable.sandia,
            R.drawable.uvas
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaFrutas = new ArrayList<Frutas>();

        listaFrutas.add(new Frutas("Bananas"));
        listaFrutas.add(new Frutas("Cereza"));
        listaFrutas.add(new Frutas("Ciruela"));
        listaFrutas.add(new Frutas("Durazno"));
        listaFrutas.add(new Frutas("Frambuesa"));
        listaFrutas.add(new Frutas("Fresas"));
        listaFrutas.add(new Frutas("Higo"));
        listaFrutas.add(new Frutas("Kiwi"));
        listaFrutas.add(new Frutas("Mandarina"));
        listaFrutas.add(new Frutas("Manzana"));
        listaFrutas.add(new Frutas("Manzana Verde"));
        listaFrutas.add(new Frutas("Melon"));
        listaFrutas.add(new Frutas("Naramja"));
        listaFrutas.add(new Frutas("Nispero"));
        listaFrutas.add(new Frutas("Olivo"));
        listaFrutas.add(new Frutas("Pera"));
        listaFrutas.add(new Frutas("Pina"));
        listaFrutas.add(new Frutas("Sandia"));
        listaFrutas.add(new Frutas("Uvas"));

        AdaptadorPersonas adaptador = new AdaptadorPersonas(this, R.layout.frutas, listaFrutas);
        lv1 = findViewById(R.id.list1);
        lv1.setAdapter(adaptador);
    }

    public class AdaptadorPersonas extends ArrayAdapter<Frutas> {
        AppCompatActivity appCompatActivity;

        AdaptadorPersonas(AppCompatActivity context, int resource, ArrayList<Frutas> objects) {
            super(context, resource, objects);
            appCompatActivity = context;
        }

        @Override
        public int getCount() {
            return listaFrutas.size();
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = appCompatActivity.getLayoutInflater();
            View item = inflater.inflate(R.layout.frutas, null);

            TextView textView1 = item.findViewById(R.id.textView);
            textView1.setText(listaFrutas.get(position).getFruitName());

            return item;
        }
    }
}

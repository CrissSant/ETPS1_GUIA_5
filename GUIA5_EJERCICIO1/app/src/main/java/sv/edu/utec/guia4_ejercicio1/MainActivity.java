package sv.edu.utec.guia4_ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Personas> listapersonas;
    ListView lv1;
    Integer[]ImgPpersonas={
            R.drawable.ana,
            R.drawable.carlos,
            R.drawable.fernanda,
            R.drawable.gustavo,
            R.drawable.jose,
            R.drawable.juan,
            R.drawable.carla,
            R.drawable.luis,
            R.drawable.maria,
            R.drawable.marta

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listapersonas=new ArrayList<Personas>();
        listapersonas.add(new Personas("ana",'f'));
        listapersonas.add(new Personas("carlos",'m'));
        listapersonas.add(new Personas("fernanda",'f'));
        listapersonas.add(new Personas("gustavo",'m'));
        listapersonas.add(new Personas("jose",'m'));
        listapersonas.add(new Personas("Juan", 'm'));
        listapersonas.add(new Personas("karla",'f'));
        listapersonas.add(new Personas("luis",'m'));
        listapersonas.add(new Personas("maria",'f'));
        listapersonas.add(new Personas("marta",'f'));
        listapersonas.add(new Personas("pedro",'m'));
        listapersonas.add(new Personas("silvia",'f'));
        AdaptadorPersonas adaptador = new AdaptadorPersonas(this);
        lv1 = findViewById(R.id.lvPersonas);
        lv1.setAdapter(adaptador);
    }
    class AdaptadorPersonas extends ArrayAdapter<Personas> {
        AppCompatActivity appCompatActivity;
        AdaptadorPersonas(AppCompatActivity context) {
            super(context, R.layout.persona, listapersonas);
            appCompatActivity = context;
        }
        public View getView(int position, View convertView, ViewGroup parent)
        {
            LayoutInflater inflater = appCompatActivity.getLayoutInflater();
            View item = inflater.inflate(R.layout.persona, null);
            TextView textView1 = item.findViewById(R.id.tvNombre);
            textView1.setText(listapersonas.get(position).getNombre());
            ImageView imageView1 = item.findViewById(R.id.imvFoto);
            imageView1.setImageResource(ImgPpersonas[position]);
            return(item);
        }
    }
}

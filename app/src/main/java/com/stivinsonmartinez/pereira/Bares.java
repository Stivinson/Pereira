package com.stivinsonmartinez.pereira;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Bares extends AppCompatActivity {


    ArrayAdapter<String> adaptador;
    ListView listNombres;
    int opc=0;

    private Lista_Bares[] datos =
            new Lista_Bares[] {
                    new Lista_Bares(R.drawable.candidabar, "Candida Bar", "Avenida Circunvalar No. 8-136 Esquina",R.drawable.flechas),
                    new Lista_Bares(R.drawable.beerpub, "The Beer Pub", "Carrera 5 No. 23-32",R.drawable.flechas),
                    new Lista_Bares(R.drawable.akbar, "AK Bar", "Avenida Circunvalar No. 7-19",R.drawable.flechas),
                    new Lista_Bares(R.drawable.barcelona,"Barcelona Bar","Calle 13 No. 1-76 (Parque La Rebeca)",R.drawable.flechas),
                    new Lista_Bares(R.drawable.pizzabar, "Pizza Y Birra","C.C.Pereira Plaza. Local-5r",R.drawable.flechas)};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bares);

        Adapter adaptador = new Adapter(this,datos);

        listNombres = (ListView) findViewById(R.id.listbares);

        listNombres.setAdapter(adaptador);

     listNombres.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                opc=(int)parent.getItemIdAtPosition(position);
                switch (opc){
                    case 0:
                        startActivity(new Intent(getApplicationContext(), AnaBotella.class));

                        break;
                    case 1:
                        startActivity(new Intent(getApplicationContext(), beerpub.class));
                        break;
                    case 2:
                        startActivity(new Intent(getApplicationContext(), akbar.class));
                        break;
                    case 3:
                        startActivity(new Intent(getApplicationContext(), barcelona.class));
                        break;
                    case 4:
                        startActivity(new Intent(getApplicationContext(), pizzabar.class));
                        break;
                    default:
                        break;
                }

            }
        });

    }


    public class Adapter extends ArrayAdapter<Lista_Bares> {

        public Adapter(Context context, Lista_Bares[] datos) {
            super(context, R.layout.activity_bares, datos);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater inflater = LayoutInflater.from(getContext());
            View item = inflater.inflate(R.layout.activity_bares2, null);

            TextView direccion = (TextView) item.findViewById(R.id.tdireccion);
            direccion.setText(datos[position].getDireccion());

            ImageView imagen = (ImageView) item.findViewById(R.id.imagen);
            imagen.setImageResource(datos[position].getIdImagen());

            TextView informacion = (TextView) item.findViewById(R.id.tinformacion);
            informacion.setText(datos[position].getInformacion());

            ImageView imagenflechas = (ImageView) item.findViewById(R.id.imagenflechas);
            imagenflechas.setImageResource(datos[position].getFlechaImagen());

            return item;
        }
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_menu) {
            Toast.makeText(this, "Menu", Toast.LENGTH_SHORT).show();
            Intent i =new Intent(this,MainActivity.class);
            startActivity(i);
            return true;
        }
        if (id == R.id.action_about) {
            Toast.makeText(this, "Acerca De", Toast.LENGTH_SHORT).show();
            Intent i =new Intent(this,About.class);
            startActivity(i);
            return true;
        }
        if (id == R.id.action_publicidad) {
            Toast.makeText(this, "Publicidad", Toast.LENGTH_SHORT).show();
            Intent i =new Intent(this,Publicidad.class);
            startActivity(i);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

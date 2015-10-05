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

public class Hoteles extends AppCompatActivity {


    ArrayAdapter<String> adaptadorH;
    ListView listNombresH;
    int opc=0;

    private Lista_Hoteles[] datosH =
            new Lista_Hoteles[] {
                    new Lista_Hoteles(R.drawable.sansimon, "San Simon", "Calle 19 No. 7-41 Plaza de Bolívar",R.drawable.flechas),
                    new Lista_Hoteles(R.drawable.soratama, "Soratama Hotel", "Carrera 7 No. 19-20 Plaza de Bolívar",R.drawable.flechas),
                    new Lista_Hoteles(R.drawable.pinares, "Pinares Plaza", " Avenida Ricaurte No. 9-20 ",R.drawable.flechas),
                    new Lista_Hoteles(R.drawable.elgranhotel,"El Gran Hotel","Calle 19 No. 9-19",R.drawable.flechas),
                    new Lista_Hoteles(R.drawable.abadiaplazapereira, "Abadia Plaza","Carrera 8 No. 21-67",R.drawable.flechas)};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteles);

        Adapter adaptadorH = new Adapter(this,datosH);

        listNombresH = (ListView) findViewById(R.id.listhotelesH);

        listNombresH.setAdapter(adaptadorH);

        listNombresH.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                 opc=(int)parent.getItemIdAtPosition(position);
                switch (opc){
                    case 0:
                        startActivity(new Intent(getApplicationContext(), SanSimon.class));

                        break;
                    case 1:
                        startActivity(new Intent(getApplicationContext(), Soratama.class));
                        break;
                    case 2:
                        startActivity(new Intent(getApplicationContext(), Pinares.class));
                        break;
                    case 3:
                        startActivity(new Intent(getApplicationContext(), ElGranHotel.class));
                        break;
                    case 4:
                        startActivity(new Intent(getApplicationContext(), AbadiaPlaza.class));
                        break;
                    default:
                        break;
                }

            }
        });

    }


    public class Adapter extends ArrayAdapter<Lista_Hoteles> {

        public Adapter(Context context, Lista_Hoteles[] datosH) {
            super(context, R.layout.activity_hoteles, datosH);
        }



        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater inflater = LayoutInflater.from(getContext());
            View item = inflater.inflate(R.layout.activity_hoteles2, null);

            TextView direccionH = (TextView) item.findViewById(R.id.tdireccionH);
            direccionH.setText(datosH[position].getDireccionH());

            ImageView imagenH = (ImageView) item.findViewById(R.id.imagenH);
            imagenH.setImageResource(datosH[position].getIdImagenH());

            TextView informacionH = (TextView) item.findViewById(R.id.tinformacionH);
            informacionH.setText(datosH[position].getInformacionH());

            ImageView imagenflechasH = (ImageView) item.findViewById(R.id.imagenflechasH);
            imagenflechasH.setImageResource(datosH[position].getFlechaImagenH());

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

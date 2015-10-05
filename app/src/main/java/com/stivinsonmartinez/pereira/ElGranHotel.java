package com.stivinsonmartinez.pereira;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class ElGranHotel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_el_gran_hotel);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_el_gran_hotel, menu);
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

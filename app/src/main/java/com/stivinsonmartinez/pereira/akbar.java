package com.stivinsonmartinez.pereira;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class akbar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_akbar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == R.id.action_menu) {
            Intent i =new Intent(this,MainActivity.class);
            startActivity(i);
            return true;
        }
        if (id == R.id.action_about) {
            Intent i =new Intent(this,About.class);
            startActivity(i);
            return true;
        }
        if (id == R.id.action_publicidad) {
            Intent i =new Intent(this,Publicidad.class);
            startActivity(i);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

package com.example.optionsmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.itemNuevo:
                Toast.makeText(this, "Nuevo", Toast.LENGTH_SHORT).show();
                break;
            case R.id.itemOpciones:
                Toast.makeText(this, "Opciones", Toast.LENGTH_SHORT).show();
                break;
            case R.id.itemAyuda:
                Toast.makeText(this, "Ayuda", Toast.LENGTH_SHORT).show();
                break;
            case R.id.itemSalir:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
package com.example.macalculatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private double val1;
    private double val2;
    private double rest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Additioner(View maCalculatriceVue) {
        EditText val1TxtV =(EditText) findViewById(R.id.valeur1);
        EditText val2TxtV =(EditText) findViewById(R.id.valeur2);
        val1 = Double.parseDouble(val1TxtV.getText().toString());
        val2 = Double.parseDouble(val2TxtV.getText().toString());
        rest = val1+val2;

        Intent mesResultatsVue = new Intent(this, MesResultatsVue.class);
        mesResultatsVue.putExtra("OPERATION", "Somme");
        mesResultatsVue.putExtra("VAL1", val1);
        mesResultatsVue.putExtra("VAL2", val2);
        mesResultatsVue.putExtra("REST", rest);
        startActivity(mesResultatsVue);
    }

    public void Substraire(View maCalculatriceVue) {
        EditText val1TxtV =(EditText) findViewById(R.id.valeur1);
        EditText val2TxtV =(EditText) findViewById(R.id.valeur2);
        val1 = Double.parseDouble(val1TxtV.getText().toString());
        val2 = Double.parseDouble(val2TxtV.getText().toString());
        rest = val1-val2;

        Intent mesResultatsVue = new Intent(this, MesResultatsVue.class);
        mesResultatsVue.putExtra("OPERATION", "Somme");
        mesResultatsVue.putExtra("VAL1", val1);
        mesResultatsVue.putExtra("VAL2", val2);
        mesResultatsVue.putExtra("REST", rest);
        startActivity(mesResultatsVue);
    }

    public void Multiplier(View maCalculatriceVue) {
        EditText val1TxtV =(EditText) findViewById(R.id.valeur1);
        EditText val2TxtV =(EditText) findViewById(R.id.valeur2);
        val1 = Double.parseDouble(val1TxtV.getText().toString());
        val2 = Double.parseDouble(val2TxtV.getText().toString());
        rest = val1*val2;

        Intent mesResultatsVue = new Intent(this, MesResultatsVue.class);
        mesResultatsVue.putExtra("OPERATION", "Somme");
        mesResultatsVue.putExtra("VAL1", val1);
        mesResultatsVue.putExtra("VAL2", val2);
        mesResultatsVue.putExtra("REST", rest);
        startActivity(mesResultatsVue);
    }

    public void Diviser(View maCalculatriceVue) {
        EditText val1TxtV =(EditText) findViewById(R.id.valeur1);
        EditText val2TxtV =(EditText) findViewById(R.id.valeur2);
        val1 = Double.parseDouble(val1TxtV.getText().toString());
        val2 = Double.parseDouble(val2TxtV.getText().toString());
        rest = val1/val2;

        Intent mesResultatsVue = new Intent(this, MesResultatsVue.class);
        mesResultatsVue.putExtra("OPERATION", "Somme");
        mesResultatsVue.putExtra("VAL1", val1);
        mesResultatsVue.putExtra("VAL2", val2);
        mesResultatsVue.putExtra("REST", rest);
        startActivity(mesResultatsVue);
    }
}

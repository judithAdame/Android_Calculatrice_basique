package com.example.macalculatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MesResultatsVue extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mes_resultats_vue);

        TextView valeurs = (TextView) findViewById(R.id.txtValeurs);

        Intent monIntent = getIntent();
        String strOperation = ((Intent) monIntent).getStringExtra("OPERATION");
        double val1 = ((Intent) monIntent).getDoubleExtra("VAL1",0);
        double val2 = ((Intent) monIntent).getDoubleExtra("VAL2", 0);
        double rest = ((Intent) monIntent).getDoubleExtra("REST",0);

        String strValeurs= "La " + strOperation + " de " + val1 + " et " + val2 + " est : ";

        TextView txtValeurs = (TextView) findViewById(R.id.txtValeurs);
        txtValeurs.setText(strValeurs);

        TextView txtResultat = (TextView) findViewById(R.id.txtResultat);
        txtResultat.setText(String.valueOf(rest));
    }
}

package com.clair.ecda.pidelectronics_3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    TextView txtDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        txtDatos = (TextView)findViewById(R.id.txt_segunda_datos);

        Intent intento = getIntent();
        Bundle extras = intento.getExtras();
        String datos = extras.getString("mexico");

        txtDatos.setText(datos);
    }
}

package com.clair.ecda.pidelectronics_3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String TAG = "TagDeErick", datos;
    EditText editTextDatos;
    Button btnDos, btnTres, btnScroll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDos = (Button)findViewById(R.id.btn_main_irdos);
        btnTres = (Button)findViewById(R.id.btn_main_irTres);
        btnScroll = (Button)findViewById(R.id.btn_scrollActivity);

        editTextDatos = (EditText)findViewById(R.id.edt_main_datos);

    }

    @Override
    protected void onResume() {
        super.onResume();

        btnDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datos = editTextDatos.getText().toString();
                Intent intent = new Intent(MainActivity.this, SegundaActivity.class);
                intent.putExtra("mexico", datos);
                startActivity(intent);
            }
        });

        btnTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TerceraActivity.class);
                startActivity(intent);
            }
        });

        btnScroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ScrollActivity.class);
                startActivity(intent);
            }
        });
    }
}

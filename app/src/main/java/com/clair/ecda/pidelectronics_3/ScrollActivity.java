package com.clair.ecda.pidelectronics_3;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ScrollActivity extends AppCompatActivity {
    ListView listaPaises;
    ArrayList<String> arrayPaises;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll);
        context = ScrollActivity.this;

        listaPaises = (ListView)findViewById(R.id.LVP);

        arrayPaises = new ArrayList<>();

        arrayPaises.add("Mexico");
        arrayPaises.add("Estados Unidos");
        arrayPaises.add("Canada");
        arrayPaises.add("Brazil");
        arrayPaises.add("Japon");
        arrayPaises.add("Belgica");
        arrayPaises.add("Alemania");
        arrayPaises.add("Francia");
        arrayPaises.add("Rusia");
        arrayPaises.add("Argentina");
        arrayPaises.add("Egipto");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(context,android.R.layout.simple_list_item_1, arrayPaises);
        listaPaises.setAdapter(adapter);
    }
}

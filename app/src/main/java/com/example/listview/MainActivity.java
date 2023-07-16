package com.example.listview;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
  ListView listView;
    ArrayList<String> arrNames = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        arrNames.add("shivank");
        arrNames.add("Bhatii");
        arrNames.add("helo");
        arrNames.add("hey");
        arrNames.add("hey1");
        arrNames.add("hey3");
        arrNames.add("hey2");
        arrNames.add("hey4");
        arrNames.add("hey5");
        arrNames.add("hey6");
        arrNames.add("hey5");
        arrNames.add("heyf");
        arrNames.add("heyf");
        arrNames.add("heyf");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplication(), android.R.layout.simple_list_item_1,arrNames);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener((parent, view, position, id) -> {
            if (position==0) {
                Toast.makeText(MainActivity.this, "Click first item", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
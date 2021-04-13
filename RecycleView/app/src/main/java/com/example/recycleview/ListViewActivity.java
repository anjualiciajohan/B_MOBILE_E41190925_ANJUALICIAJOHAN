package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {


    private ListView listViewCountry;
    private ArrayAdapter<CharSequence>adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);


    listViewCountry = findViewById(R.id.list_view_country);
        adapter = ArrayAdapter.createFromResource(this, R.array.country_list, android.R.layout.simple_list_item_1);
        listViewCountry.setAdapter(adapter);
        listViewCountry.setOnItemClickListener(this);
    
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, adapter.getItem(position), Toast.LENGTH_SHORT).show();
    }
}
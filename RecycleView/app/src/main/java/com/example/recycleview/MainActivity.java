package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button btnlistView;
    private Button btnRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnlistView = findViewById(R.id.btn_list_view);
        btnRecyclerView= findViewById(R.id.btn_Recycler_view);

        btnlistView.setOnClickListener(v ->  {
            startActivity(new Intent(MainActivity.this, ListViewActivity.class));
        });
        btnRecyclerView.setOnClickListener(v ->  {
            startActivity(new Intent(MainActivity.this, RecycleViewActivity.class));
        });
    }
}
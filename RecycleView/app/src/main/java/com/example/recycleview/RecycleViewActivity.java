package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class RecycleViewActivity extends AppCompatActivity {


    private RecyclerView rvMahasiswa;
    private MahasiswaAdapter adapterMahasiswa;
    private ArrayList<Mahasiswa>mDataMahasiswa;
    private Object Mahasiswa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);

        addData();

        adapterMahasiswa = new MahasiswaAdapter(mDataMahasiswa);

        rvMahasiswa = findViewById(R.id.rv_mahasiswa);
        rvMahasiswa.setLayoutManager(new LinearLayoutManager(this));
        rvMahasiswa.setAdapter(adapterMahasiswa);

    }

    private void addData (){
        mDataMahasiswa = ArrayList<Mahasiswa>();
        mDataMahasiswa.add(new Mahasiswa("Anju Alicia","E41190925","081232230124"));

    }
}
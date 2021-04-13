package com.example.fragmentexample;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    Button firstFragment, secondFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstFragment = (Button) findViewById(R.id.firstFragment);
        secondFragment = (Button) findViewById(R.id.secondFragment);
        //onClickListener
        firstFragment.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                loadFragment(new FirstFragment());
            }
        });
        // onClick tombol kedua
        secondFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new SecondFragment());
            }
        });
    }
    private void loadFragment(Fragment fragment){
        // membuat FragmentManager
        FragmentManager fm = getFragmentManager();
        // membuat FragmentTransaction untuk memulai transaksi dan replace
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        //replace framelayout dengan fragment baru
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit(); // menyimpan perubahan
    }
}
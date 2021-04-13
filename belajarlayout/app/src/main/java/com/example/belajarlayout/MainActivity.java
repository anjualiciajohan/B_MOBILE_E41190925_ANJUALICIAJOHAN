package com.example.belajarlayout;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btn1(View view) {
        Intent tb1 = new Intent(MainActivity.this, LinearLayout.class);
        startActivity(tb1);
    }
    public void btn22(View view) {
        Intent tb22 = new Intent(MainActivity.this, RelativeLayoutActivity.class);
        startActivity(tb22);
    }
    public void btn3(View view) {
        Intent tb3 = new Intent(MainActivity.this, ConstraintLayoutActivity.class);
        startActivity(tb3);
    }

    public void btn4(View view) {
        Intent tb4 = new Intent(MainActivity.this, FrameLayoutActivity.class);
        startActivity(tb4);
    }

    public void btn5(View view) {
        Intent tb5 = new Intent(MainActivity.this, TabelLayoutActivity.class);
        startActivity(tb5);
    }

    public void btn6(View view) {
        Intent tb6 = new Intent (MainActivity.this, MaterialDesignActivity.class);
        startActivity(tb6);
    }

    public void btn7(View view) {
        Intent tb7 = new Intent (MainActivity.this, Scorllview.class );
        startActivity(tb7);
    }

    public void btn8(View view) {
        Intent tb8 = new Intent (MainActivity.this, Scrollviewhorizontal.class);
        startActivity(tb8);
    }
}


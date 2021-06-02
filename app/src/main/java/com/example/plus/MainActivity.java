package com.example.plus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView p, l, u, s;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        p = findViewById(R.id.splashP);
        l = findViewById(R.id.splashL);
        u = findViewById(R.id.splashU);
        s = findViewById(R.id.splashS);

        //down
        l.setTranslationY(-1500);
        l.animate().translationYBy(1500).setDuration(1000);

        s.setTranslationY(-1500);
        s.animate().translationYBy(1500).setDuration(1400);


        //up
        p.setTranslationY(1500);
        p.animate().translationYBy(-1500).setDuration(900);

        u.setTranslationY(1500);
        u.animate().translationYBy(-1500).setDuration(1200);
    }
}
package com.example.java_aplikacja;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WprowadzCwiczeniaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wprowadz_cwiczenia);
    }

    public void reakcjaNastepneĆwiczenie(View v) {
        Intent i = new Intent(this, wprowadzCwiczenia.class);
        startActivity(i);
    }
    
}
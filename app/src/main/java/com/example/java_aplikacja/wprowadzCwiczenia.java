package com.example.java_aplikacja;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.example.java_aplikacja.databinding.ActivityWprowadzCwiczenia2Binding;

public class wprowadzCwiczenia extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wprowadz_cwiczenia2);
    }


    public void reakcjaPoprzednieĆwiczenie(View v) {
        Intent i = new Intent(this, WprowadzCwiczeniaActivity.class);
        startActivity(i);
    }
}
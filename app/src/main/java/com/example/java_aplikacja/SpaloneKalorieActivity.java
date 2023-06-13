package com.example.java_aplikacja;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SpaloneKalorieActivity extends AppCompatActivity {

    private EditText numberEditText;
    private TextView resultTextView;
    private Button addButton;

    private int accumulatedSum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spalone_kalorie);

        numberEditText = findViewById(R.id.numberEditText);
        resultTextView = findViewById(R.id.resultTextView);
        addButton = findViewById(R.id.addbuton);

        accumulatedSum = 0;

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String enteredNumber = numberEditText.getText().toString();
                int number = Integer.parseInt(enteredNumber);
                accumulatedSum += number;
                resultTextView.setText(String.valueOf(accumulatedSum));
                numberEditText.setText(""); // Clear the input for the next number
            }
        });
    }
}
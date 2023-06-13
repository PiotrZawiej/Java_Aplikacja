package com.example.java_aplikacja;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.time.LocalDate;
import java.util.ArrayList;

public class MonthViewActivity extends AppCompatActivity implements CalendarAdapter.OnItemListener {

    private TextView monthYearText;
    private RecyclerView calendarRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_month_view);
        initWidgets();
        CalendarU.selectedDate = LocalDate.now();
        setMonthView();
    }

    private void initWidgets() {
        calendarRecyclerView = findViewById(R.id.calendarRecyclerView);
        monthYearText = findViewById(R.id.monthYearTV);
    }

    private void setMonthView() {
        monthYearText.setText(monthYearFromDate(CalendarU.selectedDate));
        ArrayList<LocalDate> daysInMonth = CalendarU.daysInMonthArray(CalendarU.selectedDate);

        CalendarAdapter calendarAdapter = new CalendarAdapter(daysInMonth, this);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(), 7);
        calendarRecyclerView.setLayoutManager(layoutManager);
        calendarRecyclerView.setAdapter(calendarAdapter);
    }

    public void newEventAction(View view) {
    }

    public void previousMonthAction(View view) {
        CalendarU.selectedDate = CalendarU.selectedDate.minusMonths(1);
        setMonthView();
    }

    @Override
    public void onItemClick(int position, String dayText) {
        String message = "Selected Date: " + dayText + " " + monthYearFromDate(CalendarU.selectedDate);
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    public void nextMonthAction(View view) {
        CalendarU.selectedDate = CalendarU.selectedDate.plusMonths(1);
        setMonthView();
    }

    public String monthYearFromDate(LocalDate date) {
        return date.getMonth().toString() + " " + date.getYear();
    }
}

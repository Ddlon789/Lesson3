package ru.mirea.malyushin.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.icu.text.SimpleDateFormat;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        long dateInMillis = System.currentTimeMillis();
        String format = "yyyy-MM-dd HH:mm:ss";
        @SuppressLint("SimpleDateFormat") final SimpleDateFormat sdf = new SimpleDateFormat(format);
        String dateString = sdf.format(new Date(dateInMillis));

        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("date", dateString);
        intent.putExtra("num", 19*19);
        startActivity(intent);
    }
}
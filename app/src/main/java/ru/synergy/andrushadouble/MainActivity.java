package ru.synergy.andrushadouble;

import static android.widget.TextView.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        TextView textView = new TextView(this);

       // TextView.setText("Hello Android");

        textView.setTextSize(22);
        setContentView(textView);


    }
}
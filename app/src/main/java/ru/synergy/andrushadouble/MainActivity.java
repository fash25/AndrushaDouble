package ru.synergy.andrushadouble;

import static android.widget.TextView.*;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.second_layout);

//        TextView textView = (TextView) findViewById(R.id.header_title);
//        textView.setText("Hello from Java");


//        ConstraintLayout constraintLayout = new ConstraintLayout(this);
//        TextView textView = new TextView(this);
//    //    TextView.setText("Hello Android");
//        textView.setTextSize(26);
//
//        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(
//                ConstraintLayout.LayoutParams.WRAP_CONTENT,
//                ConstraintLayout.LayoutParams.WRAP_CONTENT);
//        layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
//        layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
//
//        textView.setLayoutParams(layoutParams);
//        constraintLayout.addView(textView);
//        setContentView(constraintLayout);


    }
}
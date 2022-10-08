package ru.synergy.andrushadouble;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CalculatorBl extends AppCompatActivity {
    private static final String LogcatTag = "CALCULATOR_ACTIVITY";
    private static final String LifecycleTag = "LIFECYCLE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LifecycleTag,"I'm onCreate(), and I'm started");
        setContentView(R.layout.activity_calculator_bl);

        final Button calculate = (Button) findViewById(R.id.calc);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log log = null;
                log.d(LogcatTag,"Button have been pushed");

                calculateAnswer();
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LifecycleTag,"I'm onPause(), and I'm started");
    }

    public CalculatorBl() {
        super();
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d(LifecycleTag,"I'm onResume(), and I'm started");
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LifecycleTag,"I'm onStart(), and I'm started");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LifecycleTag,"I'm onStop(), and I'm started");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LifecycleTag,"I'm onDestroy(), and I'm started");
    }

    private void calculateAnswer(){
        EditText numOne =(EditText) findViewById(R.id.editTextNumber3);
        EditText numTwo =(EditText) findViewById(R.id.editTextNumber4);

        RadioButton add = (RadioButton) findViewById(R.id.add);
        RadioButton sub = (RadioButton) findViewById(R.id.subtract);
        RadioButton multiple = (RadioButton) findViewById(R.id.multiple);
        RadioButton divide = (RadioButton) findViewById(R.id.divide);

        TextView answer = (TextView) findViewById(R.id.result);

        Log.d(LogcatTag,"All views have been founded ");

        float numone = Integer.parseInt(numOne.getText().toString());
        float numtwo = Integer.parseInt(numTwo.getText().toString());

        Log.d(LogcatTag,"Successfully grabbed data from input fields");
        Log.d(LogcatTag,"numone is: " + numone + "; "+" numtwo is: " + numtwo);

        float solution = 0;

        if (add.isChecked()){
            Log.d(LogcatTag,"Operation is add ");
            solution = numone + numtwo;
        }
        if (sub.isChecked()){
            Log.d(LogcatTag,"Operation is sub ");
            solution = numone - numtwo;
        }
        if (multiple.isChecked()){
            Log.d(LogcatTag,"Operation is multiple");
            solution = numone * numtwo;
        }
         if (divide.isChecked()){
             Log.d(LogcatTag,"Operation is divide ");
             if (numtwo == 0){
                 Toast.makeText(this, "Number two Cannot be zero", Toast.LENGTH_SHORT).show();
                 return;
        }
             solution = numone / numtwo;
         }
        Log.d(LogcatTag,"The result of operation is: "+ solution);
       answer.setText("The answer is  "+ solution);

    }
}
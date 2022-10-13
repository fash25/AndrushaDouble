package ru.synergy.andrushadouble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ComeBackActivity extends AppCompatActivity {

    EditText textView;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_come_back);

        EditText editText = (EditText) findViewById(R.id.editText);
        Button button = (Button) findViewById(R.id.backtv);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("tv", textView.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}
package ru.synergy.andrushadouble;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements onClickListener {

    private static final int REQ_C = 1;
    EditText et;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.second_layout);

       et = (EditText) findViewById(R.id.et);
        TextView tv = (TextView) findViewById(R.id.tv);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case RESULT_OK:
             //   tv.setText(data.getStringExtra("et"));

        }
    }

    public void onClick(View v){
        Intent i;
        switch (v.getId()){
            case R.id.button5:
                i= new Intent(this,MainActivity2.class);
                startActivity(i);
                break;
            case R.id.button6:
                i= new Intent(this,ToInfActivity.class);
                String eText = et.getText().toString();
                i.putExtra("et", eText);
                startActivity(i);
                break;
            case R.id.button7:
                i= new Intent(this,ComeBackActivity.class);
                startActivityForResult(i,REQ_C);
                break;



        }
    }
}
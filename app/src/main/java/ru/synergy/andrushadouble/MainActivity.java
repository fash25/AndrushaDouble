package ru.synergy.andrushadouble;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements onClickListener {

    private static final int REQ_C = 1;
    EditText et;
    private TextView tv;

    ActivityResultLauncher<Intent> mStartActivityForResult = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    Intent intent = result.getData();
                    tv.setText(intent.getStringExtra("tv"));

                }
            }
    );

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.second_layout);

       et = (EditText) findViewById(R.id.et);
        TextView tv = (TextView) findViewById(R.id.tv);

    }

//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        switch (requestCode){
//            case RESULT_OK:
//             //   tv.setText(data.getStringExtra("et"));
//
//                break;
//            default:
//                throw new IllegalStateException("Unexpected value: " + requestCode);
//        }
//    }

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
                mStartActivityForResult.launch(i);
                break;



        }
    }
}
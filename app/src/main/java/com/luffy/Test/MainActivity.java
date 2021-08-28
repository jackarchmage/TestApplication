package com.luffy.Test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.luffy.Test.R;

public class MainActivity extends AppCompatActivity {
    private EditText editText1,editText2;
    private TextView txtview,result;
    private Button btnCalc;
    private String first,second;
    private int f1,s1;
    private String TAG = "Test";
    private int total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editTextTextPersonName2);
        txtview = findViewById(R.id.textView4);
        btnCalc = findViewById(R.id.button2);
        result = findViewById(R.id.textView5);



        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first = editText1.getText().toString();
                second = editText2.getText().toString();
                if (first.isEmpty())
                {
                    Toast.makeText(MainActivity.this,"Enter your 1st number please",Toast.LENGTH_SHORT).show();
                    Log.d(TAG,"Enter your 1st number please");
                }
                else if (second.isEmpty())
                {
                    Toast.makeText(MainActivity.this,"Enter your 2nd number please",Toast.LENGTH_SHORT).show();
                    Log.d(TAG,"Enter your 2nd number please");
                }
                else {
                    f1 = Integer.parseInt(first);
                    s1 = Integer.parseInt(second);
                    calculate(f1,s1);
                }


            }
        });



    }

    private void calculate(int f1,int s1) {
        total = f1+s1;
        result.setText(String.valueOf(total));
    }


}
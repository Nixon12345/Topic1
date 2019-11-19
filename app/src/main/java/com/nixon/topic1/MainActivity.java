package com.nixon.topic1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etFirst, etSecond;
    private Button btnAdd;
    private RadioButton rdoAdd, rdosub, rdomltp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirst = findViewById(R.id.etfirst);
        etSecond = findViewById(R.id.etsecond);
        btnAdd = findViewById(R.id.btnAdd);
        rdoAdd = findViewById(R.id.rdoAdd);
        rdosub = findViewById(R.id.rdoSub);
        rdomltp = findViewById(R.id.rdomultiply);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int result=0;
                int first = Integer.parseInt(etFirst.getText().toString());
                int second= Integer.parseInt(etSecond.getText().toString());
                if(rdoAdd.isChecked())
                {
                    result = first+second;
                }
                else if (rdosub.isChecked())
                {
                    result=first-second;
                }
                else if(rdomltp.isChecked())
                {
                    result =first*second;
                }
                Toast.makeText(MainActivity.this, "The result is"+result, Toast.LENGTH_SHORT).show();
            }
        });
    }


}

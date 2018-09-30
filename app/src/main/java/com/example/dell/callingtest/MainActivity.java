package com.example.dell.callingtest;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et;
    Button call_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=findViewById(R.id.editText1);
        call_btn=findViewById(R.id.button1);
        call_btn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("MissingPermission")
            @Override
            public void onClick(View v) {
               /* Intent i = new Intent(Intent.ACTION_CALL);
                //i.setData(Uri.parse("tel:"+et.getText().toString()));
                startActivity(i);*/
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("+123456789"));
                startActivity(callIntent);
            }
        });
    }
}

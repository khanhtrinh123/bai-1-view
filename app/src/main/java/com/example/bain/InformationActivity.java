package com.example.bain;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class InformationActivity extends AppCompatActivity {
    private TextView man2;
    private TextView pass;
    private TextView Email;
    private TextView checkbox1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        man2 = (TextView) findViewById(R.id.man2);
        man2.setText(getIntent().getStringExtra("id"));
        pass = (TextView) findViewById(R.id.pass);
        pass.setText(getIntent().getStringExtra("id_1"));
        Email =(TextView)findViewById(R.id.email1);
        Email.setText(getIntent().getStringExtra("id_2"));
        checkbox1 = (TextView) findViewById(R.id.cb1);
        checkbox1.setText(getIntent().getStringExtra("cb1"));



    }
}

package com.example.bain;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class TrangChu extends AppCompatActivity {
    private Button click1;
    private Button click2;
    private  Button click3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trangchu);
        click1 = (Button) findViewById(R.id.click1);

        click1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TrangChu.this, MainActivity.class);
                startActivity(intent);
            }
        });
        click2 = (Button) findViewById(R.id.click2);
        click2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent a = new Intent(TrangChu.this , SecondDesktopActivity.class);
               startActivity(a);
            }
        });
        click3 = (Button) findViewById(R.id.click3);
        click3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(TrangChu.this , InforActivity.class);
                startActivity(b);
            }
        });

    }
}

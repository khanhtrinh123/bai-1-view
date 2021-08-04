package com.example.bain;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class TrangChu extends AppCompatActivity {
    private Button click1;

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


    }
}

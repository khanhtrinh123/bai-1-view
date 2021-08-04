package com.example.bain;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {
    private String Trinh = getClass().getSimpleName();
    private Button search_go_btn;
    private Button buttonCmt;
    private EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        search_go_btn = (Button) findViewById(R.id.search_go_btn);
        editText = (EditText) findViewById((R.id.edittext1));


        search_go_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondDesktopActivity.class);
                intent.putExtra("KEY_LINK_FULL_HD", editText.getText().toString());
                startActivity(intent);

            }
        });
        buttonCmt = (Button) findViewById(R.id.buttonCmt);
        buttonCmt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.add(R.id.container3, new Fragment3(), " ");
                fragmentTransaction.commit();
            }
        });


    }
}



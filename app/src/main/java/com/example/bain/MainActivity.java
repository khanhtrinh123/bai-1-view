package com.example.bain;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private String Trinh = getClass().getSimpleName();
    private Button search_go_btn;
    private Button back;
    private EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(Trinh, "onCreate: ");
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

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(Trinh, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(Trinh, "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(Trinh, "onPause: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(Trinh, "onRestart: ");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.d(Trinh, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(Trinh, "onDestroy: ");
    }
}
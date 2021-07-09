package com.example.bain;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class SecondDesktopActivity extends AppCompatActivity {
    private Button back;
    private TextView textman2;
    ;
    private Button back2;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second_desktop);
        back = (Button) findViewById(R.id.back);
        textman2 = (TextView) findViewById(R.id.textman2);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("A", "onClick: ");

                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                Bundle bundle = new Bundle();
                bundle.putString("KEY", textman2.getText().toString());
                Fragment1 fragmentclass = new Fragment1();
                fragmentclass.setArguments(bundle);

                fragmentTransaction.add(R.id.container, fragmentclass, "xxx");
                fragmentTransaction.commit();

            }
        });
        back2 = (Button) findViewById(R.id.back2);
        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(" ", "onClick: ");
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.add(R.id.container2, new Fragment2(), " ");
                fragmentTransaction.commit();
            }
        });
        textman2 = findViewById(R.id.textman2);
        textman2.setText(getIntent().getStringExtra("KEY_LINK_FULL_HD"));

    }
}
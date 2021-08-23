package com.example.bain;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class InforActivity extends AppCompatActivity{
    private Button bnt_click;
    private EditText username;
    private EditText password;
    private EditText email;
    private CheckBox checkbox1;
    private  CheckBox checkbox2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info1);
        bnt_click = (Button) findViewById(R.id.click1);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        email = (EditText) findViewById(R.id.email);
        checkbox1 = (CheckBox) findViewById(R.id.checkbox1);
        checkbox2= (CheckBox) findViewById(R.id.checkbox2);

                bnt_click.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String gioitinh = "Bạn đã chọn : ";
                        if (checkbox1.isChecked()){
                            gioitinh += checkbox1.getText() + "\n";
                        }
                        if (checkbox2.isChecked()){
                            gioitinh += checkbox2.getText() + "\n";
                        }
                        Toast.makeText(InforActivity.this, gioitinh, Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(InforActivity.this, InformationActivity.class);
                        intent.putExtra("id", username.getText().toString());
                        intent.putExtra("id_1", password.getText().toString());
                        intent.putExtra("id_2", email.getText().toString());
                        startActivity(intent);
                    }
                });
                checkbox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if(isChecked){
                            Toast.makeText(InforActivity.this, "Bạn đã chọn male", Toast.LENGTH_SHORT).show();
                        }
                        else {
                            Toast.makeText(InforActivity.this, " Bạn bỏ chọn male",Toast.LENGTH_SHORT).show();
                        }
                    }
                });
                checkbox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean b) {
                        if(b){
                            Toast.makeText(InforActivity.this,"Bạn chọn female",Toast.LENGTH_SHORT).show();
                        }else{
                            Toast.makeText(InforActivity.this,"Bạn bỏ chọn female", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
}

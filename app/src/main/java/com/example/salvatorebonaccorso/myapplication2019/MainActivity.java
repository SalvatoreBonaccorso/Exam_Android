package com.example.salvatorebonaccorso.myapplication2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText textInputName;
    private EditText textInputPassword;
    private Button btnLogin;
    private String mylogin;
    private String myBirth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textInputName = findViewById(R.id.username);
        textInputPassword = findViewById(R.id.password);
        btnLogin = findViewById(R.id.btn_click_me);

        btnLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mylogin=textInputName.getText().toString().trim();
                myBirth=textInputPassword.getText().toString().trim();
                if(mylogin.equals("")&& myBirth.equals("")){
                    Toast.makeText(MainActivity.this,R.string.error_text,Toast.LENGTH_SHORT).show();
                }
                else if (mylogin.equals("bonaccorso.salvatore")&& myBirth.equals("19041989")){

                    Intent openPage2 = new Intent(MainActivity.this,Main2Activity.class);
                    startActivity(openPage2);
                    Toast toast =Toast.makeText(MainActivity.this,"BENVENUTO "+textInputName.getText().toString(),Toast.LENGTH_LONG);
                    toast.show();
                }
                else{
                    Toast toast =Toast.makeText(MainActivity.this,R.string.error,Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);
                    toast.show();
                }
            }
        });
    }
}








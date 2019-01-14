package com.example.salvatorebonaccorso.myapplication2019;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;


public class Main2Activity extends AppCompatActivity {
    private EditText textInputName;
    // crea un identificativo univoco che ci servirà a passarlo nell'intent ( package.text )
    public static final String EXTRA_RETURNED = "com.example.salvatorebonaccorso.esame10_01_2019.returned";
    private EditText username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);

        textInputName = findViewById(R.id.username);

        username = findViewById(R.id.username);

        FragmentManager manager = getSupportFragmentManager();

        Fragment fragment = manager.findFragmentById(R.id.fragment_container);

        if (fragment == null)
        {
            fragment = new BlankFragment();

            manager.beginTransaction()
                    .add(R.id.fragment_container, fragment)
                    .commit();
        }
    }
}
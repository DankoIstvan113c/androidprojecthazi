package com.example.haziproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText szoveg = findViewById(R.id.nev);
        Button gomb = findViewById(R.id.tippButton);

        gomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, visszaAdas.class);
                String atadandoSzoveg = szoveg.getText().toString();
                i.putExtra("message", atadandoSzoveg);

                startActivity(i);
            }
        });
    }
}
package com.example.haziproject;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class visszaAdas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visszaadando);

        TextView tv = findViewById(R.id.textviewMessage);

        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            tv.setText(extras.getString("message"));
        }

    }
}
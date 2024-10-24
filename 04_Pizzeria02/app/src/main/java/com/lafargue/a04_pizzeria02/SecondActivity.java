package com.lafargue.a04_pizzeria02;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        TextView txVw1 = findViewById(R.id.txVw1);
        TextView txVw2 = findViewById(R.id.txVw2);

        String usuario = getIntent().getStringExtra(MainActivity.K_USERNAME);
        String pass = getIntent().getStringExtra(MainActivity.K_PASSWORD);

        txVw1.setText(usuario);
        txVw2.setText(pass);










    }
}
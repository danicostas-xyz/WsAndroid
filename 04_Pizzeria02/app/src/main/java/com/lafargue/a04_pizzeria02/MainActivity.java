package com.lafargue.a04_pizzeria02;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.lafargue.a04_pizzeria02.modelo.persistencia.DaoUsuario;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {

    public final static String K_USERNAME = "nombre";
    public final static String K_PASSWORD = "pass";
    public final static String K_USER = "usuario";

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        DaoUsuario.meterUsuariosEnLista(); // Meto los usuarios en la lista antes de nada, como si fuera un fichero
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edText1 = findViewById(R.id.edText1);
        EditText edText2 = findViewById(R.id.edText2);
        Button bt1 = findViewById(R.id.bt1);


        bt1.setOnClickListener(v -> {
            String nombre = edText1.getText().toString();
            String pass = edText2.getText().toString();

            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra(K_USERNAME, nombre);
            intent.putExtra(K_PASSWORD, pass);

            startActivity(intent);

        });










    }
}
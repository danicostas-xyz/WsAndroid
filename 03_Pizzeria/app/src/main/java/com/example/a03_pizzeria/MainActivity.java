package com.example.a03_pizzeria;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static int precioTamanho;
    public static int precioIngredientes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btCalcularPrecio = findViewById(R.id.btCalculaPrecio);

        RadioGroup radioGroup = findViewById(R.id.radioGroup);

        RadioButton rbGrande = findViewById(R.id.rbGrande);
        RadioButton rbMediana = findViewById(R.id.rbMediana);
        RadioButton rbPeque = findViewById(R.id.rbPeque);

        CheckBox cbPepperoni = findViewById(R.id.cbPepperoni);
        CheckBox cbJamon = findViewById(R.id.cbJamon);
        CheckBox cbAceitunas = findViewById(R.id.cbAceitunas);
        CheckBox cbBacon = findViewById(R.id.cbBacon);

        TextView tvPrecio = findViewById(R.id.tvPrecio);

        radioGroup.setOnCheckedChangeListener((radioGroup1, checkedId) -> {

            if (checkedId == R.id.rbGrande) {
                precioTamanho = 15;
            } else if (checkedId == R.id.rbMediana) {
                precioTamanho = 10;
            } else if (checkedId == R.id.rbPeque) {
                precioTamanho = 5;
            }

            calcularPrecioTotal();
        });

        cbPepperoni.setOnClickListener(new PrecioIngredientes());
        cbJamon.setOnClickListener(new PrecioIngredientes());
        cbAceitunas.setOnClickListener(new PrecioIngredientes());
        cbBacon.setOnClickListener(new PrecioIngredientes());


        btCalcularPrecio.setOnClickListener(view -> {

            tvPrecio.setText(String.valueOf(calcularPrecioTotal()));

        });

    }
    private static int calcularPrecioTotal() {
        return precioTamanho + precioIngredientes;
    }

}
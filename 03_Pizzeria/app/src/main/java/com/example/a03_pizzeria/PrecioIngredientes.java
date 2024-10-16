package com.example.a03_pizzeria;

import android.view.View;
import android.widget.CheckBox;

public class PrecioIngredientes implements View.OnClickListener {
    @Override
    public void onClick(View v) {
        CheckBox checkBox = (CheckBox) v;
        boolean isChecked = checkBox.isChecked();
        if (isChecked) {
            MainActivity.precioIngredientes += 2;
        } else {
            MainActivity.precioIngredientes -= 2;
        }

    }
}

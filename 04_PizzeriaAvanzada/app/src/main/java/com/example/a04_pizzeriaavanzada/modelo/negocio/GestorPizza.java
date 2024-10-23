package com.example.a04_pizzeriaavanzada.modelo.negocio;

import com.example.a04_pizzeriaavanzada.modelo.entidad.Pizza;

public class GestorPizza {

    public void calcularPrecio(Pizza pizza) {

        int resultado = 0;

        switch(pizza.getTamanoPizza()) {
            case GRANDE: resultado = 15;
                break;
            case MEDIANA: resultado = 10;
                break;
            case PEQUENA: resultado = 5;
                break;
        }

        for (String s : pizza.getListaIngredientes()) {
            resultado += 2;
        }

        pizza.setPrecio(resultado);
    }
}

package com.example.a04_pizzeriaavanzada.modelo.persistencia;

import com.example.a04_pizzeriaavanzada.modelo.entidad.Usuario;

import java.util.ArrayList;

public class DaoUsuario {

    ArrayList<Usuario> lista = new ArrayList<>();

    Usuario u1 = new Usuario("Avenida de Castelao", null, "1234", "Daniel");
    Usuario u2 = new Usuario("Joaquín Martínez", null, "4321", "Nahuel");
    Usuario u3 = new Usuario("Calle Ferrocarril", null, "0000", "Pedro");

    private void meterUsuariosEnLista () {
        lista.add(u1);
        lista.add(u2);
        lista.add(u3);
        meterUsuariosEnLista();
    }

    public Usuario getByName(String nombre) {

        Usuario u = null;

        lista.forEach(user -> {
            if(user.getNombre().equals(nombre)){
                return user;
            }
        });

        return u;
    }



}

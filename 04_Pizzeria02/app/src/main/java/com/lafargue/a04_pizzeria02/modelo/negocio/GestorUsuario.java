package com.lafargue.a04_pizzeria02.modelo.negocio;

import com.lafargue.a04_pizzeria02.modelo.entidad.Pizza;
import com.lafargue.a04_pizzeria02.modelo.entidad.Usuario;
import com.lafargue.a04_pizzeria02.modelo.persistencia.DaoUsuario;

public class GestorUsuario {

    /**
     * Método que valida un usuario pasado por parámetro para comprobar, primero, si existe en la persistencia.
     * En caso de que exista, se verifica que su contraseña coincida con la almacenada en persistencia.
     *
     * @param us el objeto usuario pasado por parámetro
     * @return 0 en caso de que el usuario introducido no exista, 1 en caso de que el usuario exista
     * pero su contraseña sea incorrecta y 2 en caso de que el usuario y la contraseña sean correctas.
     */
    public int validarUsuario(Usuario us) {

        DaoUsuario dao = new DaoUsuario();

        if (us.equals(dao.getByName(us.getNombre()))) {
            if (us.getPass().equals(dao.getByName(us.getNombre()).getPass())) {
                return 2;
            }
            return 1;
        }
        return 0;
    }

    public void addPizzaUsuario(Usuario us, Pizza pz) {

        us.setPizza(pz);
    }
}

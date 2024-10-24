package com.lafargue.a04_pizzeria02.modelo.entidad;

public class Usuario {
    private String nombre;
    private String pass;
    private Pizza pizza;
    private String direccion;

    public Usuario() {

    }

    public Usuario(String direccion, Pizza pizza, String pass, String nombre) {
        this.direccion = direccion;
        this.pizza = pizza;
        this.pass = pass;
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }
}

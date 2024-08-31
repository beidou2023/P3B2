package com.example.practica3b;

import java.io.Serializable;

public class Usuario implements Serializable {
    //Atributos
    private String nombre;
    private String apellidos;
    private String username;
    private String numeroAsegurado;
    private String password;
    private String direccion;

    //Getter&Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNumeroAsegurado() {
        return numeroAsegurado;
    }

    public void setNumeroAsegurado(String numeroAsegurado) {
        this.numeroAsegurado = numeroAsegurado;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //Constructor

    public Usuario(String nombre, String apellidos, String username, String numeroAsegurado, String password, String direccion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.username = username;
        this.numeroAsegurado = numeroAsegurado;
        this.password = password;
        this.direccion = direccion;
    }

    //Metodos

}

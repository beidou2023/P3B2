package com.example.practica3b;

public class Medico {
    //Atributos
    private String nombres;
    private String apellidos;
    private String especialidad;

    //Getter&Setter

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    //Constructor

    public Medico(String nombres, String apellidos, String especialidad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.especialidad = especialidad;
    }
}

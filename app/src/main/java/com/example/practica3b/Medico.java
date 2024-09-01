package com.example.practica3b;

public class Medico {
    //Atributos
    private int id;
    private String nombres;
    private String apellidos;
    private String especialidad;

    //Getter&Setter


    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

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

    public Medico(int id,String nombres, String apellidos, String especialidad) {
        this.id=id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.especialidad = especialidad;
    }
}

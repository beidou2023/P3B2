package com.example.practica3b;

import java.util.ArrayList;

public class Medico {
    //Atributos
    private int id;
    private String nombres;
    private String apellidos;
    private String especialidad;

    private ArrayList<String> horario=new ArrayList<String>() {{
        add("08:00 am");
        add("08:30 am");
        add("09:00 am");
        add("09:30 am");
        add("10:00 am");
        add("10:30 am");
        add("11:00 am");
        add("11:30 am");
    }};
    private ArrayList<Boolean>horarioBool=new ArrayList<Boolean>(horario.size());
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

    public ArrayList<String> getHorario() {
        return horario;
    }

    public void setHorario(ArrayList<String> horario) {
        this.horario = horario;
    }

    public ArrayList<Boolean> getHorarioBool() {
        return horarioBool;
    }

    public void setHorarioBool(ArrayList<Boolean> horarioBool) {
        this.horarioBool = horarioBool;
    }
    //Constructor

    public Medico(int id,String nombres, String apellidos, String especialidad) {
        this.id=id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.especialidad = especialidad;
    }

    //Metodos
    public void agregarHora(String hora){
        for (int i=0;i<horario.size();i++){
            if(hora.equals(horario.get(i))){
                horarioBool.set(i,true);
                break;
            }
        }
    }

    public void quitarHora(String hora){
        for (int i=0;i<horario.size();i++){
            if(hora.equals(horario.get(i))){
                horarioBool.set(i,false);
                break;
            }
        }
    }
}

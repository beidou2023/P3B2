package com.example.practica3b;

import java.util.ArrayList;

public class Personal {
    //Atributos
    private ArrayList<Medico>medicos=new ArrayList<Medico>();
    private ArrayList<Usuario>usuarios=new ArrayList<Usuario>();
    private ArrayList<String>especialidades=new ArrayList<String>();

    private int indexMedico;
    private int indexUser;
    private int indexEspecialidad;


    //Getter&Setter
    public ArrayList<Medico> getMedicos() {
        return medicos;
    }

    public void setMedicos(ArrayList<Medico> medicos) {
        this.medicos = medicos;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public int getIndexMedico() {
        return indexMedico;
    }

    public void setIndexMedico(int indexMedico) {
        this.indexMedico = indexMedico;
    }

    public ArrayList<String> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(ArrayList<String> especialidades) {
        this.especialidades = especialidades;
    }

    public int getIndexUser() {
        return indexUser;
    }

    public void setIndexUser(int indexUser) {
        this.indexUser = indexUser;
    }

    public int getIndexEspecialidad() {
        return indexEspecialidad;
    }

    public void setIndexEspecialidad(int indexEspecialidad) {
        this.indexEspecialidad = indexEspecialidad;
    }

    // Constructor
    public Personal() {
    }

    // Metodos
    public void addMedico(Medico medico){
        medicos.add(medico);
    }
    public void addUsuario(Usuario usuario){
        usuarios.add(usuario);
    }
    public void addEspecialidad(String especialidad){especialidades.add(especialidad);}
}

package com.example.practica3b;

import java.util.ArrayList;

public class Personal {
    //Atributos
    private ArrayList<Medico>medicos=new ArrayList<Medico>();
    private ArrayList<Usuario>usuarios=new ArrayList<Usuario>();
    private int indexMedico;
    private int indexUser;

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

    public int getIndexUser() {
        return indexUser;
    }

    public void setIndexUser(int indexUser) {
        this.indexUser = indexUser;
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
}

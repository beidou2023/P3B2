package com.example.practica3b;

import java.util.ArrayList;

public class Personal {
    ArrayList<Medico>medicos=new ArrayList<Medico>();
    ArrayList<Usuario>usuarios=new ArrayList<Usuario>();

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

    public Personal() {
    }

    public void addMedico(Medico medico){
        medicos.add(medico);
    }
    public void addUsuario(Usuario usuario){
        usuarios.add(usuario);
    }
}

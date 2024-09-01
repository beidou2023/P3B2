package com.example.practica3b;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class firstAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_first_act);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Personal personal=new Personal();
        //POR DEFECTO
        //VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV
        Usuario userTest=new Usuario("Juan","Lopez","admin","123","root","qwerty");
        personal.addUsuario(userTest);
        ArrayList<String> especialidades=new ArrayList<String>();
        personal.addEspecialidad("Dermatología"); //2
        personal.addEspecialidad("Ginecología"); //1
        personal.addEspecialidad("Oftalmología"); //0
        personal.addEspecialidad("Cardiología"); //2
        personal.addEspecialidad("Psiquiatría");  //1

        Medico medico1=new Medico(1,"Alfa1","Omega","Dermatología");
        Medico medico2=new Medico(2,"Alfa2","Omega","Ginecología");
        Medico medico3=new Medico(3,"Alfa3","Omega","Cardiología");
        Medico medico4=new Medico(4,"Alfa4","Omega","Psiquiatría");
        Medico medico5=new Medico(5,"Alfa5","Omega","Dermatología");
        Medico medico6=new Medico(6,"Alfa6","Omega","Cardiología");

        personal.addMedico(medico1);
        personal.addMedico(medico2);
        personal.addMedico(medico3);
        personal.addMedico(medico4);
        personal.addMedico(medico5);
        personal.addMedico(medico6);

        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        MySingleton.setPersonal(personal);
        Intent intent = new Intent(getApplicationContext(), login.class);
        startActivity(intent);
    }
}
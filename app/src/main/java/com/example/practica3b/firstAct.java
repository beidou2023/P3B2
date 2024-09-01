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
        personal.addEspecialidad("Dermatología");
        personal.addEspecialidad("Ginecología");
        personal.addEspecialidad("Oftalmología");
        personal.addEspecialidad("Cardiología");
        personal.addEspecialidad("Psiquiatría");
        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        MySingleton.setPersonal(personal);
        Intent intent = new Intent(getApplicationContext(), login.class);
        startActivity(intent);
    }
}
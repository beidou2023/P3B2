package com.example.practica3b;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class especialidadTabla extends AppCompatActivity {

    RecyclerView especialidadesTabla;
    especialidadesAdapter especialidadesadapter;
    Personal personal=MySingleton.getPersonal();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_especialidad_tabla);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        especialidadesTabla=findViewById(R.id.rv_especialidad);
        ArrayList<String>especialidades=personal.getEspecialidades();

        especialidadesadapter = new especialidadesAdapter(especialidades, position -> {
            Intent it = new Intent(getApplicationContext(), medicosTabla.class);
            personal.setIndexEspecialidad(position);
            startActivity(it);
        });

        especialidadesTabla.setLayoutManager(new LinearLayoutManager(this));
        especialidadesTabla.setAdapter(especialidadesadapter);

        //Toast.makeText(getApplicationContext(),""+especialidades.size(), Toast.LENGTH_SHORT).show();
    }
}
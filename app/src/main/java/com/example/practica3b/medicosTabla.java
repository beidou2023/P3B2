package com.example.practica3b;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class medicosTabla extends AppCompatActivity {

    RecyclerView medicosTabla;
    medicosAdapter medicosadapter;
    Personal personal=MySingleton.getPersonal();
    ArrayList<Medico> medicos=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_medicos_tabla);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        int nroMedicos=personal.getMedicos().size();
        int indexEspecialidad=personal.getIndexEspecialidad();
        String especialidad=personal.getEspecialidades().get(indexEspecialidad);

        for (int i=0;i<nroMedicos;i++){
            if(especialidad.equals(personal.getMedicos().get(i).getEspecialidad())){
                medicos.add(personal.getMedicos().get(i));
            }
        }
        medicosTabla=findViewById(R.id.rv_medicos);
        medicosadapter = new medicosAdapter(medicos, position -> {
            Intent it = new Intent(getApplicationContext(), medicoHorario.class);
            personal.setIndexMedico(position);
            startActivity(it);
        });

        medicosTabla.setLayoutManager(new LinearLayoutManager(this));
        medicosTabla.setAdapter(medicosadapter);

    }

    public void irAtras(View v){
        Intent it=new Intent(getApplicationContext(), especialidadTabla.class);
        startActivity(it);
    }
}
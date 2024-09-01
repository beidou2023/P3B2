package com.example.practica3b;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class medicoHorario extends AppCompatActivity {

    TextView especialidad,medico;
    RecyclerView horaList;
    Personal personal=MySingleton.getPersonal();
    ArrayList<String>horario=new ArrayList<>();
    horarioAdapter horarioadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_medico_horario);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        especialidad=findViewById(R.id.txv_especialidad);
        medico=findViewById(R.id.txv_medico);
        String especialidadNombre=personal.getEspecialidades().get(personal.getIndexEspecialidad());
        String medicoNombre=personal.getMedicos().get(personal.getIndexMedico()).getNombres()+" "+personal.getMedicos().get(personal.getIndexMedico()).getApellidos();
        especialidad.setText(especialidadNombre);
        medico.setText(medicoNombre);

        horario=personal.getMedicos().get(0).getHorario();
        horaList=findViewById(R.id.rv_horario);

//        Toast.makeText(getApplicationContext(),""+horario.size(),Toast.LENGTH_SHORT).show();
//        horarioadapter = new horarioAdapter(horario, position -> {
//            Intent it = new Intent(getApplicationContext(), fichaReserva.class);
//            it.putExtra("position",position);
//            startActivity(it);
//        });
//
//        horaList.setLayoutManager(new LinearLayoutManager(this));
//        horaList.setAdapter(horarioadapter);

    }
}
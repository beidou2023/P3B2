package com.example.practica3b;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

public class medicoHorario extends AppCompatActivity {

    TextView especialidad,medico;
    RecyclerView horarios;
    Personal personal=MySingleton.getPersonal();

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
    }
}
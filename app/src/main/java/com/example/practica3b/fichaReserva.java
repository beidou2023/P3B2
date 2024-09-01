package com.example.practica3b;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class fichaReserva extends AppCompatActivity {

    TextView nombre,especialidad,hora;
    int horaReserva;
    Personal personal=MySingleton.getPersonal();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ficha_reserva);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        horaReserva=(Integer)getIntent().getSerializableExtra("position");

        nombre=findViewById(R.id.txv_r_nombre);
        especialidad=findViewById(R.id.txv_r_especialidad);
        hora=findViewById(R.id.txv_r_hora);


        nombre.setText(personal.getUsuarios().get(personal.getIndexUser()).getNombre()+" "+personal.getUsuarios().get(personal.getIndexUser()).getApellidos());
        especialidad.setText(personal.getEspecialidades().get(personal.getIndexEspecialidad()));
        hora.setText(personal.getMedicos().get(0).getHorario().get(horaReserva));
    }

}

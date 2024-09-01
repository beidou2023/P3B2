package com.example.practica3b;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class userLogin extends AppCompatActivity {

    TextView fullName;
    int indice=-1;
    Personal personal=MySingleton.getPersonal();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_user_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        indice=(Integer)getIntent().getSerializableExtra("indice");
        fullName=findViewById(R.id.txt_fullName);
        fullName.setText(""+personal.getUsuarios().get(indice).getNombre()+" "+personal.getUsuarios().get(indice).getApellidos());
    }

    public void agregarCita(View v){
        Intent it=new Intent(getApplicationContext(), especialidadTabla.class);
        it.putExtra("indice",indice);
        startActivity(it);
    }
}
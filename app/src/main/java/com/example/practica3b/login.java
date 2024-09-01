package com.example.practica3b;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class login extends AppCompatActivity {

    EditText usuario0,password0;
    Personal personal=MySingleton.getPersonal();
    int indice=-1;
    boolean ingreso=false,pass=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ingreso=false;pass=false;
        usuario0=findViewById(R.id.ett_usuario);
        password0=findViewById(R.id.ett_password);
    }
    public void ingresar(View v){
        ingreso=false;pass=false;
        String usuarioIngreso=usuario0.getText().toString();
        String passwordIngreso=password0.getText().toString();
        int nroUsuarios=personal.getUsuarios().size();
        for (int i=0;i<nroUsuarios;i++){
            pass=true;
            if(usuarioIngreso.equals(personal.getUsuarios().get(i).getUsername())){
                if(passwordIngreso.equals(personal.getUsuarios().get(i).getPassword())) {
                    ingreso = true;
                    indice = i;
                }
                else
                    Toast.makeText(getApplicationContext(),"Contraseña o Usuario incorrecto",Toast.LENGTH_SHORT).show();
                break;
            }
            if(i==nroUsuarios-1){
                Toast.makeText(getApplicationContext(),"Contraseña o Usuario incorrecto",Toast.LENGTH_SHORT).show();
            }
        }
        if(!pass){
            Toast.makeText(getApplicationContext(),"Contraseña o Usuario incorrecto",Toast.LENGTH_SHORT).show();
        }
        if(ingreso){
            Intent it=new Intent(getApplicationContext(), userLogin.class);
            it.putExtra("indice",indice);
            startActivity(it);
        }
    }

    public void crearUsuario(View v){
        Intent it=new Intent(getApplicationContext(),userCreate.class);
        startActivity(it);
    }
}
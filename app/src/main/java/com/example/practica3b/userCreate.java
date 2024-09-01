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

public class userCreate extends AppCompatActivity {

    EditText nombres,apellidos,nroAsegurado,userName,password,direccion;
    Personal personal=MySingleton.getPersonal();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_user_create);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        nombres =findViewById(R.id.ett_nombres);
        apellidos =findViewById(R.id.ett_apellidos);
        nroAsegurado =findViewById(R.id.ett_nroAsegurado);
        userName =findViewById(R.id.ett_userName);
        password =findViewById(R.id.ett_password);
        direccion =findViewById(R.id.ett_direccion);
    }

    public void crearUsuario(View v){
        boolean verificador=true;
        String nombreNuevo=nombres.getText().toString();
        String apellidosNuevo=apellidos.getText().toString();
        String nroAseguradoNuevo=nroAsegurado.getText().toString();
        String userNameNuevo=userName.getText().toString();
        String passwordNuevo=password.getText().toString();
        String direccionNuevo=direccion.getText().toString();

        int nroUsuarios=personal.getUsuarios().size();
        for(int i=0;i<nroUsuarios;i++){
            if(userNameNuevo.equals(personal.getUsuarios().get(i).getUsername())){
                Toast.makeText(getApplicationContext(),"YA EXISTE ESE USUARIO, INGRESE OTRO",Toast.LENGTH_SHORT).show();
                verificador=false;
                userName.requestFocus();
                break;
            }
        }
        if(verificador){
            Usuario usuarioNuevo=new Usuario(nombreNuevo,apellidosNuevo,userNameNuevo,nroAseguradoNuevo,passwordNuevo,direccionNuevo);
            personal.addUsuario(usuarioNuevo);
            Intent it=new Intent(getApplicationContext(), login.class);
            startActivity(it);
        }
    }
}
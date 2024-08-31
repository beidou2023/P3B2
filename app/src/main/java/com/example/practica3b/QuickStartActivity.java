package com.example.practica3b;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class QuickStartActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Personal personal=new Personal();
        MySingleton.setPersonal(personal);

        Intent intent = new Intent(this, login.class);
        startActivity(intent);
        finish();
    }
}
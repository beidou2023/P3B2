package com.example.practica3b;

public class MySingleton {
    private static Personal personal;

    public static Personal getPersonal() {
        return personal;
    }

    public static void setPersonal(Personal object) {
        personal = object;
    }
}

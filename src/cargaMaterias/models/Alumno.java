package cargaMaterias.models;

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private int matricula;
    private int password;

    public Alumno(String nombre, int matricula, int password) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public int getMatricula() {
        return matricula;
    }

    public int getPassword() {
        return password;
    }
}

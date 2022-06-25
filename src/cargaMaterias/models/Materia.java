package cargaMaterias.models;

import java.util.Scanner;

public class Materia {
    public String materia;
    public char grupo;

    Scanner entrada = new Scanner(System.in);

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public char getGrupo() {
        return grupo;
    }

    public void setGrupo(char grupo) {
        this.grupo = grupo;
    }
}

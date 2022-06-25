package cargaMaterias;

import cargaMaterias.models.Alumno;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        loginSesion();
    }

    public static void loginSesion(){
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Como desea ingresar");
            System.out.println("1. Alumno");
            System.out.println("2. Docente");
            System.out.println("3. Salir");
            opcion = entrada.nextInt();
            switch (opcion){
                case 1:
                    loginAlumno(alumnoLista());
                    break;
                case 2:
                    //loginDocente();
                    break;
                case 3:
                    System.out.println("Nos vemos");
                    break;
            }
        } while(opcion!=3);
    }

    public static void loginAlumno(ArrayList<Alumno>listaAlumno){
        int matricula,  password;
        Scanner entrada = new Scanner(System.in);
            System.out.println("Ingrese sus datos");
            System.out.println("Matricula: ");
            matricula = entrada.nextInt();
            for (int i=0; i<listaAlumno.size(); i++){
                if (listaAlumno.get(i).getMatricula() == matricula){
                    System.out.println("Password: ");
                    password = entrada.nextInt();
                        if (listaAlumno.get(i).getPassword() == password){
                            cargaMaterias();
                        }
                }
            }
    }

    public static void cargaMaterias(){
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Que desea realizar?");
            System.out.println("1. Cargar de materias");
            System.out.println("2. Cargar de materias manual");
            System.out.println("3. Salir");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    cargaMateria();
                    break;
                case 2:
                    cargaMateriaManual();
                    break;
                case 3:
                    System.out.println("Hasta luego");
                    break;
            }
        }while(opcion!=3);
    }

    public static void cargaMateria(){

        Scanner entrada = new Scanner(System.in);
        byte cantidad;
        do {
            System.out.println("Cuantas materias desea cargar?");
            cantidad = entrada.nextByte();

        } while(cantidad <=0 || cantidad>=8);
        System.out.println("Nombre de la materia: ");
    }

    public static void cargaMateriaManual(){

    }







    //Alumnos registrados
    public static ArrayList<Alumno> alumnoLista(){
        ArrayList<Alumno> listaAlumno = new ArrayList();
        listaAlumno.add(new Alumno("Francisco", 221201, 00001));
        listaAlumno.add(new Alumno("Joanna", 221202, 00002));
        listaAlumno.add(new Alumno("Yuliza", 221203, 00003));
        listaAlumno.add(new Alumno("Edgar", 221204, 00004));
        listaAlumno.add(new Alumno("Jose", 221205, 00005));
        return listaAlumno;
    }


}

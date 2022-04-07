package ui;

import java.util.Scanner;

public class interfaz {
    
    public static void bienvenida() {
        System.out.println("Bienvenidos al MiniSia! ");
    }

    public static void imprimirMenu(){

        System.out.println("\nEliga una de las siguientes opciones:");
        System.out.println("1.- Estudiante");
        System.out.println("2.- Grupo");
        System.out.println("3.- Materia");
        System.out.println("4.- Notas");
        System.out.println("5.- Profesor");
        System.out.println("6.- Programa");
        System.out.println("7.- Recibos de Pago");
        System.out.println("0.- Salir");

    }

    public static int elegirOpcion() {
        Scanner leer = new Scanner(System.in);
        System.out.print("\nDigite una opción: ");
        return leer.nextInt();
    }

    // menu Estudiante
    public static void menuEstudiante(){
        System.out.println("\n¿Que accíon desea realizar?");
        System.out.println("1.- Crear nuevo estudiante");
        System.out.println("2.- Ver estudiante");
        System.out.println("0.- Salir");
    }

    // menu Grupo
    public static void menuGrupo(){
        System.out.println("\n¿Que accíon desea realizar?");
        System.out.println("1.- Crear nuevo Grupo");
        System.out.println("2.- Ver Grupo");
        System.out.println("0.- Salir");
    }

    // menu Materia
    public static void menuMateria(){
        System.out.println("\n¿Que accíon desea realizar?");
        System.out.println("1.- Crear nuevo Materia");
        System.out.println("2.- Ver Materia");
        System.out.println("0.- Salir");
    }

    // menu Notas
    public static void menuNotas(){
        System.out.println("\n¿Que accíon desea realizar?");
        System.out.println("1.- Crear nuevas Notas");
        System.out.println("2.- Ver Notas");
        System.out.println("0.- Salir");
    }

    // menu Profesor
    public static void menuProfesor(){
        System.out.println("\n¿Que accíon desea realizar?");
        System.out.println("1.- Crear nuevo profesor");
        System.out.println("2.- Ver profesor");
        System.out.println("0.- Salir");
    }

    // menu Programa
    public static void menuPrograma(){
        System.out.println("\n¿Que accíon desea realizar?");
        System.out.println("1.- Crear nuevo Programa");
        System.out.println("2.- Ver Programa");
        System.out.println("0.- Salir");
    }

    // menu Profesor
    public static void menuRecibosPago(){
        System.out.println("\n¿Que accíon desea realizar?");
        System.out.println("1.- Crear nuevo Recibo de Pago");
        System.out.println("2.- Ver Recibo de pago");
        System.out.println("0.- Salir");
    }

    // default
    public static void opcionIncorrecta(){
        System.out.println("\nNo digito una opción valida");
    }

}

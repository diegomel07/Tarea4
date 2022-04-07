package logic;

import ui.*;
import data.*;

public class miniSia {
    
    public static void main(String[] args) {
        interfaz.bienvenida();
        int opcion;
        
        
        do {
            // menu general
            interfaz.imprimirMenu();
            opcion = interfaz.elegirOpcion();

            switch(opcion){
                case 1:
                    // menu estudiante
                    int opcion_estudiante;
                    do{
                        interfaz.menuEstudiante();
                        opcion_estudiante = interfaz.elegirOpcion();
                        
                        switch (opcion_estudiante){
                            case 1:
                                // TO DO
                                break;
                            case 2:
                                // ejemplo
                                Estudiante est_ejemplo = new Estudiante("Juan", "Perez", "jperez1", "123", 01, 5.0);
                                System.out.println(est_ejemplo.toString());
                                break;
                        }


                    } while(opcion_estudiante != 0);
                    break;

                case 2:
                    // menu egrupo
                    int opcion_grupo;
                    do{
                        interfaz.menuGrupo();
                        opcion_grupo = interfaz.elegirOpcion();

                        switch (opcion_grupo){
                            case 1:
                                // TO DO
                                break;
                            case 2:
                                // ejemplo
                                String diasSema[] = {"lunes", "miercoles", "viernes"};
                                String vecDia[] = {"mañana", "tarde"};
                                Grupo gru_ejemplo = new Grupo(01,diasSema, vecDia);
                                System.out.println(gru_ejemplo.toString());
                                break;
                        }

                    } while(opcion_grupo != 0);
                    break;

                case 3:
                    // menu materia
                    int opcion_materia;
                    do{
                        interfaz.menuMateria();
                        opcion_materia = interfaz.elegirOpcion();

                        switch (opcion_materia){
                            case 1:
                                // TO DO
                                break;
                            case 2:
                                // ejemplo
                                long id = 1;
                                Materia mat_ejemplo = new Materia("Progamación Orientada a Objetos", id);
                                System.out.println(mat_ejemplo.toString());
                                break;
                        }

                    } while(opcion_materia != 0);
                    break;

                case 4:
                    // menu notas
                    int opcion_notas;
                    do{
                        interfaz.menuNotas();
                        opcion_notas = interfaz.elegirOpcion();

                        switch (opcion_notas){
                            case 1:
                                // TO DO
                                break;
                            case 2:
                                // ejemplo
                                Notas nota_ejemplo = new Notas(3.1);
                                System.out.println(nota_ejemplo.toString());
                                break;
                        }

                    } while(opcion_notas != 0);
                    break;

                case 5:
                    // menu profesor
                    int opcion_profesor;
                    do{
                        interfaz.menuProfesor();
                        opcion_profesor = interfaz.elegirOpcion();

                        switch (opcion_profesor){
                            case 1:
                                // TO DO
                                break;
                            case 2:
                                // ejemplo
                                Profesor profe_ejemplo = new Profesor("Osvaldo", "De las Rosas", "odelasrosas", "123", 01);
                                System.out.println(profe_ejemplo.toString());
                                break;
                        }

                    } while(opcion_profesor != 0);
                    break;

                case 6:
                    // menu programa
                    int opcion_progama;
                    do{
                        interfaz.menuPrograma();
                        opcion_progama = interfaz.elegirOpcion();

                        switch (opcion_progama){
                            case 1:
                                // TO DO
                                break;
                            case 2:
                                // ejemplo
                                Programa progr_ejemplo = new Programa("Ingeniería de Sistemas y Computación", 01);
                                System.out.println(progr_ejemplo.toString());
                                break;
                        }

                    } while(opcion_progama != 0);
                    break;

                case 7:
                    // menu recibos de pago
                    int opcion_reibos_pago;
                    do{
                        interfaz.menuRecibosPago();
                        opcion_reibos_pago = interfaz.elegirOpcion();

                        switch (opcion_reibos_pago){
                            case 1:
                                // TO DO
                                break;
                            case 2:
                                // ejemplo
                                RecibosPago recibo_ejemplo = new RecibosPago(01, 50000, "2022-2");
                                System.out.println(recibo_ejemplo.toString());
                                break;
                        }

                    } while(opcion_reibos_pago != 0);
                    break;
                
                default:
                    interfaz.opcionIncorrecta();

                
            }
        } while (opcion != 0);
        
    }

}

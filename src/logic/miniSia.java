package tarea4.logic;

import tarea4.ui.*;
import tarea4.data.*;
import java.util.*;

public class miniSia {
    
    public static void main(String[] args) {
        interfaz.bienvenida();
        int opcion;
        
        Estudiante est_ejemplo = new Estudiante("Juan", "Perez", "jperez1", "123", 01, 5.0);
        Estudiante est_ejemplo2 = new Estudiante("Camila", "Camacho", "ccamacho2", "456", 02, 4.1);
        
        String diasSema[] = {"lunes", "miercoles", "viernes"};
        String vecDia[] = {"mañana", "tarde"};
        Grupo gru_ejemplo = new Grupo(01,diasSema, vecDia);
        
        String diasSema2[] = {"lunes", "martes", "miercoles"};
        String vecDia2[] = {"tarde"};
        Grupo gru_ejemplo2 = new Grupo(02,diasSema2, vecDia2);
        
        long id = 1;
        Materia mat_ejemplo = new Materia("Progamación Orientada a Objetos", id);
        
        long id2 = 2;
        Materia mat_ejemplo2 = new Materia("Fisica Cuantica", id2);
        
        Notas nota_ejemplo = new Notas(3.1);
        Notas nota_ejemplo2 = new Notas(3.8);
        
        Profesor profe_ejemplo = new Profesor("Osvaldo", "De las Rosas", "odelasrosas", "123", 01);
        Profesor profe_ejemplo2 = new Profesor("Plinio", "Del Carmen", "pCarmen", "456", 02);
        
        Programa progr_ejemplo = new Programa("Ingeniería de Sistemas y Computación", 01);
        Programa progr_ejemplo2 = new Programa("Matematicas", 02);
        
        RecibosPago recibo_ejemplo = new RecibosPago(01, 50000, "2022-2");
        RecibosPago recibo_ejemplo2 = new RecibosPago(02, 2800000, "2022-1");
        
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
                                ArrayList<Grupo> grupos_est = new ArrayList<Grupo>();
                                grupos_est.add(gru_ejemplo);
                                grupos_est.add(gru_ejemplo2);
                                est_ejemplo.setGrupos(grupos_est);
                                est_ejemplo2.setGrupos(grupos_est);
                                ArrayList<Programa> progr_est = new ArrayList<Programa>();
                                progr_est.add(progr_ejemplo);
                                progr_est.add(progr_ejemplo2);
                                est_ejemplo.setPrograma(progr_est);
                                est_ejemplo2.setPrograma(progr_est);
                                System.out.println(est_ejemplo.toString());
                                System.out.println(est_ejemplo2.toString());
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
                                gru_ejemplo.setRepresenta(mat_ejemplo);
                                gru_ejemplo2.setRepresenta(mat_ejemplo2);
                                gru_ejemplo.setEnseniadoPor(profe_ejemplo);
                                gru_ejemplo2.setEnseniadoPor(profe_ejemplo2);
                                ArrayList<Estudiante> estudiante_gru = new ArrayList<Estudiante>();
                                estudiante_gru.add(est_ejemplo);
                                estudiante_gru.add(est_ejemplo2);
                                gru_ejemplo.setAsistentes(estudiante_gru);
                                gru_ejemplo2.setAsistentes(estudiante_gru);
                                ArrayList<Notas> notas_gru = new ArrayList<Notas>();
                                notas_gru.add(nota_ejemplo);
                                notas_gru.add(nota_ejemplo2);
                                gru_ejemplo.setNotas(notas_gru);
                                gru_ejemplo.setNotas(notas_gru);
                                System.out.println(gru_ejemplo.toString());
                                System.out.println(gru_ejemplo2.toString());
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
                                mat_ejemplo.setPrograma(progr_ejemplo);
                                mat_ejemplo2.setPrograma(progr_ejemplo2);
                                System.out.println(mat_ejemplo.toString());
                                System.out.println(mat_ejemplo2.toString());
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
                                System.out.println(nota_ejemplo.toString());
                                System.out.println(nota_ejemplo2.toString());
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
                                System.out.println(profe_ejemplo.toString());
                                System.out.println(profe_ejemplo2.toString());
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
                                System.out.println(progr_ejemplo.toString());
                                System.out.println(progr_ejemplo2.toString());
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
                                System.out.println(recibo_ejemplo.toString());
                                System.out.println(recibo_ejemplo2.toString());
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

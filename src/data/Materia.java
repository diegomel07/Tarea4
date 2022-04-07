package data;

import java.util.*;

public class Materia {
    private String nombre;
    private Long id;
    private Programa programa;
    private ArrayList<Grupo> grupos;

    
    // Constructors
    public Materia(String nombre, Long id, Programa programa, ArrayList<Grupo> grupos) {
        this.nombre = nombre;
        this.id = id;
        this.programa = programa;
        this.grupos = grupos;
    }

    public Materia(String nombre, Long id) {
        this.nombre = nombre;
        this.id = id;
    }



    // Setters and Getters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Programa getPrograma() {
        return this.programa;
    }

    public void setPrograma(Programa programa) {
        this.programa = programa;
    }

    public ArrayList<Grupo> getGrupo() {
        return this.grupos;
    }

    public void setGrupos(ArrayList<Grupo> grupos) {
        this.grupos = grupos;
    }

    // toString
    @Override
    public String toString() {
        return "Materia [grupos=" + grupos + ", id=" + id + ", nombre=" + nombre + ", programa=" + programa + "]";
    }

}

package data; 

import java.util.*;

public class Profesor{
    private String nombre;
    private String apellido;
    private String usuario;
    private String contrasenha;
    private long id;
    private Date fechaNacimiento;
    private ArrayList<Grupo> grupos;

    
    // Constructors
    public Profesor(String nombre, String apellido, String usuario, String contrasenha, long id, Date fechaNacimiento,
            ArrayList<Grupo> grupos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contrasenha = contrasenha;
        this.id = id;
        this.fechaNacimiento = fechaNacimiento;
        this.grupos = grupos;
    }

    

    public Profesor(String nombre, String apellido, String usuario, String contrasenha, long id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contrasenha = contrasenha;
        this.id = id;
    }



    // Setters and Getters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenha() {
        return this.contrasenha;
    }

    public void setContrasenha(String contrasenha) {
        this.contrasenha = contrasenha;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public ArrayList<Grupo> getGrupos() {
        return this.grupos;
    }

    public void setGrupos(ArrayList<Grupo> grupos) {
        this.grupos = grupos;
    }

    // toString
    @Override
    public String toString() {
        return "Profesor [apellido=" + apellido + ", contrasenha=" + contrasenha + ", fechaNacimiento="
                + fechaNacimiento + ", grupos=" + grupos + ", id=" + id + ", nombre=" + nombre + ", usuario=" + usuario
                + "]";
    }
        
}

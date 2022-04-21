package data;

import java.util.*;


public class Estudiante {
    private String nombres;
    private String apellidos;
    private String usuario;
    private String contrasegna;
    private long id;
    private double promedio;
    private Date fechaNacimiento;
    private ArrayList<Programa> programa;
    private ArrayList<Grupo> grupos;
    
    // Constructors
    public Estudiante(String nombres, String apellidos, String usuario, String contrasegna, long id, double promedio,
            Date fechaNacimiento, ArrayList<Programa> programa, ArrayList<Grupo> grupos) {

        this.nombres = nombres;
        this.apellidos = apellidos;
        this.usuario = usuario;
        this.contrasegna = contrasegna;
        this.id = id;
        this.promedio = promedio;
        this.fechaNacimiento = fechaNacimiento;
        this.programa = programa;
        this.grupos = grupos;

    }

    public Estudiante(String nombres, String apellidos, String usuario, String contrasegna, long id, double promedio, Date fechaNacimiento){
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.usuario = usuario;
        this.contrasegna = contrasegna;
        this.id = id;
        this.promedio = promedio;
        this.fechaNacimiento = fechaNacimiento;
        this.grupos = new ArrayList<Grupo>();
        this.programa = new ArrayList<Programa>();

    }



    // Setters and getters
    public String getNombres() {
        return this.nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasegna() {
        return this.contrasegna;
    }

    public void setContrasegna(String contrasegna) {
        this.contrasegna = contrasegna;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public double getPromedio() {
        return this.promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public ArrayList<Programa> getPrograma() {
        return this.programa;
    }

    public void setPrograma(ArrayList<Programa> programa) {
        this.programa = programa;
    }

    public ArrayList<Grupo> getGrupos() {
        return this.grupos;
    }

    public void setGrupos(ArrayList<Grupo> grupos) {
        this.grupos = grupos;
    }

    @Override
    public String toString() {
        return "Estudiante [apellidos=" + apellidos + ",\nnombres=" + nombres + ",\nfechaNacimiento="
                + fechaNacimiento + ",\ncontrasegna=" + contrasegna + ",\nusuario=" + usuario + ",\ngrupos=" + grupos.size() + ",\nid=" + id + ",\nprogramas="
                + programa.size() + ",\npromedio=" + promedio + "]";
    }
    
    
}

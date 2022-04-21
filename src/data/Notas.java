package data;

public class Notas {

    private Estudiante estudiante;
    private Grupo grupo;
    private double Nota;

    
    // Constructors
    public Notas(Estudiante estudiante, Grupo grupo, double nota) {
        this.estudiante = estudiante;
        this.grupo = grupo;
        Nota = nota;
    }

    public Notas(double nota) {
        Nota = nota;
    }



    // Setters and Getters
    public Estudiante getEstudiante() {
        return this.estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Grupo getGrupo() {
        return this.grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public double getNota() {
        return this.Nota;
    }

    public void setNota(double Nota) {
        this.Nota = Nota;
    }

    // toString
    @Override
    public String toString() {
        return "Notas [Nota=" + Nota + ",\nestudiante=" + estudiante + ",\ngrupo=" + grupo + "]";
    }
    
}

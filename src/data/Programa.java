package data;

import java.util.ArrayList;

public class Programa {
	// Attributes
	private String nombre;
	private long id;
	private ArrayList<Materia> materias;
	private ArrayList<Estudiante> estudiantes;

	
	// Constructors
	public Programa(String nombre, long id, ArrayList<Materia> materias, ArrayList<Estudiante> estudiantes) {
		this.nombre = nombre;
		this.id = id;
		this.materias = materias;
		this.estudiantes = estudiantes;
	}

	public Programa(String nombre, long id) {
		this.nombre = nombre;
		this.id = id;
		this.materias = new ArrayList<Materia>();
		this.estudiantes = new ArrayList<Estudiante>();
	}



	// Setters and Getters
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public long getId() {
		return this.id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public ArrayList<Materia> getMaterias() {
		return this.materias;
	}
	public void setMaterias(ArrayList<Materia> materias) {
		this.materias = materias;
	}
	public ArrayList<Estudiante> getEstudiantes() {
		return this.estudiantes;
	}
	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

	// toString
	@Override
	public String toString() {
		return "Programa [estudiantes=" + estudiantes.size() + ",\nid=" + id + ",\nmaterias=" + materias.size() + ",\nnombre=" + nombre
				+ "]";
	}
	
}

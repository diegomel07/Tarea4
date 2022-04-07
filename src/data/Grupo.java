package data;

import java.util.ArrayList;
import java.util.Arrays;

public class Grupo {
	
	// Attributes
	private long id;
	private String[] diasSemana;
	private String[] vecesDia;
	private Materia representa;
	private Profesor enseniadoPor;
	private ArrayList<Estudiante> asistentes;
	private ArrayList<Notas> notas;
	
	
	// Constructors
	public Grupo(long id, String[] diasSemana, String[] vecesDia, Materia representa, Profesor enseniadoPor,
			ArrayList<Estudiante> asistentes, ArrayList<Notas> notas) {
		this.id = id;
		this.diasSemana = diasSemana;
		this.vecesDia = vecesDia;
		this.representa = representa;
		this.enseniadoPor = enseniadoPor;
		this.asistentes = asistentes;
		this.notas = notas;
	}

	public Grupo(long id, String[] diasSemana, String[] vecesDia) {
		this.id = id;
		this.diasSemana = diasSemana;
		this.vecesDia = vecesDia;
	}



	// Setters and getters
	public long getId() {
		return this.id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String[] getDiasSemana() {
		return this.diasSemana;
	}
	public void setDiasSemana(String[] diasSemana) {
		this.diasSemana = diasSemana;
	}
	public String[] getVecesDia() {
		return this.vecesDia;
	}
	public void setVecesDia(String[] vecesDia) {
		this.vecesDia = vecesDia;
	}
	public Materia getRepresenta() {
		return this.representa;
	}
	public void setRepresenta(Materia representa) {
		this.representa = representa;
	}
	public Profesor getEnseniadoPor() {
		return this.enseniadoPor;
	}
	public void setEnseniadoPor(Profesor enseniadoPor) {
		this.enseniadoPor = enseniadoPor;
	}
	public ArrayList<Estudiante> getAsistentes() {
		return this.asistentes;
	}
	public void setAsistentes(ArrayList<Estudiante> asistentes) {
		this.asistentes = asistentes;
	}
	public ArrayList<Notas> getNotas() {
		return this.notas;
	}
	public void setNotas(ArrayList<Notas> notas) {
		this.notas = notas;
	}

	// toString
	@Override
	public String toString() {
		return "Grupo [asistentes=" + asistentes + ", diasSemana=" + Arrays.toString(diasSemana) + ", enseniadoPor="
				+ enseniadoPor + ", id=" + id + ", notas=" + notas + ", representa=" + representa + ", vecesDia="
				+ Arrays.toString(vecesDia) + "]";
	}
	
}

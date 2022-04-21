package data;

import java.util.Date;

public class RecibosPago {
	private long id;
	private Estudiante estudiante;
	private double valor;
	private String semestre;
	private Date fechaOportuna;
	private Date fechaExtemporanea;

	
	// Constructors
	public RecibosPago(long id, Estudiante estudiante, double valor, String semestre, Date fechaOportuna,
			Date fechaExtemporanea) {
		this.id = id;
		this.estudiante = estudiante;
		this.valor = valor;
		this.semestre = semestre;
		this.fechaOportuna = fechaOportuna;
		this.fechaExtemporanea = fechaExtemporanea;
	}

	public RecibosPago(long id, double valor, String semestre, Date fechaOportuna, Date fechaExtemporanea) {
		this.id = id;
		this.valor = valor;
		this.semestre = semestre;
		this.fechaOportuna = fechaOportuna;
		this.fechaExtemporanea = fechaExtemporanea;
	}



	// Setters and Getters
	public long getId() {
		return this.id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Estudiante getEstudiante() {
		return this.estudiante;
	}
	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}
	public double getValor() {
		return this.valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getSemestre() {
		return this.semestre;
	}
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	public Date getFechaOportuna() {
		return this.fechaOportuna;
	}
	public void setFechaOportuna(Date fechaOportuna) {
		this.fechaOportuna = fechaOportuna;
	}
	public Date getFechaExtemporanea() {
		return this.fechaExtemporanea;
	}
	public void setFechaExtemporanea(Date fechaExtemporanea) {
		this.fechaExtemporanea = fechaExtemporanea;
	}

	// toString
	@Override
	public String toString() {
		return "RecibosPago [estudiante=" + estudiante + ",\nfechaExtemporanea=" + fechaExtemporanea + ",\nfechaOportuna="
				+ fechaOportuna + ",\nid=" + id + ",\nsemestre=" + semestre + ",\nvalor=" + valor + "]";
	}
	
}

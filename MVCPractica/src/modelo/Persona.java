package modelo;

public class Persona {
	
	private String nombre;
	private boolean tieneHijes;
	private String nacimiento;
	private long dni;
	private Estudio estudios;
	
	public Persona(String nombre, boolean tieneHijes, String nacimiento, long dni, Estudio estudios) {
		super();
		this.nombre = nombre;
		this.tieneHijes = tieneHijes;
		this.nacimiento = nacimiento;
		this.dni = dni;
		this.estudios = estudios;
		}
	
	public void edad() {
		
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isTieneHijes() {
		return tieneHijes;
	}
	public void setTieneHijes(boolean tieneHijes) {
		this.tieneHijes = tieneHijes;
	}
	public String getNacimiento() {
		return nacimiento;
	}
	public void setNacimiento(String nacimiento) {
		this.nacimiento = nacimiento;
	}
	public long getDni() {
		return dni;
	}
	public void setDni(long dni) {
		this.dni = dni;
	}
}
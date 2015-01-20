public class Persona {

	protected String nombre;
	protected String apellido;
	protected int edad;
	protected double sueldo;
	
	public Persona (String nombre, String apellido, int edad, double sueldo) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.sueldo = sueldo;
	}

	public String getNombre () {
		
		return nombre;
	}
	
	public String getApellido () {
		
		return apellido;
	}
	
	public int getEdad () {
		
		return edad;
	}
	
	public double getSueldo () {
		
		return sueldo;
	}
	
	public void mostrarDatos () {
		
		System.out.println("\n--- Datos ---");
		System.out.print("Nombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad);
	}
}
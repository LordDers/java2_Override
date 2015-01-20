public class Entrenador extends Persona {
	
	private int idEntrenador;
	private String titulacion;
	private int numAyudantes;
	
	public Entrenador (String nombre, String apellido, int edad, double sueldo) {
		
		super (nombre, apellido, edad, sueldo);
		/*idEntrenador = -1;
		titulacion = null;
		numAyudantes = 0;*/
	}
	
	public void setIdEntrenador (int id) {
		
		this.idEntrenador = id;
	}
	
	public int getIdEntrenador () {
		
		return idEntrenador;
	}
	
	public void setTitulacion (String titulo) {
		
		this.titulacion = titulo;
	}
	
	public String getTitulacion () {
		
		return titulacion;
	}
	
	public void setNumAyudantes (int ayudantes) {
		
		this.numAyudantes = ayudantes;
	}
	
	public int getNumAyudantes () {
		
		return numAyudantes;
	}

	@Override
	public void mostrarDatos () {
		
		System.out.println("\n--- Datos Entrenador ---");
		System.out.print("Nombre: " + nombre);
		System.out.print("\nApelido: " + apellido);
		System.out.print("\nEdad: " + edad);
		System.out.print("\nTitulación: " + titulacion);
		System.out.print("\nNúmero de Ayudantes: " + numAyudantes);
	}
}
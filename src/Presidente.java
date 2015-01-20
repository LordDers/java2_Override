public class Presidente extends Persona {
	
	private int numVotos;
	
	public Presidente (String nombre, String apellido, int edad, double sueldo) {
		
		super (nombre, apellido, edad, sueldo);
		/*numVotos = 0;*/
	}
	
	public void setNumVotos (int votos) {
		
		this.numVotos = votos;
	}
	
	public int getNumVotos () {
		
		return numVotos;
	}

	@Override
	public void mostrarDatos () {
		
		super.mostrarDatos();
		/*System.out.println("\n--- Datos Presidente ---");
		System.out.print("Nombre: " + nombre);
		System.out.print("\nApelido: " + apellido);
		System.out.print("\nEdad: " + edad);*/
		System.out.print("\nNúmero de votos obtenidos: " + numVotos);
	}
}
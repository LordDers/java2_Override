public class Futbolista extends Persona {
	
	private String club;
	private int dorsal;
	private boolean seleccion;
	
	public Futbolista (String nombre, String apellido, int edad, double sueldo) {
		
		super (nombre, apellido, edad, sueldo);
		/*club = null;
		dorsal = 0;
		seleccion = false;*/
	}
	
	public void setClub (String club) {
		
		this.club = club;
	}
	
	public String getClub () {
		
		return club;
	}
	
	public void setDorsal (int dorsal) {
		
		this.dorsal = dorsal;
	}
	
	public int getDorsal () {
		
		return dorsal;
	}
	
	public void setSeleccion (boolean seleccion) {
		
		this.seleccion = seleccion;
	}
	
	public boolean getSeleccion () {
		
		return seleccion;
	}

	@Override
	public void mostrarDatos () {
		
		System.out.println("\n--- Datos Futbolista ---");
		System.out.print("Nombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad);
		System.out.println("\nClub: " + club + "\nDorsal: " + dorsal);
		if (seleccion == true)
			System.out.println("Juega en la selección");
		else
			System.out.println("No juega en la selección");
	}
}
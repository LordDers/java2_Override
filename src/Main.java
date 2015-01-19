import java.util.Scanner;
import java.util.Hashtable;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		Hashtable <String, String> personasFutbolistas = new Hashtable <String, String> ();
		personasFutbolistas.put("Pepe", "Real Madrid");
		personasFutbolistas.put("Ruben", "Real Sociedad");
				
		System.out.println("Elige una opción: Futbolista(F), Entrenador(E) o Presidente(P)");
		char opcion = sc.next().charAt(0);
		
		if (opcion == 'f' || opcion == 'e' || opcion == 'p' || opcion == 'F' || opcion == 'E' || opcion == 'P') {
		
			Futbolista futbolista;
			
			System.out.println("--- Persona ---");
			System.out.print("Nombre: ");
			String nombre = sc.next();
			System.out.print("Apellido: ");
			String apellido = sc.next();
			System.out.print("Edad: ");
			int edad = sc.nextInt();
			System.out.print("Sueldo: ");
			double sueldo = sc.nextDouble();
			
			if (opcion == 'F' || opcion == 'f') {
				
				futbolista = new Futbolista (nombre, apellido, edad, sueldo);
				System.out.println("  --- Futbolista ---");
				System.out.print("Club: ");
				futbolista.setClub(sc.next());
				System.out.print("Dorsal: ");
				futbolista.setDorsal(sc.nextInt());
				System.out.print("Selección: ");
				String seleccion = sc.next();
				if (seleccion.equalsIgnoreCase("Si")) {
					futbolista.setSeleccion(true);
				}
				else {
					futbolista.setSeleccion(false);
				}
			
				futbolista.datosFutbolista();
				personasFutbolistas.put(nombre, futbolista.getClub());
			}
			
			if (opcion == 'E' || opcion == 'e') {
				
				Entrenador entrenador = new Entrenador (nombre, apellido, edad, sueldo);
				System.out.println("  --- Entrenador ---");
				System.out.print("Id Entrenador: ");
				entrenador.setIdEntrenador(sc.nextInt());
				System.out.print("Titulación: ");
				entrenador.setTitulacion(sc.next());
				System.out.print("Número de Ayudantes: ");
				entrenador.setNumAyudantes(sc.nextInt());

				entrenador.datosEntrenador();
			} 
			
			if (opcion == 'P' || opcion == 'p') {
				
				Presidente presidente = new Presidente (nombre, apellido, edad, sueldo);
				System.out.println("  --- Presidente ---");
				System.out.print("Número de votos: ");
				presidente.setNumVotos(sc.nextInt());

				presidente.datosPresidente();
			}
			
			System.out.println("\nSelecciona un nombre para ver su club: "  + personasFutbolistas.keySet());
			String selecNombre = sc.next();
			
			if (personasFutbolistas.containsKey(selecNombre)) {
				System.out.println("Club: " + personasFutbolistas.get(selecNombre));
			}
			else {
				System.out.println("El nombre seleccionado no está disponible");
			}
		}
		else {
			
			System.out.println("Opción incorrecta.");
		}
	}
}
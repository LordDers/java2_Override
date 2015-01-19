public class Club {
	
	private String nombre;
	private String pais;
	private String ciudad;
	private int numEmpleados;
	
	public void setNombre (String nombre) {
		
		this.nombre = nombre;
	}
	
	public String getNombre () {
		
		return nombre;
	}
	
	public void setPais (String pais) {
		
		this.pais = pais;
	}
	
	public String getPais () {
		
		return pais;
	}
	
	public void setCiudad (String ciudad) {
		
		this.ciudad = ciudad;
	}
	
	public String getCiudad () {
		
		return ciudad;
	}
	
	public void setNumEmpleados (int numeroemp) {
		
		this.numEmpleados = numeroemp;
	}
	
	public int getNNumEmpleados () {
		
		return numEmpleados;
	}
}
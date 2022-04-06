package herencia;

public class Empleado extends Persona {

	int num_legajo;
	String cargo;
	Double sueldo;
	
	
	
	
	public Empleado() {	
	}



	//para hacer este tipo de constructor con clase padre
	//se debe seleccionar las propiedades padres y seleccionar todo, luego generate
	public Empleado(int id, String dni, String nombre, 
			String apellido, String domicilio, String telefono,
			int num_legajo, String cargo, Double sueldo) {
		super(id, dni, nombre, apellido, domicilio, telefono);//con super se llama al constructor de la clase madre
		this.num_legajo = num_legajo;
		this.cargo = cargo;
		this.sueldo = sueldo;
	}



	public int getNum_legajo() {
		return num_legajo;
	}



	public void setNum_legajo(int num_legajo) {
		this.num_legajo = num_legajo;
	}



	public String getCargo() {
		return cargo;
	}



	public void setCargo(String cargo) {
		this.cargo = cargo;
	}



	public Double getSueldo() {
		return sueldo;
	}



	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

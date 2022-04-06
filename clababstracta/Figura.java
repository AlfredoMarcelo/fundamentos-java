package clababstracta;


//las clases abstractas no pueden ser instanciadas
//es usada como plantilla para otras clases
//una clase abstracta debe tener al menos un metodo de tipo abstracto
public abstract class Figura {

	protected double x;
	protected double y;
	
	
	//se cambian a metodo protected, para que puedan ser vistos solo por hijos
	protected Figura() {
	}
	
	


	//se cambian a metodo protected, para que puedan ser vistos solo por hijos
	protected Figura(double x, double y) {
		this.x = x;
		this.y = y;
	}





	//en los metodos abstractos no se agregan llaves con código para el metodo
	public abstract double calcularArea();
	
	//esta clase si puede tener constructores, pero solo puede ser usado por sus
	//hijos
	
}

package clababstracta;

//cuando se hace la herencia de la clase figura, se genera un error,
//esto se soluciona agregando el metodo abstracto de la clase padre.
public class Cuadrado extends Figura{
	
	//los atributos se generan en private
	private double lado;
	
	

	public Cuadrado() {
	}
	
	



	public Cuadrado(double x, double y, double lado) {
		super(x, y);
		this.lado = lado;
	}





	@Override
	public double calcularArea() {
		double resultado = lado * lado;
		return resultado;
	}

}

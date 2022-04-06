package clababstracta;

public class Circulo extends Figura {

	//los atributos se generan en private
	private double radio;
	
	
	
	
	
	
	public Circulo() {
		super();
	}

	




	public Circulo(double x, double y, double radio) {
		super(x, y);
		this.radio = radio;
	}






	@Override
	public double calcularArea() {
		double pi = 3.14;
		double resultado = pi * radio * radio;
		return resultado;
	}

}

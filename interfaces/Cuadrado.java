package interfaces;

//para indicar que la clase viene de una inteface se utiliza implements
//para agregar metodos de una interface se debe agregar una coma ,
//esto se llama herencia multiple
//se generara un error porque no se ha hecho la importacion de los metodos
//se debe agregar los metodos de las interfaces
public class Cuadrado implements Figura, Dibujable{

	
	private double lado;
	
	public Cuadrado() {
	}
	
	
	
	
	public Cuadrado(double lado) {
		this.lado = lado;
	}




	@Override
	public double calcularArea() {
		double resultado = lado * lado;
		return resultado;
	}



	//*****aqui se importa los metodos de la interface dibujable
	@Override
	public void dibujar() {
		System.out.println("estoy dibujando un cuadrado");
		
	}

}

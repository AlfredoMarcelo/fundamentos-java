package interfaces;


//para indicar que la clase viene de una inteface se utiliza implements
//para agregar mas interfaces se agrega una coma
// esto se llama herencia multiple
public class Circulo implements Figura,Dibujable,Rotable {

	private double radio;
	
	
	
	
	//en intefaces los constructores solo se hacen con los atributos de la clase
	public Circulo() {
	}





	public Circulo(double radio) {
		this.radio = radio;
	}





	@Override
	public double calcularArea() {
		double pi = 3.14;
		double resultado = pi * radio * radio;
		return resultado;
	}




	//aqui se importa los metodos de la interface Rotable
	@Override
	public void rotar() {
		System.out.println("estoy rotando un circulo");
		
	}




	//aqui se importa el metodo de la interface dibujable
	@Override
	public void dibujar() {
		System.out.println("estoy dibujando un circulo");
		
	}

	
	
}

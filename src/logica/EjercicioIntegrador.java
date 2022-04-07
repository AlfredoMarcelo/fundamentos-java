package logica;

public class EjercicioIntegrador {

	public static void main(String[] args) {
		
		Squirtle squirtle = new Squirtle();
		Charmander charmander = new Charmander();
		Bulbasor bulba = new Bulbasor();
		Pikachu pika = new Pikachu();
		
		squirtle.atacarAraniazo();
		squirtle.atacarHidrobomba();
		charmander.atacarAraniazo();
		charmander.atacarLanzallamas();
		bulba.atacarAraniazo();
		bulba.atacarDrenaje();
		pika.atacarAraniazo();
		pika.atacarImpacTrueno();

	}

}

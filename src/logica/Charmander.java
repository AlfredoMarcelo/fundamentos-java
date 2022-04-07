package logica;

public class Charmander extends Pokemon implements IFuego {
	
	
	public Charmander() {	
	}

	@Override
	protected void atacarPlacaje() {
		System.out.println("Hola soy Charmander y este es mi ataque Placaje");
		
	}

	@Override
	protected void atacarAraniazo() {
		System.out.println("Hola soy Charmander y este es mi ataque araniazo");
		
	}

	@Override
	protected void atacarMordisco() {
		System.out.println("Hola soy Charmander y este es mi ataque Mordisco");
		
	}

	@Override
	public void atacarPunioFuego() {
		System.out.println("Hola soy Charmander y este es mi ataque punio fuego interface");
		
	}

	@Override
	public void atacarLanzallamas() {
		System.out.println("Hola soy Charmander y este es mi ataque lanza llamas interface");
		
	}

	@Override
	public void atacarAscuas() {
		System.out.println("Hola soy Charmander y este es mi ataque ascuas interface");
		
	}
	
	
}

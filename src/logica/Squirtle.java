package logica;

public class Squirtle extends Pokemon implements IAgua {
	
	
	

	public Squirtle() {
	}
	
	
	
	
	

	@Override
	protected void atacarPlacaje() {
		System.out.println("Hola soy Squirtle y este es mi ataque placaje");
		
	}

	@Override
	protected void atacarAraniazo() {
		System.out.println("Hola soy Squirtle y este es mi ataque araniazo");
		
	}

	@Override
	protected void atacarMordisco() {
		System.out.println("Hola soy Squirtle y este es mi ataque mordisco");
		
	}

	@Override
	public void atacarHidrobomba() {
		System.out.println("Hola soy Squirtle y este es mi ataque Hidrobomba interface");
		
	}

	@Override
	public void atacarBurbuja() {
		System.out.println("Hola soy Squirtle y este es mi ataque Burbuja interface");
		
	}

	@Override
	public void atacarPistolaAgua() {
		System.out.println("Hola soy Squirtle y este es mi ataque pistola agua interface");
		
	}

	
}

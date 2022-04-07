package logica;

public class Bulbasor extends Pokemon implements IPlanta {

	
	
	public Bulbasor() {
	}

	@Override
	protected void atacarPlacaje() {
		System.out.println("Hola soy Bulbasor y este es mi ataque placaje");
		
	}

	@Override
	protected void atacarAraniazo() {
		System.out.println("Hola soy Bulbasor y este es mi ataque araniazo");
		
	}

	@Override
	protected void atacarMordisco() {
		System.out.println("Hola soy Bulbasor y este es mi ataque mordisco");
		
	}

	@Override
	public void atacarDrenaje() {
		System.out.println("hola soy bulbasor y este es mi ataque drenaje interface");
		
	}

	@Override
	public void atacarParalizar() {
		System.out.println("hola soy bulbasor y este es mi ataque paralizar interface");
		
	}

	
	
}

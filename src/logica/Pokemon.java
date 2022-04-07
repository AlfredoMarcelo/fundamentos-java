package logica;

/*
Recordar que las interfaces deben tener solo metodos y si se
esta utilzando una clase abstracta como padre, en esta es donde
deben estar las propiedades y atributos 
podemos hacer la pregunta ¿que hace ?
o ¿Que es ?
si predomina más el que hace, se utiliza interfaces,
si predomina el que es, se utiliza clases abstractas.
 */
public abstract class Pokemon {

	protected int numPokedex;
	protected String nombre;
	protected double peso;
	protected String sexo;
	protected int temporada;
	
	
	protected abstract void atacarPlacaje();
	protected abstract void atacarAraniazo();
	protected abstract void atacarMordisco();
	
	
	
	
}

package arraylist;

import java.util.ArrayList;
import java.util.List;

//cuando se utiliza list, se debe importar su libreria
//cuando se utiliza ArrayList, se debe importar su libreria
public class ArrayLists {

	public static void main(String[] args) {
		
		List <Persona> lista = new ArrayList<Persona>();
		lista.add(new Persona(1,"Alfredo", 30));
		lista.add(new Persona(2,"Marcelo", 20));
		lista.add(new Persona(3,"Pedro", 13));
		lista.add(new Persona(4,"Aljamain", 3));
		
		System.out.println("***************FOR*****************");
		//recorrer por indice
		
		//con lista.get(i), traemos las personas de la lista
		//con .getNombre(), hacemos el llamado del getters que trae el nombre de cada persona
		for(int i = 0;i<lista.size();i++) {
			System.out.println("prueba: "+lista.get(i).getNombre());
		}
		
		System.out.println("\n************Foreach**************");
		//recorrer elemento por elemento
		
		//Persona, por cada persona que sera representada por perso
		//perso es una variable auxiliar
		//guardada en :lista
		//al usar foreach, se pasa directamente el getters.
		for(Persona perso:lista) {
			System.out.println("prueba: " + perso.getNombre());
		}

	}

}

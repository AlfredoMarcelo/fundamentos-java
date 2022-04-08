package linkedists;

import java.util.LinkedList;
import java.util.List;

/*
las linkedlist, no tienen un indice bien identificados
estan hechas para ver registro por registro
se recomienda usar el foreach
ademas de agregar elementos al final de la lista, 
tambien lo puede hacer al comienzo*/
public class LinkedLists {

	public static void main(String[] args) {
		
		List <Persona> lista = new LinkedList<Persona>();
		lista.add(new Persona(1,"Luisina", 30));
		lista.add(new Persona(2,"Gabriel", 20));
		lista.add(new Persona(3,"Ibra", 13));
		lista.add(new Persona(4,"todocode", 3));
		
		//para agregar al principio de la lista
		//**** ESTO NO LO PERMITE EL ARRAYLIST******************************
		lista.add(0,new Persona(5,"probando",98));
		
		System.out.println("\n************Foreach**************");
		//recorrer elemento por elemento
		
		/*
		Persona, por cada persona que sera representada por perso
		perso es una variable auxiliar
		guardada en :lista
		al usar foreach, se pasa directamente el getters.*/
		for(Persona perso:lista) {
			System.out.println("prueba: " + perso.getNombre());
		}


	}

}

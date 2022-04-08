package linkedlistvsarraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListsVsArrayLists {

	public static void main(String[] args) {
		
		List<Persona> listaArray = new ArrayList<Persona>();
		listaArray.add(new Persona(1,"Luisina",30));
		listaArray.add(new Persona(2,"Gabriel",30));
		listaArray.add(new Persona(3,"Ibra",9));
		listaArray.add(new Persona(4,"Todocode",2));
		
		LinkedList<Persona> listaLinked = new LinkedList<Persona>();
		listaLinked.add(new Persona(1,"Luisina",30));
		listaLinked.add(new Persona(2,"Gabriel",30));
		listaLinked.add(new Persona(3,"Ibra",9));
		listaLinked.add(new Persona(4,"Todocode",2));
		
		
		//Remove en arraylist
		//aqui se pasa el indice
		listaArray.remove(1);
		
		//Remove en LinkedList
		//aqui se pasa el elemento
		String nombreBorrar = "Gabriel";
		for(Persona perso:listaLinked) {
			if(perso.getNombre().equals(nombreBorrar)) {
				listaLinked.remove(perso);
				break; //el break se utiliza para salir del bucle o ciclo 
				//esto es porque la lista se debe acomodar antes de volver a iterar
			}
		}
		
		System.out.println("-----------Luego de eliminar-----------");
		//recorrido por foreach
		System.out.println("----------------ArrayList----------");
		for(Persona persona:listaArray) {
			System.out.println("prueba: "+persona.getNombre());
		}
		
		System.out.println("\n--------Linkedlist------------------");
		for(Persona persona:listaLinked) {
			System.out.println("prueba link: "+ persona.getNombre()+persona.getNum());
		}
		
		//OTROS METODOS
		
		//Tamaño lista con SIZE
		System.out.println("\nEste es el tamaño de la lista");
		System.out.println("ArrayList: "+listaArray.size());
		System.out.println("LinkedList: "+listaLinked.size());
		
		//Obtener primer objeto
		System.out.println("\nPrimer y ultimo objeto(SOLO PARA LINKEDIST)");
		System.out.println("Primero de Linkedist: "+listaLinked.getFirst().toString());
		System.out.println("Ultimo de LinkedList: "+listaLinked.getLast().toString());
		
		//Borrar toda la lista con CLEAR
		
		System.out.println("\n----Borrando Listas----");
		listaArray.clear();
		listaLinked.clear();
		
		//Comprobar si esta vacia con ISEMPTY
		System.out.println("------------Esta vacia alguna lista?--------");
		System.out.println("ArraList: " + listaArray.isEmpty());
		System.out.println("LinkedList: " + listaLinked.isEmpty());
		
		
		
		
				

	}

}

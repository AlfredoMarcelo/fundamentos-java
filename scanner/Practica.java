import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Practica {
	
	public static void main(String[] args){
		/*int a = 4;
		a = a + 1;
		System.out.println(a);
		*/
		
		/* int edad = 34;
		String nombre = "Ton";
		String salida = String.format("%s tiene %d años.",nombre, edad);
		System.out.println(salida); */
		
		//substring
		
		/* String s = "LeonelMessi";
		System.out.printf("%s\n",s.substring(6));
		System.out.printf("%s\n",s.substring(0,6));
		int longitud = s.length();
		System.out.println(longitud);
		int pos = s.indexOf('M');
		System.out.println(pos); */
		
		/* Scanner sc = new Scanner( System.in );
		System.out.printf("Ingresa un numero del 1 al 10\n");
		int num = sc.nextInt();
		while(num < 1 || num >10){
			System.out.printf("El numero no esta entre el 1 y el 10 \n");
			System.out.printf("Ingresa un numero del 1 al 10 \n");
			num = sc.nextInt();
		}
		System.out.printf("El numero ingresado fue: %d \n", num); */
		
		/* Scanner teclado = new Scanner( System.in );
		System.out.println("Ingrese su password");
		String clave = teclado.nextLine();
		while(clave.compareTo("marco")!=0){
			System.out.printf("El password es incorrecto\n",clave);
			System.out.printf("Ingrese el password: ");
			clave = teclado.nextLine();
		}
		System.out.println("El password ingresado es correcto"); */
		
		//*********IF simple
		
		/* int num1 = 15;
		int num2 = 10;
		
		if(num2 > num1){
			System.out.println("El num2 es mayor que num1");
		}
		else{
			System.out.println("El num 1 es mayor al num 2");
		} */
		
		
		//*******IF else combinado
		
		
		/* double sueldo = 0;
		int categoria;
		
		System.out.println("Ingrese el tipo de categoria que desea calcular el sueldo\n");
		System.out.println("1. repositor\n2. cajero\n3. supervisor");
		Scanner teclado = new Scanner( System.in );
		categoria = teclado.nextInt();
		
		if(categoria == 1){
			sueldo = 15890 + (15890*0.10);
		}else{
			if(categoria == 2){
				sueldo = 25630.89;
			}else{
				if(categoria == 3){
					sueldo = 35560.20 - (35560.20*0.11);
				}else{
					System.out.println("Debe ingresar un numero de categoria valido");
				}
			}
		}
		if(categoria == 1 || categoria == 2 || categoria == 3){
			System.out.println("El total del sueldo para la categoria seleccionada "+ categoria + " es igual a: "+sueldo);
		 }*/
		
		
		//****while controlada por contador o centinela
		
		/* int cont = 1;
		
		while(cont <= 10){
			System.out.println("Estoy en la vuelta "+ cont);
			cont = cont + 1;
		}
 */		
		
		
		//****bucle for controlada por contador o centinela
		
		/* for (int i = 1; i<=10;i++){
			System.out.println("Estoy en la vuelta "+ i);
		} */
		
		
		//****vector arrays con asignación manual y como recorrerlo con for
		
		/* int vector [] = new int [4];
		
		Scanner teclado = new Scanner(System.in);
		for(int i = 0; i < vector.length;i++){
			System.out.println("Ingrese su numero a guardar");
			vector[i]=teclado.nextInt();
		}
		System.out.println("\nAqui tienes tus numeros:");
		for (int i = 0;i<vector.length;i++){
			System.out.println(vector[i]);
		} */
		
		
		//Siempre el primer valor sera la fila y el siguiente la columna
		int matriz [][] = new int [3][3];
		
		//asignacion manual
		matriz[0][0] = 5;
		matriz[0][1] = 13;
		matriz[0][2] = 96;
		matriz[1][0] = 35;
		matriz[1][1] = 33;
		matriz[1][2] = 71;
		matriz[2][0] = 446;
		matriz[2][1] = 228;
		matriz[2][2] = 24;
		
		//recorrido de vector con filas y columnas
		
		for(int f =0;f <3;f++){
			for(int c = 0;c<3;c++){
				System.out.println("El valor de la posicion f: "+f+" c: "+c);
				System.out.println("es de: "+matriz[f][c]);
			}
		}
	}
	
	
}
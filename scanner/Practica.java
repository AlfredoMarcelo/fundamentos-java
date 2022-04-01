import java.util.Scanner;

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
		
		Scanner sc = new Scanner( System.in );
		System.out.printf("Ingresa un numero del 1 al 10\n");
		int num = sc.nextInt();
		while(num < 1 || num >10){
			System.out.printf("El numero no esta entre el 1 y el 10 \n");
			System.out.printf("Ingresa un numero del 1 al 10 \n");
			num = sc.nextInt();
		}
		System.out.printf("El numero ingresado fue: %d \n", num);
	}
	
	
}
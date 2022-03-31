import java.util.Scanner;

public class Practica {
	
	public static void main(String[] args){
		System.out.println("Ingrese su nombre ");
		Scanner teclado = new Scanner( System.in );
		String nombre = teclado.nextLine();
		System.out.println("Ingrese su apellido ");
		String apellido = teclado.nextLine();
		System.out.println("Ingrese su avenida ");
		String direccion = teclado.nextLine();
		System.out.println("Ingrese el numero de casa ");
		int numeroDireccion = teclado.nextInt();
		System.out.println("Ingrese la ciudad ");
		String ciudad = teclado.next();
		System.out.println("Ingrese su telefono ");
		int telefono = teclado.nextInt();
		System.out.printf("%nDE: %s %s %n"
		+"Direccion: %s %d %n"
		+"Ciudad: %s %n"
		+"Contacto: %d %n",
		nombre, apellido, direccion, numeroDireccion, ciudad, telefono);
		
	
	}
	
}
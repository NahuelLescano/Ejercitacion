import java.util.Scanner;

public class Ejercicio8{

	public static void main(String [] args){

		Scanner input = new Scanner(System.in);

		System.out.println("Ingrese un número natural");
		int numero1 = Integer.parseInt(input.nextLine());

		System.out.println("Ingrese otro número natural");
		int numero2 = Integer.parseInt(input.nextLine());

		int suma = numero1 + numero2;
		System.out.println("La suma de los números es: " + suma);

		int resta = numero1 - numero2;
		System.out.println("La resta de los números es: " + resta);
		
		int multiplicacion = numero1 * numero2;
		System.out.println("La multiplicación de los números es: " + multiplicacion);
		
		double division = numero1 / numero2;
		System.out.println("La división de los números es: " + division);

	}
}

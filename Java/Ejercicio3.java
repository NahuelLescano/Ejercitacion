import java.util.Scanner;

public class Ejercicio3{
	
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Ingresa un número: ");
		int numero = Integer.parseInt(input.nextLine());

		int numero5 = numero * 5;

		System.out.println("El número original fue multiplicado por 5, el resultado es: " + numero5);

		float numero2 = numero / 2;

		System.out.println("El número original fue divido por 2, el resultado es: " + numero2);

	}

}

import java.util.Scanner;

public class Ejercicio2{

	public static void main(String [] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Ingrese la primera nota: ");
		int nota1 = Integer.parseInt(input.nextLine());

		System.out.println("Ingrese la segunda nota: ");
		int nota2 = Integer.parseInt(input.nextLine());

		System.out.println("Ingrese la tercera nota: ");
		int nota3 = Integer.parseInt(input.nextLine());

		double promedio = (nota1 + nota2 + nota3) / 3;

		System.out.println("El promedio de las notas es: " + promedio);
	}

}

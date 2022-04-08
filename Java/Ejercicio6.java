import java.util.Scanner;

public class Ejercicio6{

	public static void main(String [] args){

		Scanner input = new Scanner(System.in);
		final double SUELDO_FIJO = 44000;

		System.out.println("Ingrese el monto total de las ventas realizadas durante el mes");
		int ventas = Integer.parseInt(input.nextLine());

		double sueldo = SUELDO_FIJO + ventas * 0.16;
		System.out.println("el sueldo del vendedor este mes es: " + sueldo);

	}
}

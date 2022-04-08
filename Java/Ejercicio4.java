import java.util.Scanner;

public class Ejercicio4{

	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingrese el valor de la hora trabajada: ");
		int valorHoraTrabajada = Integer.parseInt(input.nextLine());

		System.out.println("Ingrese la cantidad de horas trabajadas por un trabajador: ");
		int cantHorasTrabajadas = Integer.parseInt(input.nextLine());

		double sueldo = cantHorasTrabajadas * valorHoraTrabajada + (cantHorasTrabajadas/2) * valorHoraTrabajada;

		System.out.println("El sueldo del trabajador es: $" + sueldo);
	}
}

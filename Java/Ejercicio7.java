import java.util.Scanner;

public class Ejercicio7{

	public static void main(String [] args){

		Scanner input = new Scanner(System.in);

		System.out.println("Ingrese el ancho del terreno en metros");
		int ancho = Integer.parseInt(input.nextLine());

		System.out.println("Ingrese el largo del terreno en metros");
		int largo = Integer.parseInt(input.nextLine());

		System.out.println("Ingrese el valor del metro cuadrado del terreno");
		int valor = Integer.parseInt(input.nextLine());

		/* ancho*largo (m²) ancho = 2m², largo = 10m²
		 * ancho*largo (m²) = 20m²
		 * 
		 * 1m² ---- $100
		 * 20m² --- x = (20 * 100) / 1 = $2000
		 * valorTotal = $2000
		 *
		 */
		int valorTotal = ancho * largo * valor;
		System.out.println("El valor total del terreno es: " + valorTotal);
		
		int cantDeAlambre = ancho * largo;
		System.out.println("La cantidad de alambre para cercar el terreno es: " + cantDeAlambre);
	}
}

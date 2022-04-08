import java.util.Scanner;

public class Ejercicio5{
	
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);

	    System.out.println("Ingrese un número natural: ");
	    int numero1 = Integer.parseInt(input.nextLine());

    	System.out.println("Ingrese otro número natural: ");
	    int numero2 = Integer.parseInt(input.nextLine());

	    System.out.println("numero1 vale " + numero1 + " y numero2 vale " + numero2);
    	System.out.println("Ahora los intercambio");
	
	    int aux = numero1;
	    numero1 = numero2;
	    numero2 = aux;
	
	    System.out.println("Ahora numero1 vale " + numero1 + " y numero2 vale " + numero2);
    }	
}

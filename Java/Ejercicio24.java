import java.util.Scanner;

public class Ejercicio24{

    public static void main(String [] args){
        
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int numero1 = Integer.parseInt(input.nextLine());

        System.out.println("Ingrese otro número: ");
        int numero2 = Integer.parseInt(input.nextLine());

        while(numero1 > numero2){
        System.out.println("Error!, el primero número ingresado debe ser menor o igual al segundo.");
        System.out.println("Ingrese un número: ");
        numero1 = Integer.parseInt(input.nextLine());

        System.out.println("Ingrese otro número: ");
        numero2 = Integer.parseInt(input.nextLine());       
        }

        for(int i=numero1; i<=numero2; i++)
			System.out.println("Resultado " + i);

		System.out.println("***");
		
		for(int i=numero1+1; i<numero2; i++) 
			System.out.println("Resultado " + i);	
    }
}

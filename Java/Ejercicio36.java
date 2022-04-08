import java.util.Scanner;

public class Ejercicio36{

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        double promedio = 0;

        System.out.println("Ingrese un número:");
        int numero = Integer.parseInt(input.nextLine());
        
        int i = 1;
        while(promedio < 20){
            promedio += numero / i;
            i++;
            System.out.println("Ingrese un número:");
            numero = Integer.parseInt(input.nextLine());
        }

        System.out.println("El promedio es superior a 20.");
    }
}

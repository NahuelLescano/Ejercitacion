import java.util.Scanner;

public class Ejercicio26{

    public static void main(String [] args){
        
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un número:");
        int numero = Integer.parseInt(input.nextLine());
        
        int valorAbsoluto = Math.abs(numero);
        if(valorAbsoluto % 5 == 0)
            System.out.println("El número ingresado es divisible por 5.");

        while(valorAbsoluto % 3 == 0 && valorAbsoluto % 5 != 0){
            int resultado = numero / 3;
            System.out.println("El número es divisible por 3 y no por 5, el resultado es: " + resultado);

        }
    }
}

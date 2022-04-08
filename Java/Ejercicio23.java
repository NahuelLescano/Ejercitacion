import java.util.Scanner;

public class Ejercicio23{

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un número entero: ");
        int numero = Integer.parseInt(input.nextLine());

        for(int i = 1; i <=10; i++)
            System.out.println("Los múltiplos de " + numero + " son: " + numero * i);
    }
}

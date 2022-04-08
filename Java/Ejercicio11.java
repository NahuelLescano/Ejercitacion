import java.util.Scanner;

public class Ejercicio11{

  public static void main(String [] args){

    Scanner input = new Scanner(System.in);

    System.out.println("Ingrese un número entero: ");
    int numero = Integer.parseInt(input.nextLine());

     if(numero % 2 == 0)
      System.out.println("El número es par");

    else
      System.out.println("El numero es impar");

  }
}

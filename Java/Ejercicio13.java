import java.util.Scanner;

public class Ejercicio13{

  public static void main(String [] args){

    Scanner input = new Scanner(System.in);

    System.out.println("Ingrese un número entero: ");
    int numero1 = Integer.parseInt(input.nextLine());

    System.out.println("Ingrese otro número entero: ");
    int numero2 = Integer.parseInt(input.nextLine());
  
    System.out.println("Ingrese un último número entero: ");
    int numero3 = Integer.parseInt(input.nextLine());

    if(numero1 > numero2 && numero1 > numero3)
      System.out.println(numero1 + " es el mayor número");

    else if(numero2 > numero1 && numero2 > numero3)
      System.out.println(numero2 + " es el mayor número");

    else
      System.out.println(numero3 + " es el mayor número");
  }
}

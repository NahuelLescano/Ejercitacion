import java.util.Scanner;

public class Ejercicio12{

  public static void main(String [] args){
    
    Scanner input = new Scanner(System.in);

    System.out.println("Ingrese un número entero: ");
    int numero1 = Integer.parseInt(input.nextLine());

    System.out.println("Ingrese otro número entero: ");
    int numero2 = Integer.parseInt(input.nextLine());
    
    if(numero1 > numero2)
      System.out.println(numero1 + " es más grande que " + numero2);

    else
      System.out.println(numero2 + " es más grande que " + numero1);

  }
}

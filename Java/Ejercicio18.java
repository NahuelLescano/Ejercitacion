import java.util.Scanner;

public class Ejercicio18{

  public static void main(String [] args){

    Scanner input = new Scanner(System.in);

    System.out.println("Ingrese un número: ");
    int numero1 = Integer.parseInt(input.nextLine());

    System.out.println("Ingrese otro número: ");
    int numero2 = Integer.parseInt(input.nextLine());
    
    if ((numero1 > numero2) && (numero1 % numero2 == 0))
      System.out.println(numero1 + " es divisible por " + numero2 + " y " + numero1 + " es mayor a " + numero2);

    else if ((numero1 < numero2) && (numero1 % numero2 == 0))
      System.out.println(numero1 + " es divisible por " + numero2 + " y " + numero2 + " es mayor a " + numero1);

    else
      System.out.println(numero1 + " no es divisible por " + numero2);
  }
}

import java.util.Scanner;

public class Ejercicio14{

  public static void main(String [] args){

    Scanner input = new Scanner(System.in);

    System.out.println("\t ###Bienvenidos a Infierno en las alturas####\n");

    System.out.println("Ingrese su edad: ");
    int edad = Integer.parseInt(input.nextLine());

    System.out.println("Ingrese su altura: ");
    double altura = Double.parseDouble(input.nextLine());

    if(edad < 7 && altura < 1.5)
      System.out.println("No podes ingresar a la montaña rusa.");

    else
      System.out.println("Podes pasar!");

  }
}

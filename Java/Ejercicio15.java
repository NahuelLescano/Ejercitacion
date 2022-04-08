import java.util.Scanner;

public class Ejercicio15{

  public static void main(String [] args){

    Scanner input = new Scanner(System.in);

    System.out.println("\t ###Bienvenidos a Miedo a las alturas###\n");

    System.out.println("Ingrese su edad: ");
    int edad = Integer.parseInt(input.nextLine());

    System.out.println("Ingrese su altura: ");
    double altura = Double.parseDouble(input.nextLine());

    if(edad >= 7 || altura >= 1.5)
      System.out.println("Podes ingresar!");

    else
      System.out.println("No podes ingresar.");
  }
}

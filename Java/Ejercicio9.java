import java.util.Scanner;

public class Ejercicio9{

  public static void main(String [] args){

    Scanner input = new Scanner(System.in);

    System.out.println("Ingrese el primer ángulo del triángulo en grados");
    double angulo1 = Double.parseDouble(input.nextLine());

    System.out.println("Ingrese el segundo ángulo del triángulo en grados");
    double angulo2 = Double.parseDouble(input.nextLine());

    /*
     * angulo1 + angulo2 + angulo3 = 180 => angulo3 = 180 - angulo1 - angulo2
     */

    double angulo3 =  180 - angulo1 - angulo2;
    System.out.println("El ángulo faltante es de: " + angulo3);
  } 
}

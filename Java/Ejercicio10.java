import java.util.Scanner;

public class Ejercicio10{

  public static void main(String [] args){
    
    Scanner input = new Scanner(System.in);

    System.out.println("Ingrese su nombre:");
    String nombre1 = input.nextLine();
    System.out.println("Ingrese su capital aportado:");
    double valor1 = Double.parseDouble(input.nextLine());

    System.out.println("Ingrese su nombre:");
    String nombre2 = input.nextLine();
    System.out.println("Ingrese su capital aportado:");
    double valor2 = Double.parseDouble(input.nextLine());

    System.out.println("Ingrese su nombre:");
    String nombre3 = input.nextLine();
    System.out.println("Ingrese su capital aportado:");
    double valor3 = Double.parseDouble(input.nextLine());

    double valorTotal = valor1 + valor2 + valor3;
    System.out.println("El valor total aportado es:" + valorTotal);

    double capital1 = valor1 / 100;
    System.out.println("El porcentaje aportado por " + nombre1 + " fue de %" + capital1);

    double capital2 = valor2 / 100;
    System.out.println("El porcentaje aportado por " + nombre2 + " fue de %" + capital2);

    double capital3 = valor3 / 100;
    System.out.println("El porcentaje aportado por " + nombre3 + " fue de %" + capital3);
  }
}

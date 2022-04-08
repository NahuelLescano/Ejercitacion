import java.util.Scanner;

public class Ejercicio21{

  public static void main(String [] args){
    
    Scanner input = new Scanner(System.in);

    System.out.println("Ingrese el número del día de la semana (del 1 al 7)");
    int dia = Integer.parseInt(input.nextLine());

    switch (dia){
      case 1:
        System.out.println("Es domingo!");
        break;

      case 2:
        System.out.println("Es lunes!");
        break;

      case 3:
        System.out.println("Es martes!");
        break;

      case 4:
        System.out.println("Es miércoles!");
        break;

      case 5:
        System.out.println("Es jueves!");
        break;

      case 6:
        System.out.println("Es viernes!");
        break;

      case 7:
        System.out.println("Es sábado!");
        break;

      default:
        System.out.println("No existe ese día de la semana flaco.");
        break;
    }
  }
}

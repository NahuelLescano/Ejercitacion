import java.util.Scanner;

public class Ejercicio20{
    
  public static void main(String [] args){
    
    Scanner input = new Scanner(System.in);

    System.out.println("Ingrese un número entero: ");
    int numero1 = Integer.parseInt(input.nextLine());

    System.out.println("Ingrese otro número entero: ");
    int numero2 = Integer.parseInt(input.nextLine());

    System.out.println("Que operación desea realizar? (+, -, *, /): ");
    char operacion = input.nextLine().charAt(0);

    switch(operacion){
      case '+':
        int suma = numero1 + numero2;
        System.out.println("La suma es: " + suma);
        break;
      
      case '-':
        int resta = numero1 - numero2;
        System.out.println("La resta es: " + resta);
        break;

      case '*':
        int multiplicacion = numero1 * numero2;
        System.out.println("La multiplicación es: " + multiplicacion);
        break;

      case '/':
        if (numero2 == 0){
          System.out.println("No se puede dividir por 0.");
          break;
        }
        
        double division = numero1 / numero2;
        System.out.println("La división es: " + division);
        break;

      default:
        System.out.println("Operador invalido");
    }
  }
}

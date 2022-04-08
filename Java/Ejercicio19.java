import java.util.Scanner;

public class Ejercicio19{

  public static void main(String [] args){
    
    Scanner input = new Scanner(System.in);
    
    boolean esDeUnDigito = false;
    boolean esImpar = false;
    boolean estaEnAmbos = false;
    boolean noEstaEnNinguno = false;

    System.out.println("Ingrese un número entero: ");
    int numero = Integer.parseInt(input.nextLine());
   
    int valorAbsoluto = Math.abs(numero);
    if(valorAbsoluto > 10 && valorAbsoluto % 2 != 0)
        esImpar = true;

    else if(valorAbsoluto > 10 && valorAbsoluto % 2 == 0)
        noEstaEnNinguno = true;

    else if(valorAbsoluto < 10 && valorAbsoluto % 2 != 0){
        esDeUnDigito = true;
        esImpar = true;
        estaEnAmbos = true;
    }

    else //valorAbsoluto < 10 && valorAbsoluto % 2 == 0
        esImpar = true;

    System.out.println("Es de un solo dígito: " + esDeUnDigito + ", es impar: " + esImpar + ", está en ambos: " + estaEnAmbos + " y no está en ninguno: " + noEstaEnNinguno);
  }
}

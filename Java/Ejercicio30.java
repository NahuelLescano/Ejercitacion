import java.util.Scanner;

public class Ejercicio30{

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la operación que quiere realizar, F para salir (+,-,*,/,F):");
        char operacion = input.nextLine().charAt(0);
        
        while(operacion != 'F'){
            System.out.println("Ingrese un número entero:");
            int numero1 = Integer.parseInt(input.nextLine());

            System.out.println("Ingrese otro número entero:");
            int numero2 = Integer.parseInt(input.nextLine());

            if(operacion == '+'){
                int suma = numero1 + numero2;
                System.out.println("El resultado de la suma es: " + suma);
            }

            else if(operacion == '-'){
                int resta = numero1 - numero2;
                System.out.println("El resultado de la resta es: " + resta);
            }

            else if(operacion == '*'){
                int multiplicacion = numero1 * numero2;
                System.out.println("El resultado de la multiplicación es: " + multiplicacion);
            }
            
            else if(operacion == '/'){
                if(numero2 == 0)
                    System.out.println("No se puede dividir por 0. Vuelva a ingresar los números.");
                
                else{
                    double division = numero1 / numero2;
                    System.out.println("El resultado de la división es: " + division);
                }
            }

            System.out.println("Ingrese la operación que quiere realizar, F para salir (+,-,*,/,F):");
            operacion = input.nextLine().charAt(0);

        }
    }
}

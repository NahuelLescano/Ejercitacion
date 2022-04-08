import java.util.Scanner;

public class Ejercicio28{

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un número entero positivo:");
        int numero = Integer.parseInt(input.nextLine());

        while(numero <= 0){
            System.out.println("Error! Ingrese un número mayor a 0:");
            numero = Integer.parseInt(input.nextLine());
        }

        int vector [] = new int [numero];
        int longitud = vector.length;

        for(int i = 0; i < longitud; i++){
            int m = i;
            System.out.println("Ingrese " + ++m + "º número:");
            vector[i] = Integer.parseInt(input.nextLine());
        }
        
        int n = 0;
        int posicion = 0;
        for(int j = 0; j < longitud; j++){
            if(n < vector[j]){
                n = vector[j];
                posicion = j;
            }
        }

        System.out.println("El mayor valor ingresado es: " + n + " en la posición: " + ++posicion);
    }
}

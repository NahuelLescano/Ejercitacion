import java.util.Scanner;

public class Ejercicio33{

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int valorMin = 0;
        int valorMax = 0;

        System.out.println("Ingrese algún valor entero, con 0 sale:");
        int valor = Integer.parseInt(input.nextLine());

        while(valor != 0){
            if(Math.abs(valor) > valorMax)
                valorMax = valor;
            
            else
                valorMin = valor;

        System.out.println("Ingrese algún valor entero, con 0 sale:");
        valor = Integer.parseInt(input.nextLine()); 
        }

        System.out.println("El valor máximo fue: " + valorMax + " y el valor mínimo fue: " + valorMin);
    }
}

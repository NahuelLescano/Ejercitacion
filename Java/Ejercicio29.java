import java.util.Scanner;

public class Ejercicio29{

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la nota, debe estar comprendida entre 0 y 10:");
        int nota = Integer.parseInt(input.nextLine());
        
        while(nota < 0 || nota > 10){
            System.out.println("Error! La nota debe estar entre 0 y 10");
            System.out.println("Ingrese nuevamente la nota:");
            nota = Integer.parseInt(input.nextLine());
        }

        if(nota >= 0 && nota <= 10)
            System.out.println("La nota fue correctamente ingresada!");
    }
}

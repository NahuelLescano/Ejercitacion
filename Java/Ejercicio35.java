import java.util.Scanner;

public class Ejercicio35{

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int edadMin = 999999;
        String nombreEdadMin;

        System.out.println("Ingrese el nombre de la persona (con * sale):");
        String nombre = input.nextLine();

        System.out.println("Ingrese la edad de la persona:");
        int edad = Integer.parseInt(input.nextLine());

        while(nombre != "*"){
            if(edad < edadMin){
                edadMin = edad;
                nombreEdadMin = nombre;
            }

            System.out.println("Ingrese el nombre de la persona (con * sale):");
            nombre = input.nextLine();

            System.out.println("Ingrese la edad de la persona:");
            edad = Integer.parseInt(input.nextLine());
        }
        
        System.out.println("El nombre de la persona más joven es: " + nombreEdadMin  + " y tiene " + edadMin + " años.");
    }
}

import java.util.Scanner;

public class Ejercicio34{

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int cantEdades = 0;

        System.out.println("ingrese la cantidad de jugadores del equipo de basket:");
        int cantJugadores = Integer.parseInt(input.nextLine());

        while(cantJugadores <= 0){
            System.out.println("Error! Vuelva a ingresar la cantidad de jugadores:");
            cantJugadores = Integer.parseInt(input.nextLine());
        }

        double alturas [] = new double[cantJugadores];
        int longitud = alturas.length;
       
        int i = 0;
        int n = i;
        System.out.println("Ingrese la altura del " + ++n + "º jugador:");
        double altura = Double.parseDouble(input.nextLine());
        while(i < longitud && altura != 0){
            alturas[i] = altura;
            System.out.println("Ingrese la altura del " + ++n + "º jugador:");
            altura = Double.parseDouble(input.nextLine());
            i++; 
        }

        for(int j = 0; j < longitud; j++)
            cantEdades += alturas[j];

        double promedio = cantEdades / longitud;
        
        System.out.println("El promedio de altura del equipo es: " + promedio);
    }
}

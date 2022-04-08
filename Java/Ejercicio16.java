import java.util.Scanner;

public class Ejercicio16{

  public static void main(String [] args){

    Scanner input = new Scanner(System.in);

    System.out.println("Ingrese la cantidad de inscriptos a la coferencia: ");
    int cantInscriptos = Integer.parseInt(input.nextLine());

    System.out.println("Ingrese la cantidad de asientos disponibles: ");
    int cantAsientosDisponibles = Integer.parseInt(input.nextLine());

    if(cantInscriptos > cantAsientosDisponibles){
      int asientosFaltantes = cantInscriptos - cantAsientosDisponibles;
      System.out.println("No alcanzan los asientos, faltan: "+ asientosFaltantes);
    }

    else
      System.out.println("Alcanzan los asientos!");
  }
}

import java.util.Scanner;

public class Ejercicio32{

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        final int NOTA_MIN = 4;
        final int NOTA_MAX = 10;
        final int AUSENTE = 0;
        final int ERROR_UNO = 1;
        final int ERROR_TRES = 3;

        System.out.println("Ingrese la nota:");
        int nota = Integer.parseInt(input.nextLine());

        while(nota != AUSENTE && nota == 2 && nota >= NOTA_MIN && nota <= NOTA_MAX){
            System.out.println("Vuelva a ingresar la nota:");
            nota = Integer.parseInt(input.nextLine());
        }

        if(nota == AUSENTE)
            System.out.println("Alumno ausente.");

        else if(nota == ERROR_UNO|| nota == ERROR_TRES)
            System.out.println("Error! Esa números no se usan!");

        else
            System.out.println("Error! Nota fuera de rango.");
    }
}

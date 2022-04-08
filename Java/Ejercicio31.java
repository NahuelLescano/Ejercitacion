import java.util.Scanner;

public class Ejercicio31{

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("¿Deseás continuar? [S/N]");
        char opcion = input.nextLine().charAt(0);

        //if(opcion == 'N' || opcion == 'n')
          //  System.out.println("No entra al ciclo");

        while(opcion == 'S' || opcion == 's'){
            System.out.println("¿Deseás continuar? [S/N]");
            opcion = input.nextLine().charAt(0);
        }
    }
}

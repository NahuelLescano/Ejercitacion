import java.util.Scanner;

public class Ejercicio27{

    public static void main(String [] args){
        
        Scanner input = new Scanner(System.in);
        int edades [] = new int [5];
        int longitud = edades.length;
        int cantidad = 0;

        for(int i = 0; i < longitud; i++){
            int n = i;
            System.out.println("Ingrese la " + ++n + "º edad:");
            edades[i] = Integer.parseInt(input.nextLine());
        }

        for(int j = 0; j < longitud; j++)
            cantidad += edades[j];
        
        double promedio = cantidad / longitud;

        System.out.println("El promedio de edades fue: " + promedio);

        for(int k = 0; k < longitud; k++){
            int edad = edades[k];
            if(edad % 2 != 0 && edad > 18)
                System.out.println(edad + " es impar y mayor a 18");
        }
    }
}

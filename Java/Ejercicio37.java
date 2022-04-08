import java.util.Scanner;

public class Ejercicio37{

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        final int TOPE = 12;
        boolean flag = false;

        System.out.println("Ingrese el sueldo del mes: ");
        double sueldo = Double.parseDouble(input.nextLine());

        int i = 1;
        while(i <= TOPE && !flag){
            if(sueldo < 0){
                flag = true;
                System.out.println("Chau");
   
            }
        
            System.out.println("Ingrese el sueldo del mes: ");
            sueldo = Double.parseDouble(input.nextLine());
            i++;
        }
    }
}

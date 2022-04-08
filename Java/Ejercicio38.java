import java.util.Scanner;

public class Ejercicio38{

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        final String USUARIO_CORRECTO = "admin";
        final String CONTRASENIA_CORRECTO = "123456";
        final int INTENTOS_MAX = 3;
        int intento = 0;

        System.out.println("Ingrese su usuario: ");
        String usuario = input.nextLine();

        System.out.println("Ingrese su contraseña: ");
        String contrasenia = input.nextLine();
        intento++;

        while((intento <= INTENTOS_MAX)  && (!usuario.equals(USUARIO_CORRECTO) || !contrasenia.equals(CONTRASENIA_CORRECTO))){
            System.out.println("Error! Usuario y/o contraseña incorrecto/s. Hiciste " + intento + " de 3 intentos. Vuelva a ingresarlos.");

            System.out.println("Ingrese su usuario: ");
            usuario = input.nextLine();

            System.out.println("Ingrese su contraseña: ");
            contrasenia = input.nextLine();

            intento++;

        }

        if(intento == INTENTOS_MAX) System.out.println("Acceso denegado.");

        else System.out.println("Acceso concebido.");
    }
}

import java.util.Scanner;

public class Ejercicio17{

  public static void main(String [] args){
    Scanner input = new Scanner(System.in);
	    final int JUB_F = 60;
	    final int JUB_M = 65;
	    final int EDAD_MIN = 1;
	    final int EDAD_MAX = 120;
	    final String MASCULINO = "H";
	    final String FEMENINO = "F";
	    
	    System.out.println("Ingrese su edad: ");
	    int edad = Integer.parseInt(input.nextLine());
	    if(edad > EDAD_MAX || edad < EDAD_MIN)
	    	System.out.println("Edad errónea");

	    System.out.println("Ingrese su género (F o M): ");
	    String genero = input.nextLine();
	    if(genero == MASCULINO || genero == FEMENINO) {
	    	if(genero == FEMENINO && edad >= JUB_F)
	    		System.out.println("Puede jubilarse");
	    	
	    	else if (genero == MASCULINO && edad >= JUB_M)
	    		System.out.println("Podes jubilarte");
	    	
	    	else
	    		System.out.println("No puede jubilarse, vaya a laburar");
	    } 
    }
  }
}

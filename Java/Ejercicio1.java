import java.util.Scanner; //Importa la liberia

public class Ejercicio1{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in); //Se crea el lector
		System.out.println("Hola!, por favor ingrese su nombre: ");
		String nombre = sc.nextLine(); //Se lee el nombre con nextLine() que retorna un String con el dato
		System.out.println("Bienvenido " + nombre);
	}
}

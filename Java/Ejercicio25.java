import java.util.Scanner;

public class Ejercicio25{

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el largo de la matriz:");
        int largo = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese el ancho de la matriz:");
        int ancho = Integer.parseInt(input.nextLine());

        //Valido que el usuario no me mande cualquier cosa.
        //Aunque esto no pide el ejercicio.
        while(largo <= 0 && ancho <= 0){
            System.out.println("Ingresó mal los datos, vuelva a ingresarlos");
            
            System.out.println("Ingrese el largo de la matriz:");
            largo = Integer.parseInt(input.nextLine());
        
            System.out.println("Ingrese el ancho de la matriz:");
            ancho = Integer.parseInt(input.nextLine());
        }

        /*
         * Para imprimirla utilizo dos estructuras for anidadas. La primera irá incrementando las filas, es decir, el valor de la X 
         * y la segunda incrementará por cada fila el valor de las columnas, es decir, la Y.
         */
        int matriz [][] = new int [largo][ancho];
        for(int x = 0; x < matriz.length; x++){
            System.out.print("|");
            for(int y = 0; y < matriz[x].length; y++){
                System.out.print("x"); //Imprime por pantalla sin salto de línea
                
                /*
                 * Además añadí una tabulación, es decir, una separación entre cada posición. La tabulación la aplico detrás de 
                 * cada número, excepto del último. Es por ello que hago la validación
                 */
                if(y != matriz[x].length-1) 
                    System.out.print("\t");
            }

            System.out.println("|");
        }
    }
}
//Me guié de https://lineadecodigo.com/java/imprimir-una-matriz-con-java/ para resolver el ejercicio

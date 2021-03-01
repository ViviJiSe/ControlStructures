import java.io.PrintStream;
import java.util.Scanner;
import java.lang.Math;

public class ControlStructuresExample4 {

    private static PrintStream out = new PrintStream(System.out);
    private static Scanner in = new Scanner(System.in);

    /**
     * Esto es una descripción de un metodo.
     * En este metodo main, vamos a ver un ejemplo de una reestructura de control
     * que se llama ciclo FOR. Esta nos permite ejecutar repeticiones de un bloque
     * de codigo una cantidad determinada de veces.
     * @param args
     */

    public static void main(String[] args) {

        int counter = 0;

        while (counter < 100){
            out.println("El valor de counter es: "+ counter);
            counter++; // tome el valor actual de counter e incrementelo en 1

        }
//
//        for (int counter = 50; counter <= 200; ++counter){
//            out.println("El valor de counter es: "+ counter);
//        }






    }

}

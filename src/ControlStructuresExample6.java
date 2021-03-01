import java.io.PrintStream;
import java.util.Scanner;
import java.lang.Math;

public class ControlStructuresExample6 {

    private static PrintStream out = new PrintStream(System.out);
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        out.print("Type the dimension of the matrix: ");

        int dimensionOfMatrix = in.nextInt();

        for ( int rows = 0; rows< dimensionOfMatrix; ++rows){
            // Cada vez que este ciclo se ejecuta estamos cambiando de linea,
            // puesto que este bloque construye el contenido de la fila

            String row = "";

            for (int columns = 0; columns < dimensionOfMatrix; ++columns){
                row += "\t 0";
            }
            out.println(row);
        }
    }
}

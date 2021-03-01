import java.io.PrintStream;
import java.util.Scanner;
import java.lang.Math;

public class ControlStructuresExample2 {
    private static PrintStream out = new PrintStream(System.out);
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        // Greater than >
        // Less than <
        //Greater or equal <=
        // Less or equal >=
        // Equals ==
        // Not equal !=

        int x = -5;

        int result = 0;

        if (x > 1) {
            result = x + 1;
        } else if (x <= 1) {
            result = 2 * x + 1;
        }
        out.println("El valor final de x es: " + result);

        out.print("Digite un numero: ");
        x = in.nextInt();

        double result2 = 0;

        if (x == 5) {
            result2 = (Math.pow(x, 2.0) + 1) / 2.0;
        } else if (x > 5) {
            result2 = Math.pow((x / 2.0), 2.0);
        } else if (x < 5) {
            result2 = Math.pow(x, 3.0) + 3.0;
        }

        out.println("F(" + x + ")= " + result2);

        boolean keepAskingForNum = true;

        while (keepAskingForNum) {

            out.print("Digite un numero: ");
            x = in.nextInt();

            if (x != 0) {

                double result3 = 0;

                if (x == 5) {
                    result3 = (Math.pow(x, 2.0) + 1) / 2.0;
                } else if (x > 5) {
                    result3 = Math.pow((x / 2.0), 2.0);
                } else if (x < 5) {
                    result3 = Math.pow(x, 3.0) + 3.0;
                }
                out.println("F(" + x + ")= " + result3);

            } else {
                keepAskingForNum = false;
            }
        }
        out.println("El programa ha finalizado");
    }
}

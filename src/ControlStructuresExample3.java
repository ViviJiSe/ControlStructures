import java.io.PrintStream;
import java.util.Scanner;

public class ControlStructuresExample3 {
    private static PrintStream out = new PrintStream(System.out);
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        double x = 0;

        do {
            out.print("Digite un numero: ");
            int number = in.nextInt();

            if (number > 10 && number < 20){
                x = Math.pow(number,2)+2;
            } else {
                x = Math.pow(((number+5)/3),2);
            }

                out.println("F("+number+") =" +x);

        } while (!( x > 50 && x % 2 == 0));

        out.println("El programa ha terminado");
    }
}

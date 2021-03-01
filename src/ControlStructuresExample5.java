import java.io.PrintStream;
import java.util.Scanner;
import java.lang.Math;

public class ControlStructuresExample5 {

    private static PrintStream out = new PrintStream(System.out);
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int numberProvidedByTheUser = 0;

        do {
            out.print("Digite un número entre 2 y 9: ");
            numberProvidedByTheUser = in.nextInt();

        }while (!(numberProvidedByTheUser > 2 && numberProvidedByTheUser <10));

        for (int firstMultiple = 1; firstMultiple <= numberProvidedByTheUser; ++firstMultiple){
            for (int secondMultiple =0; secondMultiple <=10; ++secondMultiple){

                out.println("[" + firstMultiple + "x" + secondMultiple +"]= " + firstMultiple * secondMultiple);

            }

        }
    }
}

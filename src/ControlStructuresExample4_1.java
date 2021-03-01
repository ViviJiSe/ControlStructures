import java.io.PrintStream;
import java.util.Scanner;
import java.lang.Math;

public class ControlStructuresExample4_1 {
    private static PrintStream out = new PrintStream(System.out);
    private static Scanner in = new Scanner(System.in);

      public static void main(String[] args) {

          out.print("Digite un numero: ");

          int numFromTheUser = in.nextInt();

          int squareRootFromUsersNum = (int)Math.sqrt(numFromTheUser);

          for (int counter = 2; counter<= squareRootFromUsersNum; ++counter){
              if (numFromTheUser % counter ==0){
                  out.println( "El número: "+ counter + " es un divisor de: " +numFromTheUser);
              }
              else {
                  out.println("El número: " + counter + " NO es un divisor de: " +numFromTheUser);
              }

          }



      }


}

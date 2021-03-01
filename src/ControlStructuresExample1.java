import java.io.PrintStream;
import java.util.Scanner;

public class ControlStructuresExample1 {
    private static PrintStream out = new PrintStream(System.out);
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        boolean itIsRaining = true;
        boolean weAreLearningJava = true;
        boolean weAreInAParty = false;
        boolean thereIsNoPandemia = false;

        // Conditional operators

        //----------------------------------------------------------
            //and &&
        //----------------------------------------------------------

        if(itIsRaining && weAreInAParty){
            out.println("Está lloviendo y estamos en una fiesta");
        }

        if(itIsRaining && weAreInAParty && thereIsNoPandemia){
            out.println("Está lloviendo y estamos en una fiesta");
        }

        //----------------------------------------------------------
            //or ||
        //----------------------------------------------------------

        int magicNumber =0;

        if (itIsRaining || weAreInAParty){
            magicNumber=10;
            out.println("Está lloviendo y estamos en una fiesta");
            out.println("The current magic number is: " + magicNumber);
        }
        //----------------------------------------------------------
            //Greater than >
        //----------------------------------------------------------

        if (itIsRaining || weAreInAParty && magicNumber >-1) {
            magicNumber = 10;
            out.println("Está lloviendo y estamos en una fiesta");
            out.println("The current magic number is: " + magicNumber);
        }
        //----------------------------------------------------------
            //Less than <
        //----------------------------------------------------------

        magicNumber = 0;
        if (itIsRaining || weAreInAParty && magicNumber <-1) {
            magicNumber = 10;
            out.println("Está lloviendo y estamos en una fiesta");
            out.println("The current magic number is: " + magicNumber);
        }
        //----------------------------------------------------------
            //Greater or equal >=
        //----------------------------------------------------------

        magicNumber =-1;
        if (itIsRaining || weAreInAParty && magicNumber >= -1) {
            magicNumber = 10;
            out.println("Está lloviendo y estamos en una fiesta");
            out.println("The current magic number is: " + magicNumber);
        }
        //----------------------------------------------------------
            //Less or equal <=
        //----------------------------------------------------------

        magicNumber =-1;
        if (itIsRaining || weAreInAParty && magicNumber <= -1) {
            magicNumber = 10;
            out.println("Está lloviendo y estamos en una fiesta");
            out.println("The current magic number is: " + magicNumber);
        }

        //----------------------------------------------------------
            // Equals ==
        //----------------------------------------------------------

        magicNumber =-1;
        if (itIsRaining || weAreInAParty && magicNumber == -1) {
            magicNumber = 10;
            out.println("Está lloviendo y estamos en una fiesta");
            out.println("The current magic number is: " + magicNumber);
        }
        //----------------------------------------------------------
            //Not equal !=
        //----------------------------------------------------------

        magicNumber =-1;
        if (itIsRaining || weAreInAParty && magicNumber != -1) {
            magicNumber = 10;
            out.println("Está lloviendo y estamos en una fiesta");
            out.println("The current magic number is: " + magicNumber);
        }

    }

}

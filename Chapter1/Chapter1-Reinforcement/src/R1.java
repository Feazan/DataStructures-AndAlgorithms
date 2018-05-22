import java.util.Scanner;
import static java.lang.Character.*;

/**
 * Solution for Data Structures and Algorithms 6th edition --
 * Reinforcement R-1.1
 *
 * @author Feazan Yaseen
 */
public class R1
{
    public static void main(String[] args)
    {
        System.out.println("Input all base type");
        inputAllBaseTypes();
    }

    /**
     * This function asks for user input and determine
     * whether all of the base types are entered and terminates
     * once all base types are entered
     *
     * Base types as defined Data Structures and Algorithms 6th Edition, Michael T. Goodrich,‎ Roberto Tamassia,‎
     * Michael H. Goldwasser
     *
     * Page 4.
     */
    private static void inputAllBaseTypes()
    {
        // Set up Scanner -- Will overwrite value as program executes
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a boolean: ");

        // While the value entered is not a boolean ask for correct input
        while (!input.hasNextBoolean())
        {
            System.out.print("Not a boolean, try again: ");
            input = new Scanner(System.in);
        }
        System.out.println("You entered: " + input.nextBoolean());

        // While the value entered is not a char ask for correct input
        System.out.print("Enter a char: ");
        input = new Scanner(System.in);
        char c = input.toString().charAt(0);
        while (!isLetter(c))
        {
            System.out.print("Not a char, try again: ");
            input = new Scanner(System.in);
        }
        System.out.println("You entered: " + input.next().charAt(0));

        // While the value entered is not a byte ask for correct input
        System.out.print("Enter a byte: ");
        input = new Scanner(System.in);
        while (!input.hasNextByte())
        {
            System.out.print("Not an byte, try again: ");
            input = new Scanner(System.in);
        }
        System.out.println("You entered: " + input.nextByte());

        // While the value entered is not a short ask for correct input
        System.out.print("Enter a short: ");
        input = new Scanner(System.in);
        while (!input.hasNextShort())
        {
            System.out.print("Not a short, try again: ");
            input = new Scanner(System.in);
        }
        System.out.println("You entered: " + input.nextShort());

        // While the value entered is not a int ask for correct input
        System.out.print("Enter a int: ");
        input = new Scanner(System.in);
        while (!input.hasNextInt())
        {
            System.out.print("Not a int, try again: ");
            input = new Scanner(System.in);
        }
        System.out.println("You entered: " + input.nextInt());

        // While the value entered is not a long ask for correct input
        System.out.print("Enter a long: ");
        input = new Scanner(System.in);
        while (!input.hasNextLong())
        {
            System.out.print("Not a long, try again: ");
            input = new Scanner(System.in);
        }
        System.out.println("You entered: " + input.nextLong());

        // While the value entered is not a float ask for correct input
        System.out.print("Enter a float: ");
        input = new Scanner(System.in);
        while (!input.hasNextFloat())
        {
            System.out.print("Not a float, try again: ");
            input = new Scanner(System.in);
        }
        System.out.println("You entered: " + input.nextFloat());

        // While the value entered is not a double ask for correct input
        System.out.print("Enter a double: ");
        input = new Scanner(System.in);
        while (!input.hasNextDouble())
        {
            System.out.print("Not a double, try again: ");
            input = new Scanner(System.in);
        }
        System.out.println("You entered: " + input.nextDouble());
    }
}
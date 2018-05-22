import java.util.Scanner;

/**
 * Solution for Data Structures and Algorithms 6th edition --
 * Creativity C-1.16
 *
 * @author Feazan Yaseen
 */
public class C16
{
    public static void main (String[] args)
    {
        int a, b, c;
        System.out.print("Please Enter a number: ");
        Scanner number = new Scanner(System.in);
        while (!number.hasNextInt()) // Ensure input is valid
        {
            System.out.print("Not an int, please enter an integer: ");
            number = new Scanner(System.in);
        }
        a = number.nextInt();

        System.out.print("Please Enter a number: ");
        while (!number.hasNextInt()) // Ensure input is valid
        {
            System.out.print("Not an int, please enter an integer: ");
            number = new Scanner(System.in);
        }
        b = number.nextInt();

        System.out.print("Please Enter a number: ");
        while (!number.hasNextInt()) // Ensure input is valid
        {
            System.out.print("Not an int, please enter an integer: ");
            number = new Scanner(System.in);
        }
        c = number.nextInt();

        if (arithmeticFormula(a, b, c))
            System.out.println("The numbers can be used in a correct arithmetic formula");
        else
            System.out.println("The numbers cannot be used in correct arithmetic formula");
    }

    /**
     * This function will determine whether or not three given numbers
     * can have basic arithmetic operations preformed on it and result in the
     * third number
     *
     * @param a - first number
     * @param b - second number
     * @param c - third number which is the solution of some operation
     * @return True/False depending on whether the case passes
     */
    private static boolean arithmeticFormula(int a, int b, int c)
    {
        return a + b == c || a - b == c || a * b == c || a / b == c;
    }
}

import java.util.Scanner;

/**
 * Solution for Data Structures and Algorithms 6th edition --
 * Reinforcement R-1.3
 *
 * @author Feazan Yaseen
 */
public class R3
{
    public static void main (String[] args)
    {
        // Print the question
        System.out.println("Given two long values, n and m, isMultiple returns true if and only if n is a multiple of m\n");

        // Take first input, m
        System.out.print("Please enter value for m: ");
        Scanner input = new Scanner(System.in);
        while (!input.hasNextLong()) // Ensure input is valid
        {
            System.out.print("Not a long, please enter value for m: ");
            input = new Scanner(System.in);
        }
        long m = input.nextLong();

        // Take second input, n
        System.out.print("Please enter value for n: ");
        input = new Scanner(System.in);
        while (!input.hasNextLong()) // Ensure it is valid
        {
            System.out.print("Not a long, please enter value for n: ");
            input = new Scanner(System.in);
        }
        long n = input.nextLong();

        // Determine the answer
        System.out.println("Is " + n + " a multiple of " + m + " ?");
        System.out.println(isMultiple(m, n));
    }

    /**
     * Given two numbers n and m, this function determines
     * if n is a multiple of m
     *
     * @param m - a long, is n a multiple of this number?
     * @param n - a long, is n divisible by m?
     *
     * @return true if n is a multiple of m or false if n is not
     */
    private static boolean isMultiple(long m, long n)
    {
        return n % m == 0;
    }
}
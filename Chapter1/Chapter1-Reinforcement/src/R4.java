import java.util.Scanner;

/**
 * Solution for Data Structures and Algorithms 6th edition --
 * Reinforcement R-1.4
 *
 * @author Feazan Yaseen
 */
public class R4
{
    public static void main (String[] args)
    {
        // Print the question
        System.out.println("Write a short Java method, isEven, that takes an int i and returns true if and only\n" +
                "if i is even. Your method cannot use the multiplication, modulus, or division\n" +
                "operators, however.\n");

        // Take input
        System.out.print("Please enter value: ");
        Scanner input = new Scanner(System.in);
        while (!input.hasNextInt()) // Ensure input is valid
        {
            System.out.print("Not an int, please enter valid value: ");
            input = new Scanner(System.in);
        }

        // Determine the answer
        int userNum = input.nextInt();
        System.out.println("Is " + userNum + " Even?");
        System.out.println(isEven(userNum));
    }

    /**
     * Determines if a given number is even
     * without the use of multiplication, modulus or division
     *
     * @param num - an int, test whether num is even
     *
     * @return true if num is even, false if num is not
     */
    private static boolean isEven(int num)
    {
        int numToCompare = 0;
        boolean even = true; // Initially true, because break condition will check for false
        while (numToCompare != num)
        {
            // Keep adding two until numToCompare == num
            numToCompare += 2;
            // If numToCompare is greater than num, it is not even
            if (numToCompare > num)
            {
                // set boolean value to return
                even = false;
                break;
            }
        }
        return even;
    }
}
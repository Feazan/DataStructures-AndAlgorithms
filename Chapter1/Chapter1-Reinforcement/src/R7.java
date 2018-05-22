import java.util.Scanner;

/**
 * Solution for Data Structures and Algorithms 6th edition --
 * Reinforcement R-1.7
 *
 * @author Feazan Yaseen
 */
public class R7
{
    public static void main (String[] args)
    {
        // Print the question
        System.out.println("Write a short Java method that takes an integer n and returns the sum of the\n" +
                "squares of all positive integers less than or equal to n.\n");

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
        System.out.println("Squared sum from 0 to " + userNum + " is: " + squareSumToNum(userNum));
    }

    /**
     * Sums all positive odd numbers less than or equal to num
     *
     * @param num - int
     *
     * @return sum - a sum of all odd positive numbers less than or equal to num
     */
    private static int squareSumToNum(int num)
    {
        int sum = 0;
        // Run a loop from reverse from sum to 0
        for (int i = num; i > 0; i--)
        {
            sum += (i * i); // Add all odd positive numbers to sum
        }
        return sum;
    }
}
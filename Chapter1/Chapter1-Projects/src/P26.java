import java.util.Scanner;

/**
 * Solution for Data Structures and Algorithms 6th edition --
 * Creativity P-1.26
 *
 * Write a short Java program that takes all the lines input to standard input and
 * writes them to standard output in reverse order. That is, each line is output in the
 * correct order, but the ordering of the lines is reversed.
 *
 * @author Feazan Yaseen
 */
public class P26
{
    public static void main (String[] args)
    {
        reverseLine();
    }

    /**
     * This method first asks how many lines one would like to input
     * then create an array taking in the amount of lines specified
     * and finally print them back in reverse order
     */
    private static void reverseLine()
    {
        System.out.print("How many lines will you enter? ");
        Scanner scan = new Scanner(System.in);
        String[] input = new String[Integer.parseInt(scan.nextLine())];

        for (int i = 0; i < input.length; i++)
        {
            input[i] = scan.nextLine();
        }

        for (int i = input.length - 1; i >= 0; i--)
        {
            System.out.println(input[i]);
        }
    }
}

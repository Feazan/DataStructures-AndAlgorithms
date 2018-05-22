import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Solution for Data Structures and Algorithms 6th edition --
 * Reinforcement R-1.8
 *
 *
 * @author Feazan Yaseen
 */
public class R8
{
    public static void main (String[] args)
    {
        // Print the question
        System.out.println("Write a short Java method that counts the number of vowels in a given character string.\n");

        // Take input
        System.out.print("Please enter string: ");
        Scanner input = new Scanner(System.in);

        int count = countVowel(input.nextLine());
        System.out.println("Number of vowels is: " + count);
    }

    /**
     * Counts the number of vowels in a given string
     * by checking if each element is in a set of vowels
     *
     * @param input - String
     *
     * @return vowelCount - a count of all vowels in input
     */
    private static int countVowel(String input)
    {
        int vowelCount = 0;
        // Set of vowels
        Set<Character> vowelSet = new HashSet<>(Arrays.asList('a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U'));
        for (int i = 0; i < input.length(); i++)
        {
            // if the char in the string is the set, increment count
            if (vowelSet.contains(input.charAt(i)))
            {
                vowelCount++;
            }
        }

        // return the count
        return vowelCount;
    }
}
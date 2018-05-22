import java.util.Scanner;

/**
 * Solution for Data Structures and Algorithms 6th edition --
 * Reinforcement R-1.9
 *
 *
 * @author Feazan Yaseen
 */
public class R9
{
    public static void main (String[] args)
    {
        // Print the question
        System.out.println("Write a short Java method that uses a StringBuilder instance to remove all the\n" +
                " punctuation from a string s storing a sentence.\n");

        // Take input
        System.out.print("Please enter string: ");
        Scanner input = new Scanner(System.in);

        String removedPunctuation = removePunctuation(input.nextLine());
        System.out.println(removedPunctuation);
    }

    /**
     * Remove and return all punctuation from input String
     *
     * @param input - String
     *
     * @return s - A string with removed punctuation
     */
    private static String removePunctuation(String input)
    {
        // Convert input to stringBuilder
        StringBuilder s = new StringBuilder(input);
        // Loop through elements
        for (int i = 0; i < s.length(); i++)
        {
            // If the character is a punctuation, remove it
            if (s.charAt(i) == '.' || s.charAt(i) == ',' || s.charAt(i) == '?' || s.charAt(i) == '!'
                    || s.charAt(i) == '\'' || s.charAt(i) == '\"' || s.charAt(i) == ':'
                    || s.charAt(i) == ';')
            {
                s.deleteCharAt(i);
            }
        }

        // Return the string
        return s.toString();
    }
}
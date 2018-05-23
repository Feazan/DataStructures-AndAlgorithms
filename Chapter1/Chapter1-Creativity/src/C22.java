/**
 * Solution for Data Structures and Algorithms 6th edition --
 * Creativity C-1.22
 *
 * Write a short Java program that outputs all possible strings formed by using the
 * characters 'c', 'a', 't', 'd', 'o', and 'g' exactly once.
 *
 * https://stackoverflow.com/a/4240323
 * @author Feazan Yaseen
 */
public class C22
{

    public static void main (String[] args)
    {
        permutation("catdog");
    }

    private static void permutation(String str)
    {
        permutation("", str);
    }

    private static void permutation(String prefix, String str)
    {
        int n = str.length();
        if (n == 0)
            System.out.println(prefix);
        else
        {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
        }
    }
}

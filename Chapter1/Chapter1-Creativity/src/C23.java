import java.util.Arrays;

/**
 * Solution for Data Structures and Algorithms 6th edition --
 * Creativity C-1.23
 *
 * Write a short Java program that takes two arrays a and b of length n storing int
 * values, and returns the dot product of a and b in an array which stores the product
 * of each cell
 *
 * @author Feazan Yaseen
 */
public class C23
{
    public static void main(String[] args)
    {
        int[] first = {1, 3, 5, 7, 9};
        int[] second = {2, 4, 6, 8, 10};

        int[] product = dotProduct(first, second);
        if (product.length > 0)
            System.out.println("The dot product array of a and b is: " + Arrays.toString(product));
        else
            System.out.println("The length of two arrays did not match");
    }

    /**
     * This method returns an array, result, which stores the product of each corresponding element
     * in each cell. Also does some basic error checking to ensure both arrays are of equal length
     *
     * @param a - an array of ints
     * @param b - an array of ints
     * @return - An array of each products
     */
    private static int[] dotProduct(int[] a, int[] b)
    {
        int[] result = new int[0];
        if (a.length != b.length)
            return result;
        else
        {
            result = new int[a.length];
            for (int i = 0; i < a.length; i++)
            {
                result[i] = a[i] * b[i];
            }
            return result;
        }
    }
}

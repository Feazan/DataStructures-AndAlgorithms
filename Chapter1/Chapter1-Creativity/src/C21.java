import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Solution for Data Structures and Algorithms 6th edition --
 * Creativity C-1.21
 *
 * Write a Java method that takes an array containing the set of all integers in the
 * range 1 to 52 and shuffles it into random order. Your method should output each
 * possible order with equal probability.
 * @author Feazan Yaseen
 */
public class C21
{
    public static void main (String[] args)
    {
        int[] myArr = new int[52];
        for (int i = 0; i < myArr.length; i++)
        {
            myArr[i] = i + 1;
        }
        int[] tmpArr = shuffle(myArr);
        System.out.println(Arrays.toString(myArr));
        System.out.println(Arrays.toString(tmpArr));
    }

    /**
     * This method create a deep copy of the array that needs to be shuffled,
     * shuffles the array by swapping random elements
     * and returns the newly shuffled array
     *
     * @param arrayToShuffle - The array that needs to be shuffled
     * @return - shuffledArray, random order array
     */
    private static int[] shuffle(int[] arrayToShuffle)
    {
        int[] shuffledArray = new int[arrayToShuffle.length];
        System.arraycopy(arrayToShuffle, 0, shuffledArray, 0, arrayToShuffle.length );
        Random rnd = ThreadLocalRandom.current();
        // Begin at the end of the array
        for (int i = shuffledArray.length - 1; i > 0; i--)
        {
            // Generate random number 0 - i (inclusive)
            int index = rnd.nextInt(i + 1);
            // Swap
            int a = shuffledArray[index];
            shuffledArray[index] = shuffledArray[i];
            shuffledArray[i] = a;
        }

        // Return the shuffled array
        return shuffledArray;
    }
}

/**
 * Solution for Data Structures and Algorithms 6th edition --
 * Creativity C-1.17
 *
 * Write a short Java method that takes an array of int values and determines if there
 * is a pair of distinct elements of the array whose product is even.
 * @author Feazan Yaseen
 */
public class C17
{
    public static void main (String[] args)
    {
        int[] nums = {1, 3, 5, 7, 9, 2};
        if (evenArrayPair(nums))
            System.out.println("There exist distinct pairs whose product is even");
        else
            System.out.println("No distinct pairs create even product");
    }


    private static boolean evenArrayPair(int numArray[])
    {
        if (numArray.length == 0)
            return false;
        else if (numArray.length == 1)
            return false;
        else
        {
            for (int aNum : numArray)
            {
                // If an even number exists in the array, then even pair exists
                if (aNum % 2 == 0)
                {
                    return true;
                }
            }
        }

        return false;
    }
}

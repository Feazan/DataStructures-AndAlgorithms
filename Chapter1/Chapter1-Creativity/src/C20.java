import java.util.HashSet;
import java.util.Set;

/**
 * Solution for Data Structures and Algorithms 6th edition --
 * Creativity C-1.20
 *
 * Write a Java method that takes an array of float values and determines if all the
 * numbers are different from each other (that is, they are distinct).
 * @author Feazan Yaseen
 */
public class C20
{
    public static void main(String[] args)
    {
        float[] myNums = {10.4f, 3.23f, 5.54f, 7.21f, 9.1001010100f, 9.1000000001f};
        if (distinctFloats(myNums))
            System.out.println("All elements are distinct");
        else
            System.out.println("Duplicates found");
    }

    /**
     * distinctFloats takes an array of floats and enters them into a hash set
     * if that float is already in the set, then the method will return false
     * to indicate that the array does not contain distinct elements, and true
     * if the array does contain distinct elements.
     *
     * @param nums - float[] which
     * @return true - if all elements in float array are distinct
     *         false - if duplicates found in array
     */
    private static boolean distinctFloats(float[] nums)
    {
        Set<Float> floatSet = new HashSet<Float>();
        for (float i : nums)
        {
            if (floatSet.contains(i))
                return false;
            floatSet.add(i);
        }
        return true;
    }
}

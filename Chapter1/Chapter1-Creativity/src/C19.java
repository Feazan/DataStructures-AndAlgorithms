/**
 * Solution for Data Structures and Algorithms 6th edition --
 * Creativity C-1.18
 *
 * Write a Java program that can take a positive integer greater than 2 as input and
 * write out the number of times one must repeatedly divide this number by 2 before
 * getting a value less than 2.
 * @author Feazan Yaseen
 */
public class C19
{
    public static void main(String[] args)
    {
        int num1 = 2;
        int num2 = 100;
        int num3 = 23;
        int num4 = 0;

        System.out.println(divideByTwo(num1));
        System.out.println(divideByTwo(num2));
        System.out.println(divideByTwo(num3));
        System.out.println(divideByTwo(num4));

    }

    /**
     * This function divides a given number, greater than 2, by 2
     * until the resulting number is smaller than 2. And returns
     * number of times it had to divide by 2
     *
     * @param num - the number that needs to be divided by 2
     * @return The number of times a division was needed
     */
    private static int divideByTwo(int num)
    {
        int dividedByTwo = 0;
        if (num < 2)
            return -1;
        else
        {
            while (num > 2)
            {
                num = num /2;
                dividedByTwo++;
            }
        }

        return dividedByTwo;
    }
}

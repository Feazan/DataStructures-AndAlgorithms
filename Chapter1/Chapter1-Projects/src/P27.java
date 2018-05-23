import java.util.Scanner;

/**
 * Solution for Data Structures and Algorithms 6th edition --
 * Creativity P-1.27
 *
 * Write a Java program that can simulate a simple calculator, using the Java console
 * as the exclusive input and output device. That is, each input to the calculator, be
 * it a number, like 12.34 or 1034, or an operator, like + or =, can be done on a
 * separate line. After each such input, you should output to the Java console what
 * would be displayed on your calculator
 *
 * @author Feazan Yaseen
 */
public class P27
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String[] input = new String[3];

        for (int i = 0; i < input.length; i++)
        {
            input[i] = scan.nextLine();
        }

        double result = parseCalculatorInput(input);
        System.out.println(input[0] + input[1] + input[2] + " = " + result);
    }

    /**
     * Parses input from array and return the result of calculation
     *
     * @param input - An array containing the input from stdin
     * @return - The resulting computation of the input
     */
    private static double parseCalculatorInput(String[] input)
    {
        double firstInput = Double.parseDouble(input[0]);
        String operator = input[1];
        double secondInput = Double.parseDouble(input[2]);
        double result = 0.0;

        switch (operator)
        {
            case "+":
                result = add(firstInput, secondInput);
                break;
            case "-":
                result = subtract(firstInput, secondInput);
                break;
            case "*":
                result = multiply(firstInput, secondInput);
                break;
            case "/":
                result = divide(firstInput, secondInput);
                break;
        }

        return result;
    }

    /**
     * simple add method
     *
     * @param first - double input
     * @param second - double input
     * @return - The resulting calculation
     */
    private static double add(double first, double second)
    {
        return first + second;
    }

    /**
     * simple subtract method
     *
     * @param first - double input
     * @param second - double input
     * @return - The resulting calculation
     */
    private static double subtract(double first, double second)
    {
        return first - second;
    }

    /**
     * simple multiply method
     *
     * @param first - double input
     * @param second - double input
     * @return - The resulting calculation
     */
    private static double multiply(double first, double second)
    {
        return first * second;
    }

    /**
     * simple divide method, with divide by zero error check
     *
     * @param first - double input
     * @param second - double input
     * @return - The resulting calculation
     */
    private static double divide(double first, double second)
    {
        if (second == 0)
            return 0;
        else
            return first / second;
    }
}

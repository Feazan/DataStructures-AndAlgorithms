/**
 * Solution for Data Structures and Algorithms 6th edition --
 * Creativity C-1.18
 *
 * Give an implementation of a method named
 * norm such that norm(v, p) returns the p-norm value of v and norm(v) returns the
 * Euclidean norm of v, where v is represented as an array of coordinates.
 * @author Feazan Yaseen
 */
public class C18
{
    public static void main (String[] args)
    {
        // Creating array of coordinates
        Coordinates points = new Coordinates();
        points.x = 4;
        points.y = 3;
        Coordinates points1 = new Coordinates();
        points1.x = 1;
        points1.y = 2;
        Coordinates points2 = new Coordinates();
        points2.x = 5;
        points2.y = 9;
        Coordinates points3 = new Coordinates();
        points3.x = 3;
        points3.y = 3;
        Coordinates[] myPoints = {points, points1, points2, points3};

        double[] vector = norm(myPoints, 2);
        double[] vector2 = norm(myPoints, 3);
        double[] vector3 = norm(myPoints);
        for (double aVector : vector) System.out.println(aVector);
        System.out.println();
        for (double aVector : vector2) System.out.println(aVector);
        System.out.println();
        for (double aVector : vector3) System.out.println(aVector);
    }

    private static double[] norm(Coordinates[] v, int p)
    {
        double sumOfCoords = 0;
        double result = 0;
        double[] normArray = new double[v.length];
        for (int i = 0; i < v.length; i++)
        {
            // find the p-norm of each element coordinate and store into array to return
            sumOfCoords = Math.pow(v[i].x, p) + Math.pow(v[i].y, p);
            result = Math.pow(sumOfCoords, (1/(double)p));
            normArray[i] = result;
        }

        return normArray;
    }

    private static double[] norm(Coordinates[] v)
    {
        double sumOfCoords = 0;
        double result = 0;
        double[] normArray = new double[v.length];
        for (int i = 0; i < v.length; i++)
        {
            // find Euclidean norm of each element coordinates and store into array to return
            sumOfCoords = Math.pow(v[i].x, 2) + Math.pow(v[i].y, 2);
            result = Math.pow(sumOfCoords, (1/(double)2));
            normArray[i] = result;
        }
        return normArray;
    }
}

// Coordinates class used for vectors
class Coordinates
{
    int x;
    int y;
}

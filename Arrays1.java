import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Arrays1 {

    // For Question: https://www.hackerrank.com/challenges/2d-array/problem?h_l=playlist&slugs%5B%5D=interview&slugs%5B%5D=interview-preparation-kit&slugs%5B%5D=arrays
    static int[] rotLeft(int[] a, int d) {
        
        int b[] = a.clone();

        for (int counter = 0; counter < a.length; counter++)
        {
            int indexMove = Math.abs((counter - (a.length - 1 - d) + a.length - 1)) % a.length;
            a[counter] = b[indexMove];
        }
        
        return a;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[] a = {1, 2, 3, 4, 5};
        int d = 4;

        int[] result = rotLeft(a, d);

        for (int i = 0; i < result.length; i++) {
            System.out.print(String.valueOf(result[i]));
            if (i != result.length - 1) {
                System.out.print(" ");
            }
        }

        System.out.println();
    }
}

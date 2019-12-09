import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
*/

public class Solution {

    public static long sigma(long n) {
        return (long) ((n * (n + 1)) / 2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            long n = in.nextLong();

            long a = (n - 1) / 3;
            long b = (n - 1) / 5;
            long c = (n - 1) / 15;

            long sum = (3 * sigma(a)) + (5 * sigma(b)) - (15 * sigma(c));
            System.out.println(sum + "");
        }
        in.close();
    }
}

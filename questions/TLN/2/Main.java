import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Main {

    public static int swapArray(int[] array, int index, int num) {
        int n = array[index];
        array[index] = num;
        return n;
    }

    public static int[] findThreeLargestNumbers(int[] array) {
        int[] result = new int[] { Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE };

        for (int a : array) {
            int num = a;

            for (int i = 2; i >= 0; i--) {
                if (result[i] < num) {
                    num = swapArray(result, i, num);
                }
            }

        }

        return result;
    }

    public static void print(int[] arr) {
        for (int a : arr) {
            System.out.print(a + " ");
        }

        System.out.print("\n");
    }

    public static void main(String[] args) {
        int[] array = new int[] { 141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7 };

        int[] result = findThreeLargestNumbers(array);

        assert result[0] == 18 : "Wrong Answer";
        assert result[1] == 141 : "Wrong Answer";
        assert result[2] == 541 : "Wrong Answer";

        System.out.println("Correct Answer");
    }
}
import java.util.Arrays;
import java.util.HashMap;

class Main {

    public static int[] twoNumberSum(int[] array, int targetSum) {
        Arrays.sort(array);
        int first = 0;
        int last = array.length - 1;
        while (first < last) {
            int sm = array[first];
            int lg = array[last];
            int sum = sm + lg;
            if (sum == targetSum) {
                return new int[] { sm, lg };
            } else if (sum > targetSum) {
                last--;
            } else {
                first++;
            }
        }

        return new int[] {};
    }

    public static void main(String args[]) {
        int[] array = new int[] { 3, 5, -4, 8, 11, 1, -1, 6 };
        int targetSum = 10;
        int[] pair = twoNumberSum(array, targetSum);

        assert pair[0] == -1 : "Wrong Answer";
        assert pair[1] == 11 : "Wrong Answer";

        System.out.println("Correct!!");
    }
}
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Main {
    public static int[] findThreeLargestNumbers(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int a : array) {
            list.add(a);
        }

        Collections.sort(list);

        int len = list.size();

        int[] result = new int[3];

        result[0] = list.get(len - 3);
        result[1] = list.get(len - 2);
        result[2] = list.get(len - 1);

        return result;
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
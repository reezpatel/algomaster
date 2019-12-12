import java.util.ArrayList;
import java.util.Collections;

class Main {
    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int a : arrayOne) {
            list1.add(a);
        }

        for (int a : arrayTwo) {
            list2.add(a);
        }

        Collections.sort(list1);
        Collections.sort(list2);

        int a = 0;
        int b = 0;

        int[] result = new int[2];
        int diff = Integer.MAX_VALUE;

        while (a < list1.size() && b < list2.size()) {
            int d = Math.abs(list1.get(a) - list2.get(b));
            if (d == 0) {
                return new int[] { list1.get(a), list2.get(b) };
            }
            if (d < diff) {
                result[0] = list1.get(a);
                result[1] = list2.get(b);

                diff = d;
                continue;
            }
            int d1 = Integer.MAX_VALUE;
            int d2 = Integer.MAX_VALUE;
            if (a + 1 < list1.size()) {
                d1 = Math.abs(list1.get(a + 1) - list2.get(b));
            }
            if (b + 1 < list2.size()) {
                d2 = Math.abs(list1.get(a) - list2.get(b + 1));
            }

            if (d1 < d2) {
                a++;
            } else {
                b++;
            }

        }

        return result;
    }

    public static void main(String[] args) {
        int[] array1 = new int[] { -1, 5, 10, 20, 28, 3 };
        int[] array2 = new int[] { 26, 134, 135, 15, 17 };

        int[] result = smallestDifference(array1, array2);

        assert result[0] == 28 : "Wrong Answer";
        assert result[1] == 26 : "Wrong Answer";

        System.out.println("Correct Answer");
    }
}
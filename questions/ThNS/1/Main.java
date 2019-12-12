import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Main {
    public static int binarySearch(List<Integer> array, int target, int start, int end) {
        int high = end;
        int low = start;

        while (high >= low) {
            int middle = (low + high) / 2;
            if (array.get(middle) == target) {
                return middle;
            } else if (array.get(middle) > target) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }

        return -1;
    }

    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        ArrayList<Integer[]> result = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int a : array) {
            list.add(a);
        }

        Collections.sort(list);

        for (int low = 0; low < list.size(); low++) {
            int high = list.size() - 1;
            while (low < high) {
                int sum = list.get(low) + list.get(high);
                int required = targetSum - sum;

                int index = binarySearch(list, required, low + 1, high - 1);

                if (index != -1) {
                    result.add(new Integer[] { list.get(low), list.get(index), list.get(high) });
                }

                high--;
            }
        }

        return result;
    }

    public static boolean isArraySame(Integer[] arr1, Integer[] arr2) {
        if (arr1.length != arr2.length)
            return false;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i])
                return false;
        }
        return true;
    }

    public static boolean isListSame(List<Integer[]> list1, List<Integer[]> list2) {
        if (list1.size() != list2.size())
            return false;

        for (int i = 0; i < list1.size(); i++) {
            if (!isArraySame(list1.get(i), list2.get(i)))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array = new int[] { 12, 3, 1, 2, -6, 5, -8, 6 };
        List<Integer[]> result = threeNumberSum(array, 0);

        ArrayList<Integer[]> list = new ArrayList<>();
        Integer[] a = new Integer[] { -8, 2, 6 };
        Integer[] b = new Integer[] { -8, 3, 5 };
        Integer[] c = new Integer[] { -6, 1, 5 };
        list.add(a);
        list.add(b);
        list.add(c);

        assert isListSame(list, result) : "Wrong Answer";
        System.out.println("Correct Answer");
    }
}
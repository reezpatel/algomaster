import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static List<List<Integer>> powerset(List<Integer> array) {
        List<List<Integer>> list = new ArrayList<>();

        int num = (int) Math.pow(2, array.size());

        if (array.size() == 0) {
            list.add(Arrays.asList(new Integer[] {}));
            return list;
        }

        while (--num >= 0) {
            String str = Integer.toBinaryString(num);
            str = String.format("%" + array.size() + "s", str);

            List<Integer> set = new ArrayList<>();
            for (int i = 0; i < array.size(); i++) {
                if (str.charAt(i) == '1') {
                    set.add(array.get(i));
                }
            }

            list.add(set);
        }

        return list;
    }

    public static void main(String[] args) {
        List<List<Integer>> result = powerset(Arrays.asList(new Integer[] { 1, 2, 3 }));

        System.out.println(result);
    }
}
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static List<List<Integer>> getPermutations(List<Integer> array) {
        List<List<Integer>> result = new ArrayList<>();

        Iterator<Integer> it = array.iterator();
        while (it.hasNext()) {
            Integer num = it.next();

            if (result.size() == 0) {
                List<Integer> list = new ArrayList<>();
                list.add(num);
                result.add(list);
            } else {
                result = add(num, result);
            }
        }

        return result;
    }

    public static List<List<Integer>> add(int num, List<List<Integer>> list) {
        List<List<Integer>> newList = new ArrayList<>();

        Iterator<List<Integer>> it = list.iterator();

        while (it.hasNext()) {
            List<Integer> combination = it.next();

            for (int i = 0; i <= combination.size(); i++) {
                List<Integer> newCombination = new ArrayList<>(combination);
                newCombination.add(i, num);

                newList.add(newCombination);
            }

        }

        return newList;
    }

    public static void main(String[] args) {
        List<List<Integer>> result = getPermutations(Arrays.asList(new Integer[] { 1, 2, 3 }));

        System.out.println(result);
    }
}
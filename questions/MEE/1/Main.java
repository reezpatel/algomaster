import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Main {
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        int count = 0;
        List<Integer> list = new ArrayList<>();

        Iterator<Integer> it = array.iterator();

        while (it.hasNext()) {
            int a = it.next();
            if (a == toMove) {
                count++;
            } else {
                list.add(a);
            }
        }

        for (int i = 0; i < count; i++) {
            list.add(toMove);
        }

        return list;
    }

    public static void main(String[] args) {
        int[] array = new int[] { 2, 1, 2, 2, 2, 3, 4, 2 };
        List<Integer> list = new ArrayList<>();

        for (int a : array) {
            list.add(a);
        }

        List<Integer> result = moveElementToEnd(list, 2);
        int firstIndex = result.indexOf(2);
        int lastIndex = result.lastIndexOf(2);

        Iterator<Integer> it = result.iterator();

        while (it.hasNext()) {
            int a = it.next();
            System.out.print(a + " ");
        }

        assert firstIndex == 3 : "Wrong Answer";
        assert lastIndex == 7 : "Wrong Answer";

        System.out.println("Correct Answer");
    }
}
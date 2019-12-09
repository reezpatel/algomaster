import java.util.ArrayList;
import java.util.List;

class Main {
    public static int getSum(int depth, List<Object> array) {
        int sum = 0;

        for (Object obj : array) {
            if (obj instanceof Integer) {
                sum += ((Integer) obj).intValue();
            } else {
                sum += getSum(depth + 1, (List<Object>) obj);
            }
        }

        return depth * sum;
    }

    public static int productSum(List<Object> array) {
        return getSum(1, array);
    }

    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();

        ArrayList<Object> subList1 = new ArrayList<>();
        subList1.add(Integer.valueOf(7));
        subList1.add(Integer.valueOf(-1));

        ArrayList<Object> innerSubList = new ArrayList<>();
        innerSubList.add(Integer.valueOf(-13));
        innerSubList.add(Integer.valueOf(8));

        ArrayList<Object> subList2 = new ArrayList<>();
        subList2.add(Integer.valueOf(6));
        subList2.add(innerSubList);
        subList2.add(Integer.valueOf(4));

        // [5, 2, [7, -1], 3, [6, [-13, 8], 4]]

        list.add(Integer.valueOf(5));
        list.add(Integer.valueOf(2));
        list.add(subList1);
        list.add(Integer.valueOf(3));
        list.add(subList2);

        int sum = productSum(list);

        System.out.println("Sum => " + sum);

        assert sum == 12 : "Wrong Answer";

        System.out.print("Correct Answer");
    }
}
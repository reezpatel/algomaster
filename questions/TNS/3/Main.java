import java.util.HashMap;

class Main {

    public static int[] twoNumberSum(int[] array, int targetSum) {
        HashMap<Integer, Boolean> map = new HashMap<>();

        for (int a : array) {
            int delta = targetSum - a;
            if (map.containsKey(delta)) {
                return delta > a ? new int[] { a, delta } : 
                new int[] { delta, a };
            } else {
                map.put(a, true);
            }
        }

        return new int[]{};
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
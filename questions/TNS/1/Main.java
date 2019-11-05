class Main {

    public static int[] twoNumberSum(int[] array, int targetSum) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == targetSum) {
                    if (array[i] > array[j]) {
                        return new int[] { array[j], array[i] };
                    } else {
                        return new int[] { array[i], array[j] };
                    }
                }
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
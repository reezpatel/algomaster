class Main {
    public static int maxSubsetSumNoAdjacent(int[] array) {
        if (array.length == 0)
            return 0;

        int[] result = new int[array.length];

        if (array.length == 1) {
            return array[0];
        }

        result[0] = array[0];
        result[1] = Math.max(array[0], array[1]);

        for (int i = 2; i < array.length; i++) {
            result[i] = Math.max(result[i - 1], result[i - 2] + array[i]);
        }

        return result[array.length - 1];
    }

    public static void main(String[] args) {
        int[] array = new int[] { 75, 105, 120, 75, 90, 135 };
        int maxSum = maxSubsetSumNoAdjacent(array);

        assert maxSum == 330 : "Wrong Answer";
        System.out.println("Correct Answer");
    }
}
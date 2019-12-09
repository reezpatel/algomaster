class Main {
    public static int binarySearch(int[] array, int target) {
        int high = array.length - 1;
        int low = 0;

        while (high >= low) {
            int middle = (low + high) / 2;
            if (array[middle] == target) {
                return middle;
            } else if (array[middle] > target) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = new int[] { 0, 1, 21, 33, 45, 45, 61, 71, 72, 73 };

        int index = binarySearch(array, 33);
        int index2 = binarySearch(array, 133);

        assert index == 3 : "Wrong Answer";
        assert index2 == -1 : "Wrong Answer";
        System.out.println("Correct Answer");
    }
}
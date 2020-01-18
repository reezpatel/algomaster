public class Main {
    public static boolean hasSingleCycle(int[] array) {
        int count = 0;
        int index = 0;
        int len = array.length;

        while (count++ < len) {
            if (count != 1 && index == 0) {
                return false;
            }

            index = (index + array[index]) % len;

            if (index < 0) {
                index = len + index;
            }
        }

        return index == 0;
    }

    public static void main(String[] args) {
        int[] array = new int[] { 2, 3, 1, -4, -4, 2 };

        boolean cyclic = hasSingleCycle(array);

        assert cyclic == true : "Wrong Answer";
        System.out.println("Correct Answer");
    }
}
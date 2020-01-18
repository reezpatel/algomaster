class Main {
    public static int kadanesAlgorithm(int[] array) {
        int answer = array[0];
        int sum = array[0];

        for (int i = 1; i < array.length; i++) {
            int n = array[i];
            sum = Math.max(n, sum + n);
            answer = Math.max(answer, sum);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 3, 5, -9, 1, 3, -2, 3, 4, 7, 2, -9, 6, 3, 1, -5, 4 };
        int result = kadanesAlgorithm(arr);

        assert result == 19 : "Wrong Answer";
        System.out.println("Correct Answer");
    }
}
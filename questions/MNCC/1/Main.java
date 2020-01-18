import java.util.Arrays;

class Main {

    public static int minNumberOfCoinsForChange(int n, int[] denoms) {
        int[] result = new int[n + 1];
        Arrays.fill(result, Integer.MAX_VALUE);

        result[0] = 0;

        for (int i = 1; i <= n; i++) {
            for (int d : denoms) {
                if (i - d >= 0 && result[i - d] != Integer.MAX_VALUE) {
                    result[i] = Math.min(result[i], 1 + result[i - d]);
                }
            }
        }

        return result[n] == Integer.MAX_VALUE ? -1 : result[n];
    }

    public static void main(String[] args) {
        int n = 7;
        int[] denoms = new int[] { 2, 4 };

        int ans = minNumberOfCoinsForChange(n, denoms);

        assert ans == -1 : "Wrong Answer";
        System.out.println("Correct Answer");
    }
}
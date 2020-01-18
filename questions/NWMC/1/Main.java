class Main {
    public static int numberOfWaysToMakeChange(int n, int denominations[]) {
        int[] ways = new int[n + 1];

        ways[0] = 1;

        for (int denom : denominations) {
            for (int amt = 1; amt <= n; amt++) {
                if (denom <= amt) {
                    ways[amt] = ways[amt] + ways[amt - denom];
                }
            }
        }

        return ways[n];
    }

    public static void main(String[] args) {
        int N = 6;
        int[] dem = new int[] { 1, 5 };

        int ways = numberOfWaysToMakeChange(N, dem);

        assert ways == 2 : "Wrong Answer";
        System.out.println("Correct Answer");
    }
}
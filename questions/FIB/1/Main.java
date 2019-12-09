class Main {
    public static int getFib(int n, int a, int b) {
        if(n == 0) {
            return a;
        }

        return getFib(n-1, b, b+a);
    }

    public static int getNthFib(int n) {
        return getFib(n-1, 0, 1);
    }

    public static void main(String[] args) {
        assert getNthFib(6) == 5 : "Wrong Answer";

        System.out.println("Correct!!");
    }
}
class Main {

    public static int getNthFib(int n) {
        int a = 0;
        int b = 1;
        while (--n != 0) {
            int t = a;
            a = b;
            b += t;
        }
        return a;
    }

    public static void main(String[] args) {
        assert getNthFib(6) == 5 : "Wrong Answer";

        System.out.println("Correct!!");
    }
}
class Main {
    public static String caesarCypherEncryptor(String str, int key) {
        int len = str.length();
        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < len; i++) {
            int c = (str.charAt(i) - 'a' + key) % 26;

            sb.setCharAt(i, (char) ('a' + c));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "xyz";
        String s = caesarCypherEncryptor(str, 2);

        assert s.equals("zab") : "Wrong Answer";
        System.out.print("Correct Answer");
    }
}
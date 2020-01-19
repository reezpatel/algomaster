public class Main {
    public static String longestPalindromicSubstring(String string) {
        int max = 1;
        String str = "" + string.charAt(0);

        // Odd
        for (int i = 0; i < string.length(); i++) {
            int center = i;
            int index = 1;
            int len = 1;

            while (center - index >= 0 && center + index < string.length()
                    && string.charAt(center - index) == string.charAt(center + index)) {
                len += 2;
                if (len > max) {
                    str = string.substring(center - index, center + index + 1);
                    max = len;
                }
                index++;
            }
        }

        // Even
        for (int i = 0; i < string.length(); i++) {
            int center = i;
            int index = 1;
            int len = 0;

            while (center - index + 1 >= 0 && center + index < string.length()
                    && string.charAt(center - index + 1) == string.charAt(center + index)) {
                len += 2;
                if (len > max) {
                    str = string.substring(center - index + 1, center + index + 1);
                    max = len;
                }
                index++;
            }
        }

        return str;
    }

    public static void main(String[] args) {
        String palindrome = longestPalindromicSubstring("abcdefghfedcbaa");
        System.out.println(palindrome);
        assert palindrome.equals("xyzzyx") : "Wrong Answer";
        System.out.println("Correct Answer");
    }
}
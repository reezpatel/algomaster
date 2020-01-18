import java.util.Vector;

public class Main {
    public static int levenshteinDistance(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        int[][] mat = new int[len1 + 1][len2 + 1];
        mat[0][0] = 0;

        for (int i = 0; i <= len1; i++) {
            mat[i][0] = i;
        }

        for (int j = 0; j <= len2; j++) {
            mat[0][j] = j;
        }

        for (int j = 1; j <= len2; j++) {
            for (int i = 1; i <= len1; i++) {

                if (str1.charAt(i - 1) != str2.charAt(j - 1)) {
                    mat[i][j] = 1 + Math.min(mat[i - 1][j - 1], Math.min(mat[i][j - 1], mat[i - 1][j]));
                } else {
                    mat[i][j] = mat[i - 1][j - 1];
                }
            }
        }

        // DEBUG
        // System.out.print(" ");
        // for (int i = 0; i < len1; i++) {
        // System.out.print(str1.charAt(i) + " ");
        // }
        // System.out.println("");
        // for (int j = 0; j <= len2; j++) {
        // if (j == 0)
        // System.out.print(" ");
        // else
        // System.out.print(str2.charAt(j-1) + " ");

        // for (int i = 0; i <= len1; i++) {
        // System.out.print(mat[i][j] + " ");
        // }
        // System.out.println("");
        // }

        return mat[len1][len2];
    }

    public static void main(String[] args) {
        int d = levenshteinDistance("biting", "mitten");

        assert d == 4 : "Wrong Answer";
        System.out.println("Correct Answer!");
    }
}

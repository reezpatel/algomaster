public class Main {
    public static int[] searchInSortedMatrix(int[][] matrix, int target) {

        int row = matrix.length - 1;
        int col = 0;

        while (col < matrix[0].length && row >= 0) {

            if (matrix[row][col] == target) {
                return new int[] { row, col };
            } else if (matrix[row][col] > target) {
                row--;
            } else {
                col++;
            }
        }

        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][] { { 1, 4, 7, 12, 15, 1000 }, { 2, 5, 19, 31, 32, 1001 },
                { 3, 8, 24, 33, 35, 1002 }, { 40, 41, 42, 44, 45, 1003 }, { 99, 100, 103, 106, 128, 1004 }, };

        int[] answer = searchInSortedMatrix(matrix, 44);

        assert answer[0] == 3 : "Wrong Answer";
        assert answer[1] == 3 : "Wrong Answer";
        System.out.println("Correct Answer");
    }
}
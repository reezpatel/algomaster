import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void print(boolean[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static List<Integer> riverSizes(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        boolean[][] visited = new boolean[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (visited[i][j]) {
                    continue;
                }

                if (matrix[i][j] == 0) {
                    visited[i][j] = true;
                    continue;
                }

                // print(matrix);
                // print(visited);

                ArrayList<Integer[]> queue = new ArrayList<>();
                int size = 0;

                queue.add(new Integer[] { i, j });

                while (!queue.isEmpty()) {
                    Integer[] pair = queue.get(0);
                    queue.remove(0);

                    int X = pair[0];
                    int Y = pair[1];

                    if (!visited[X][Y]) {
                        size++;
                        visited[X][Y] = true;

                        // Visit Neighbor
                        int[] deltaX = new int[] { 1, -1, 0, 0 };
                        int[] deltaY = new int[] { 0, 0, 1, -1 };

                        for (int k = 0; k < 4; k++) {
                            int newX = X + deltaX[k];
                            int newY = Y + deltaY[k];

                            if (newX >= 0 && newX < matrix.length && newY >= 0 && newY < matrix[0].length
                                    && matrix[newX][newY] == 1 && !visited[newX][newY]) {
                                queue.add(new Integer[] { newX, newY });
                            }
                        }
                    }
                }

                result.add(size);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][] { new int[] { 1, 0, 0, 1, 0 }, new int[] { 1, 0, 1, 0, 0 },
                new int[] { 0, 0, 1, 0, 1 }, new int[] { 1, 0, 1, 0, 1 }, new int[] { 1, 0, 1, 1, 0 }, };

        List<Integer> result = riverSizes(matrix);
        Collections.sort(result);

        int[] answer = new int[] { 1, 2, 2, 2, 5 };

        for (int i = 0; i < answer.length; i++) {
            assert answer[i] == result.get(i) : "Wrong Answer";
        }
        System.out.println("Correct Answer");
    }
}
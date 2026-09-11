//For finding the target in a 2D matrix with sorted row and columns

import java.util.Arrays;
public class BSTFor2DArray {
    public static void main(String[] args) {
        int[][] arr = {{10, 20, 30, 40},
                       {15, 25, 35, 45},
                       {28, 29, 37, 49},
                       {35, 55, 65, 95}
                       };

        System.out.println(Arrays.toString(Search(arr, 29) ));
    }

    static int[] Search(int[][] matrix, int target) {
        int row = 0;
        int col = matrix.length-1;
        while(row < matrix.length && col >= 0) {
            if (target == matrix[row][col]) {
                return new int[]{row, col};
            }

            if (target > matrix[row][col]) {
                row++;
            } else {
                col--;
            }
        }
        return new int[]{row, col};
    }
}

import java.util.Arrays;

public class BSfor2DArray2 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4},
                      {5, 6, 7, 8},
                      {9, 10, 11, 12},
                      {13, 14, 15, 16}
        };

        System.out.println(Arrays.toString(searchFlat2DArray(arr, 11)));
    }
static int[] searchFlat2DArray(int[][] arr, int target) {
        int rows = arr.length;
        int cols = arr[0].length;

        int st = 0;
        int ed = (rows*cols)-1;

        while(st <= ed) {
           int mid = st+(ed-st)/2;

           int row = mid/cols;
           int col = mid%cols;

           if(arr[row][col] == target) {
               return new int[]{row, col};
           }

           if(arr[row][col] < target) {
               st = mid+1;
           }else {
               ed = mid-1;
           }
        }
        return new int[]{-1, -1};
}
}

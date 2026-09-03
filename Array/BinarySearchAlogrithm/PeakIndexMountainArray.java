//https://leetcode.com/problems/peak-index-in-a-mountain-array/


public class PeakIndexMountainArray {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0};
    }

    static int peakIndex(int[] arr) {
        int st = 0;
        int ed = arr.length-1;

        while(st < ed) {
            int mid = st+(ed-st)/2;
            if(arr[mid] < arr[mid+1]) {
                st = mid+1;
            } else {
                ed = mid;
            }
        }
        return st;
    }
}

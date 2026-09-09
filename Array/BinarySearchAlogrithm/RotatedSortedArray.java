//https://leetcode.com/problems/search-in-rotated-sorted-array/description/

public class RotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int index = search(nums, target);
        System.out.println(index);
    }

    static int search(int[] nums, int target) {
          int pivot = pivot(nums);

        if(pivot == -1) {
            // do the normal binary search
            return binarySearch(nums, target, 0, nums.length-1);
        }

          if(nums[pivot] == target) {
              return pivot;
          }

          if(nums[0]  <= target) {
              return binarySearch(nums, target, 0, pivot-1);
          }

          return binarySearch(nums, target, pivot+1, nums.length-1);
    }

    static  int pivot(int[] nums) {
        int st = 0;
        int ed = nums.length-1;

        while (st <= ed) {
            int mid = st+(ed-st)/2;

            if(mid < ed && nums[mid] > nums[mid+1]) {
                return mid;
            }

            if(mid > st && nums[mid] < nums[mid-1]) {
                 return mid-1;
            }

            if(nums[mid] >= nums[st]) {
                ed = mid-1;
            } else {
                st = mid+1;
            }
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target, int st, int ed) {

        while(st <= ed) {
            int mid = st+(ed-st)/2;

            if(arr[mid] < target) {
                st = mid+1;
            }else if(arr[mid] > target) {
                ed = mid-1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

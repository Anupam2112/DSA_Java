//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

import java.util.Arrays;

public class FirstLastPosition {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] index = firstLastPos(nums, target);
        System.out.println(Arrays.toString(index));
    }

    static int[] firstLastPos(int[] nums, int target) {
        int[] ans = {-1, -1};

        ans[0]  = Position(nums, target, true);

        if(ans[0] != -1) {
            ans[1] = Position(nums, target, false);

        }
        return ans;
    }

    static int Position(int[] nums, int target, boolean findFirstPos) {

        int ans = -1;
        int st = 0;
        int ed = nums.length-1;

        while(st <= ed) {
            int mid = st+(ed-st)/2;

            if(target < nums[mid]) {
                ed = mid-1;
            } else if(target > nums[mid]) {
                st = mid+1;
            } else {
                ans = mid;
                if(findFirstPos) {
                    ed = mid - 1;
                } else {
                    st = mid + 1;
                }
            }
        }
        return ans;
    }
}

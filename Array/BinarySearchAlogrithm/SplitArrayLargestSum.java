public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] nums = {7, 2, 5, 10, 8};
        int m = 2;

        int maxmin = splitIntoPieces(nums, m);
        System.out.println(maxmin);
    }

    static int splitIntoPieces(int[] nums, int m) {
        int st = 0;
        int ed = 0;
        for(int i=0; i<nums.length; i++) {
            st = Math.max(st, nums[i]);
            ed += nums[i];
        }

        while(st < ed) {
            int mid = st+(ed-st)/2;

            int sum = 0;
            int pieces = 1;
            for(int num : nums) {
                if(sum+num > mid) {
                    sum = num;
                    pieces++;
                }else {
                    sum += num;
                }
                }
            if(pieces > m) {
                st = mid+1;
            }else {
                ed = mid;
            }
            }
        return ed;
        }
    }


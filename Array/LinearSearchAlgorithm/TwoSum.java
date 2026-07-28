//https://leetcode.com/problems/two-sum/

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size :");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter Elements of an Array");
        for(int i=0; i<nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter your Target");
        int target = sc.nextInt();

        int[] sum = twoSum(nums, target);
        if(sum.length == 2) {
            System.out.println("["+sum[0]+","+sum[1]+"]");
        }else {
            System.out.println("Index not found");
        }

    }

    static int[] twoSum(int[] nums, int target) {
          for(int i=0; i< nums.length-1; i++) {
             for(int j=i+1; j<nums.length; j++) {
                 if(nums[i]+nums[j] == target) {
                     return new int[]{i,j};
                 }
             }
          }
          return new int[]{};
    }
}

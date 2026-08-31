//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/submissions/2086075889/


import java.util.Scanner;

        public class FindEvenNumber {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the Size of an Array");
                int n = sc.nextInt();
                System.out.println("Enter the Elements of an Array");
                int[] nums = new int[n];

                for (int i = 0; i < nums.length; i++) {
                    nums[i] = sc.nextInt();
                }

                    int count  = findNumbers(nums);
                    System.out.println("the No of EvenNumber elements is :"+count);

            }

            static int findNumbers(int[] nums) {
                int count = 0;
                for(int num:nums) {
                    if(even(num)) {
                        count++;
                    }
                }
                return count;
            }

            static boolean even(int num) {
                int even = digit(num);
                return even%2 == 0;
            }

            static int digit(int num) {
                int n = 0;
                while(num>0) {
                    n++;
                    num = num/10;
                }
                return n;
            }
        }

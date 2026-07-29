//https://leetcode.com/problems/richest-customer-wealth/description/

import java.util.Scanner;

public class MaxWealth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row of Array: ");
        int row = sc.nextInt();
        System.out.println("Enter Column of Array: ");
        int col = sc.nextInt();

        int[][] accounts = new int[row][col];


        System.out.println("Enter the Elements of Array");
        for(row=0; row<accounts.length; row++) {
            for(col=0; col<accounts[row].length; col++) {
                accounts[row][col] = sc.nextInt();
            }
        }
        System.out.println("your MaxWealth is :"+maxWealth(accounts));

    }

    static int maxWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;
        int row;
        int col;
        for (row = 0; row < accounts.length; row++) {
            int sum = 0;
            for (col = 0; col < accounts[row].length; col++) {
                sum = sum + accounts[row][col];
            }
            if (sum > maxWealth) {
                maxWealth = sum;
            }
        }
        return maxWealth;
    }

    }

//https://leetcode.com/problems/second-largest-digit-in-a-string/
import java.util.Scanner;
public class LargestNoInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String s = sc.next();

        System.out.println(largestNoInString(s));
    }

    static int  largestNoInString(String s) {
        int max1 = -1;
        int max2 = -1;

        for(int i=0; i<s.length(); i++) {
            if(Character.isDigit(s.charAt(i))) {
               int digit = s.charAt(i) - '0';

               if(digit>max1) {
                   max2 = max1;
                   max1 = digit;
               }else if(digit>max2 && digit != max1) {
                   max2 = digit;
               }
            }
            }
        return max2;
        }
}

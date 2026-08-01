public class PrintStarPattern {
    public static void main(String[] args) {
//printStarPattern(5);
//printInvertedStar(5);
//printHalfPyramid(5);
//printCharPattern(5);
    }

    static void printStarPattern(int n) {

       for(int i=1; i<=n; i++) {
           for(int s=1; s<=i; s++) {
               System.out.print("*"+" ");
           }
           System.out.println();
       }
      }


    static void printInvertedStar(int n) {
        for(int i=1; i<=n; i++) {
            for(int s=1; s<=n-i+1; s++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    static void printHalfPyramid(int n) {
        for(int i=1; i<=n; i++) {
            for(int ch=1; ch<=i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    static void printCharPattern(int n) {
        char ch='A';
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}

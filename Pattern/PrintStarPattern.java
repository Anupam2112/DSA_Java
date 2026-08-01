public class PrintStarPattern {
    public static void main(String[] args) {
//printStarPattern();
//printInvertedStar();
//printHalfPyramid();
//printCharPattern();
    }

    static void printStarPattern() {
        int n=4;
       for(int i=1; i<=n; i++) {
           for(int s=1; s<=i; s++) {
               System.out.print("*"+" ");
           }
           System.out.println();
       }
      }


    static void printInvertedStar() {
        int n=5;
        for(int i=1; i<=n; i++) {
            for(int s=1; s<=n-i+1; s++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    static void printHalfPyramid() {
        int n = 5;
        for(int i=1; i<=n; i++) {
            for(int ch=1; ch<=i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    static void printCharPattern() {
        char ch='A';
        int n=5;
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}

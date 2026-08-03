public class PrintAdvancedStarPattern {
    public static void main(String[] args) {
        //printHollowStarPattern(4,5);
        //printInvertedRightAngleTringle(5);
        //printInvertedNumPattern(5);
        //printFloydsTrianle(5);
        printReverseFloydsTriangle(5);
    }

    static void printHollowStarPattern(int row, int col) {
        for(int i=1; i<=row; i++) {
            for(int j=1; j<=col; j++) {
                if(i==1 || j==1 || i==4 || j==5) {
                    System.out.print("*"+" ");
                }else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }

    static void printInvertedRightAngleTringle(int n) {
        for(int row=1; row<=n; row++) {
            for(int space=1; space<=n-row; space++) {
                System.out.print(" "+" ");
            }
            for(int sr=1; sr<=row; sr++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    static void printInvertedNumPattern(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void printFloydsTrianle(int n) {
        int counter = 1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }

    static void printReverseFloydsTriangle(int n) {
        int counter = 15;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i+1; j++) {
                System.out.print(counter+" ");
                counter--;
            }
            System.out.println();
        }
    }
}

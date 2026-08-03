public class PrintStarPattern {
    public static void main(String[] args) {
//printStarPattern(5);
//printInvertedStar(5);
//printHalfPyramid(5);
//printCharPattern(5);
//printStartwithSameChar(5);
//printZeroOneTrianglePattern(5);
//printButterFlyPattern(5);
//printPalindromicPattern(5);
        wbPattern1(3);
    }

    static void printStarPattern(int n) {

        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= i; s++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }


    static void printInvertedStar(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i + 1; s++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void printHalfPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int ch = 1; ch <= i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    static void printCharPattern(int n) {
        char ch = 'A';
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

    static void printStartwithSameChar(int n) {
        //char ch = 'a';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((char) ('a' + j));
            }
            System.out.println();
        }
    }

    static void printZeroOneTrianglePattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1" + " ");
                } else {
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }
    }

    static void printButterFlyPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    static void printPalindromicPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k > 0; k--) {
                System.out.print(k);
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }
            System.out.println();
        }
    }

        static void wbPattern1(int n) {
        if(n <= 1 || n%2 == 0) {
            System.out.println("Invalid Input");
            return;
        }

        int stars = 5;
        int cols = stars+6;
        int midCols = cols/2;
        int midRows = n/2;

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=cols; j++) {
                if(j >= (midCols+1)-2 && j<=(midCols+1+2)) {
                    System.out.print("*");
                }else if(i == midRows+1) {
                    System.out.print("e");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        }

        static void wbPattern2(int n) {
        if(n <=1 || n%2 == 0) {
            System.out.println("Invalid Pattern");
            return;
        }

            for(int i=1; i<=(n+1)/2; i++) {
                for(int j=1; j<=i-1; j++) {
                    System.out.print(" ");
                }
                for(int k=1; k<=n-2*(i-1); k++) {
                    System.out.print("@");
                }
                System.out.println();
            }
            for(int i=1; i<=n; i++) {
                for(int j=1; j<=n; j++) {
                    if(i == 1 || j == 1 || j == n) {
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }ad
        }




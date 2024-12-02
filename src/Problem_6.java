import java.util.Scanner;

public class Problem_6 {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number: ");
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++) {
//            if (n % i == 0) {
//                System.out.println(i);
//            }
//        }

//        System.out.print("Enter number: ");
//        int n = sc.nextInt();
//        int maxNumber = n;
//        int minNumber = n;
//        while (n != 0) {
//            System.out.print("Enter number: ");
//            n = sc.nextInt();
//            if (n > maxNumber) {
//                maxNumber = n;
//            }
//            if (n < minNumber && n != 0) {
//                minNumber = n;
//            }
//        }
//        System.out.println("Maximum number is " + maxNumber);
//        System.out.println("Minimum number is " + minNumber);

//        System.out.println("Enter number: ");
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n; j++) {
//                if (j == n) {
//                    System.out.printf("%d", (i*j));
//                } else {
//                    System.out.printf("%d\t", (i*j));
//                }
//            }
//            System.out.println();
//        }
//        System.out.println("Enter number: ");
//        int w = sc.nextInt();
//        System.out.println("Enter number: ");
//        int h = sc.nextInt();
//        for (int i = 0; i < h; i++) {
//            for (int j = 0; j < w; j++) {
//                if (i == 0 || i == h-1 || j == 0 || j == w-1) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
        System.out.println("Enter number: ");

        int space = 0;
        int n = sc.nextInt();

        for (int i = n; i > 0; i-=2) {
            for (int k = 0; k < space; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            space++;
            System.out.println();
        }
    }
}

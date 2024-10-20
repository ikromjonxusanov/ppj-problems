import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Problem A
//        System.out.print("n: ");
//        int n = scanner.nextInt();
//        System.out.print("k: ");
//        int k = scanner.nextInt();
//        int remainder = n % k;
//        System.out.println("remainder = " + remainder);
//        int x = (n - remainder) / k;
//        System.out.println(
//               n + " = " + x + " * " + k + " + " + remainder
//        );

//        Problem B
//        System.out.print("A = ");
//        int a = scanner.nextInt();
//        System.out.print("B = ");
//        int b = scanner.nextInt();
//
//        while (a != b) {
//            System.out.println(a + " " + b);
//            if (a > b) {
//                a -= b;
//            } else {
//                b -= a;
//            }
//        }
//        System.out.println(a);
//        Problem C
        System.out.print("A = ");
        int a = scanner.nextInt();
        System.out.print("B = ");
        int b = scanner.nextInt();
        System.out.print("C = ");
        int c = scanner.nextInt();
        if (a == 0) {
            // If a == 0, it's a linear equation: bx + c = 0
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Infinite solutions (all real numbers).");
                } else {
                    System.out.println("No solution.");
                }
            } else {
                // Linear equation solution: x = -c / b
                int x = -c / b;
                System.out.println("Linear solution: x = " + x);
            }
        } else {
            int discriminant = (b * b) - (4 * a * c);
            if (discriminant > 0){
                double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("Two distinct real roots: x1 = " + x1 + ", x2 = " + x2);

            } else if (discriminant == 0) {
                double x = (double) -b / (2 * a);
                System.out.println("One real root: x = " + x);
            } else {
                System.out.println("∅");
            }
        }

    }
}

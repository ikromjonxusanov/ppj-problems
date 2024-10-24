import java.util.Scanner;

public class Problem_2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("K = ");
//        int k = scanner.nextInt();
//         B
//        System.out.println(1 << k);
//         C
//        System.out.println("N = ");
//        int n = scanner.nextInt();
//        System.out.println(n & k);
//            D
//        int n = -1;
//        int k = n & 0xFF;
//        System.out.println("K = " + k);
//        E
//        int n = 1793;
//        System.out.println(n >> 8);
//        F
        int n = 70;
        int k = n ^ (1 << 5);
        System.out.println((char)n + " " + (char)k);
    }
}

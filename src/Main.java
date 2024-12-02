import java.lang.constant.Constable;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        for (int i = 10; i <= 25; i++) {
//            System.out.println("Square of " + i + " = " + (i*i));
//            System.out.println("Cube of " + i + " = " + (i*i*i));
//            System.out.println("--------------");
//        }
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        if (a > b) {
//            a = a + b;
//            b = a - b;
//            a = a - b;
//        }
//        int result = 0;
//        for (; a<=b; a++) {
//            result += a;
//        }
//        System.out.println(result);
//        for (; a < b; ++a) {
//            if ((a % 3 == 0) || (a % 5 == 0)) {
//                System.out.println(a);
//            }
//        }
        int a = (int) ((Math.random() * (10 - 1)) + 1);
        int b = (int) ((Math.random() * (10 - 1)) + 1);
//        while ((a + b) != 9) {
//            a = (int) ((Math.random() * (10 - 1)) + 1);
//            b = (int) ((Math.random() * (10 - 1)) + 1);
//            System.out.println(a+b);
//        }
        do {
            a = (int) ((Math.random() * (10 - 1)) + 1);
            b = (int) ((Math.random() * (10 - 1)) + 1);
            System.out.println(a+b);
        } while (a + b == 9);
    }
}

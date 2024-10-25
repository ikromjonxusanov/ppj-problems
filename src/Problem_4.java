import java.util.Scanner;

public class Problem_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(Integer.toBinaryString(number));


        int family = number & 0b11;
        int style = (number & 0b1100) >> 2;
        System.out.println(style + " style");
        int weigth = (number >> 4) & 0b1;
        int size = (number >> 5);
        if (size > 4) {
            System.out.println("illegal size");
            return;
        }
        if (style > 2) {
            System.out.println("illegal style");
            return;
        }
        if (family == 0) {
            System.out.print("Courier, ");
        } else if (family == 1) {
            System.out.print("Times, ");
        } else if (family == 2) {
            System.out.print("Arial, ");
        } else {
            System.out.print("Helvetica, ");
        }
        // Style
        if (style == 0) {
            System.out.print("plain, ");
        } else if (style == 1) {
            System.out.print("italic, ");
        } else if (style == 2) {
            System.out.print("oblique, ");
        } else {
            System.out.print("illegal style, ");
        }
        // Weigth
        if (weigth == 0) {
            System.out.print("normal, ");
        } else {
            System.out.print("bold, ");
        }
        // Size
        if (size == 0) {
            System.out.println("x-small");
        } else if (size == 1) {
            System.out.println("small");
        } else if (size == 2) {
            System.out.println("medium");
        }  else if (size == 3) {
            System.out.println("large");
        }   else if (size == 4) {
            System.out.println("x-large");
        } else {
            System.out.println("illegal style");
        }
    }
}

import java.util.Scanner;

public class Problem_4 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//      Problem 7
//        int number = scanner.nextInt();
//        System.out.println(Integer.toBinaryString(number));
//
//
//        int family = number & 0b11;
//        int style = (number & 0b1100) >> 2;
//        System.out.println(style + " style");
//        int weigth = (number >> 4) & 0b1;
//        int size = (number >> 5);
//        if (size > 4) {
//            System.out.println("illegal size");
//            return;
//        }
//        if (style > 2) {
//            System.out.println("illegal style");
//            return;
//        }
//        if (family == 0) {
//            System.out.print("Courier, ");
//        } else if (family == 1) {
//            System.out.print("Times, ");
//        } else if (family == 2) {
//            System.out.print("Arial, ");
//        } else {
//            System.out.print("Helvetica, ");
//        }
//        // Style
//        if (style == 0) {
//            System.out.print("plain, ");
//        } else if (style == 1) {
//            System.out.print("italic, ");
//        } else if (style == 2) {
//            System.out.print("oblique, ");
//        } else {
//            System.out.print("illegal style, ");
//        }
//        // Weigth
//        if (weigth == 0) {
//            System.out.print("normal, ");
//        } else {
//            System.out.print("bold, ");
//        }
//        // Size
//        if (size == 0) {
//            System.out.println("x-small");
//        } else if (size == 1) {
//            System.out.println("small");
//        } else if (size == 2) {
//            System.out.println("medium");
//        }  else if (size == 3) {
//            System.out.println("large");
//        }   else if (size == 4) {
//            System.out.println("x-large");
//        } else {
//            System.out.println("illegal style");
//        }
//      Problem 8
//        System.out.print("Enter three boolean " +
//                "values (true or false) ");
//        boolean a = scanner.nextBoolean();
//        boolean b = scanner.nextBoolean();
//        boolean c = scanner.nextBoolean();
//        boolean allThree = a && b && c;
//        boolean exactlyOne = (a && !b && !c) || (!a && !b && c) || (!a && b && !c);
//        boolean exactlyTwo = (!a && b && c) || (a && !b && c) || (a && b && !c);
//        boolean atLeastOne = a || b || c;
//        boolean atLeastTwo = (a && b) || (b && c) || (a && c);
//        System.out.println("a, b, c = " + a + ", " + b +
//                ", " + c + "\nallThree: " + allThree +
//                "\nexactlyOne: " + exactlyOne +
//                "\nexactlyTwo: " + exactlyTwo +
//                "\natLeastOne: " + atLeastOne +
//                "\natLeastTwo: " + atLeastTwo);

        int[] arr = {1, 4, 5, 3, 2, 0, 0, 1, 5}; // Example input array

        int count = 0;

        // Iterate over the array to check each sequence of three consecutive elements
        for (int i = 0; i < arr.length - 2; i++) {
            if ((arr[i] < arr[i + 1] && arr[i + 1] < arr[i + 2]) || // strictly increasing
                    (arr[i] > arr[i + 1] && arr[i + 1] > arr[i + 2])) { // strictly decreasing
                count++;
            }
        }

        System.out.println("Number of strictly increasing or decreasing triplets: " + count);
    }

}

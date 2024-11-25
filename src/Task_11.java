import java.util.Arrays;

public class Task_11 {
    //    static int maxOfThree(int a, int b, int c) {
//        if (a > b && a > c) {
//            return a;
//        } else if (b > a && b > c) {
//            return b;
//        } else {
//            return c;
//        }
//    }
//    static int greatestDivisor(int n) {
//        int greatestDivisor = 0;
//        for (int i = 1; i <= n; i++) {
//            if (n % i == 0 && i != n) {
//                greatestDivisor = i;
//            }
//        }
//        return greatestDivisor;
//    }
//    static boolean areRelativelyPrime(int a, int b) {
//        for (int i = 2; i * i <= b; i++) {
//            if (a % i == 0 && i != b) {
//                return false;
//            }
//        }
//        return true;
//    }
//    static boolean isPerfect(int n) {
//        return false;
//    }
    public static void main(String[] args) {
//        int x = 2, y = 3, z = 1;
//        System.out.println("Max of " + x + ", " + y + ", " +
//                z + " is " + maxOfThree(x, y, z));
//        for (int a = 12; a < 16; ++a)
//            System.out.println("Greatest divisor of " +
//                    a + " is " + greatestDivisor(a));
//        for (int m = 11, n = 5; m >= 3; m -= 2, n += 2)
//            if (areRelativelyPrime(m, n))
//                System.out.println(m + " and " + n + " are relatively prime");
//        for (int m = 2; m <= 100; ++m)
//            if (isPerfect(m))
//                System.out.println(m + " is perfect");
//        String str = "example";
//        System.out.println(encode(str));
//        System.out.println(decode(encode(str)));

//        int[] a = {2, -13, 3, 6, 4, 5, -14, 1, -15};
//        int[] r = smallSum3(a);
//        System.out.printf("Sum=%d for elements " +
//                        "a[%d]=%d, a[%d]=%d, a[%d]=%d%n",
//                a[r[0]] + a[r[1]] + a[r[2]],
//                r[0], a[r[0]], r[1], a[r[1]], r[2], a[r[2]]);

        int[][] a = {
                {1,2,3,4,5,6},
                {2,3,4,5,6,7},
                {3,4,5,6,7,8},
                {4,5,6,7,8,9}
        };
        System.out.println("**** inner");
        for (int[] r : a)
            System.out.println(Arrays.toString(r));
        System.out.println();
        for (int[] r : inner(a))
            System.out.println(Arrays.toString(r));
        System.out.println("\n**** trans");
        for (int[] r : a)
            System.out.println(Arrays.toString(r));
        System.out.println();
        for (int[] r : trans(a))
            System.out.println(Arrays.toString(r));
        System.out.println("\n**** right");
        for (int[] r : a)
            System.out.println(Arrays.toString(r));
        System.out.println();
        for (int[] r : right(a))
            System.out.println(Arrays.toString(r));
    }

    public static int[][] inner(int[][] a) {
        int[][] arr2 = new int[a.length-2][a[0].length-2];
        for (int i = 1; i < a.length-1; i++) {
            for (int j = 1; j < a[i].length-1; j++) {
                arr2[i-1][j-1] = a[i][j];
            }
        }
        return arr2;
    }

    public static int[][] trans(int[][] a) {
        int[][] arr = new int[a[0].length][a.length];
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
                arr[i][j] = a[j][i];
            }
        }
        return arr;
    }

    public static int[][] right(int[][] a) {
        int row = a.length, column = a[0].length / 2;
        int[][] arr = new int[row][column];
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < column; ++j) {
                arr[i][j] = a[i][column+j];
            }
        }

        return arr;
    }




    public static int[] smallSum3(int[] a) {
        int best_i = 0, best_j = 1, best_k = 2;
        int min = Math.abs(a[best_i] + a[best_j] + a[best_k]);
        for (int i = 0; i < a.length - 2; i++) {
            for (int j = i + 1; j < a.length - 1; j++) {
                for (int k = j + 1; k < a.length; k++) {
                    int sum = Math.abs(a[i] + a[j] + a[k]);
                    if (min > sum) {
                        min = sum;
                        best_i = i;
                        best_j = j;
                        best_k = k;
                    }
                }
            }
        }
        return new int[]{best_i, best_j, best_k};
    }

    public static String encode(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((char) (arr[i] + i));
        }
        for (int i = 0, j = arr.length - 1; i < j; ++i, --j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return new String(arr);
    }

    public static String decode(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0, j = arr.length - 1; i < j; ++i, --j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((char) (arr[i] - i));
        }
        return new String(arr);
    }
}

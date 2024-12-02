import java.util.Arrays;


public class FuncStat {

    public static int fiboR(int n) {
        if (n <= 2) {
            return 1;
        }
        return fiboR(n - 1) + fiboR(n - 2);
    }

    public static int fiboI(int n) {
        int a = 1, b = 1;
        for (int i = 2; i <= n; i++) {
            a = a + b;
            b = a - b;
        }
        return b;
    }

    public static int factR(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factR(n - 1);
    }

    public static int factI(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    public static int gcdR(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcdR(b, a % b);
    }

    public static int gcdI(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int maxElem(int[] arr, int from) {
        if (from == arr.length-1) {
            return arr[from];
        }
        return Math.max(arr[from], maxElem(arr, ++from));
    }

    public static int numEven(int[] arr, int from) {
        if (from == arr.length) {
            return 0;
        }
        if (arr[from] % 2 == 0) {
            return 1 + numEven(arr, from + 1);
        }
        return numEven(arr, from + 1);
    }

    public static void reverse(int[] arr, int from) {
        if (arr.length / 2 == from)  {
            return;
        }
        int index = arr.length-1-from;

        arr[from] = arr[from] + arr[index];
        arr[index] = arr[from] - arr[index];
        arr[from] = arr[from] - arr[index];

        reverse(arr, ++from);
    }

    public static boolean IsPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Wait...");
        System.out.println(FuncStat.fiboR(45));
        System.out.println(FuncStat.fiboI(45));
        System.out.println(FuncStat.factR(12));
        System.out.println(FuncStat.factI(12));
        System.out.println(FuncStat.gcdR(12125, 40643));
        System.out.println(FuncStat.gcdI(12125, 40643));
        int[] a = {3, 8, 2, 9, 7, 4};
        System.out.println("Max     : " + FuncStat.maxElem(a, 0));
        System.out.println("Num even: " + FuncStat.numEven(a, 0));
        System.out.println("Before:   " + Arrays.toString(a));
        FuncStat.reverse(a, 0);
        System.out.println("After :   " + Arrays.toString(a));
        System.out.println("Is 'radar' a palindrom? " +
                FuncStat.IsPalindrome("radar"));
        System.out.println("Is 'abba' a palindrom?  " +
                FuncStat.IsPalindrome("abba"));
        System.out.println("Is 'rover' a palindrom? " +
                FuncStat.IsPalindrome("rover"));
    }
}



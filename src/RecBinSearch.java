public class RecBinSearch {
    public static int binSearchRec(int[] a, int what,
                                   int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = (right + left) / 2;
        if (what == a[mid]) {
            return mid;
        } else if (what < a[mid]) {
            return binSearchRec(a, what, left, mid - 1);
        } else {
            return binSearchRec(a, what, mid + 1, right);
        }
    }
    public static void main (String[] args) {
        int[] a = {1, 4, 5, 7, 9, 10};
        for (int i = a[0]; i <= a[a.length-1]; ++i)
            System.out.printf("what=%2d ind=%2d%n",
                    i, binSearchRec(a, i, 0, a.length));
        System.out.println("**************");
        int[] b = {-1,1,3,4,6};
        for (int i = b[0]; i <= b[b.length-1]; ++i)
            System.out.printf("what=%2d ind=%2d%n",
                    i, binSearchRec(b, i, 0, b.length));
    }
}
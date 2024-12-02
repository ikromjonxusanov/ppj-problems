public class Recurs2 {
    static int countEven(int[] arr, int from) {
        if (from == arr.length) {
            return 0;
        }
        if (arr[from] % 2 == 0) {
            return 1 + countEven(arr, from + 1);
        }
        return countEven(arr, from + 1);
    }

    public static void main(String[] args) {
        int[] a = {2,3,2,4,3,1,6,3,2,3};
        System.out.println("# of even: " + countEven(a,0));
    }
}
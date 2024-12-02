public class Problem_9 {
    public static void main(String[] args) {
//        int[] arr = {1, 5, 8, 2, 6};
//        int max_item = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max_item) {
//                max_item = arr[i];
//            }
//        }
//        int loop = max_item;
//        for (int i = 0; i < loop; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[j] == max_item) {
//                    System.out.print("*");
//                    arr[j]--;
//                } else {
//                    System.out.print(" ");
//                }
//
//            }
//            max_item--;
//            System.out.println();
//        }
//        int[] arr = {1, 2, 3, 4, 5};
//        int val;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (i != arr.length - 1) {
//                val = arr[i];
//                arr[i] = arr[i + 1];
//                arr[i + 1] = val;
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        int[] arr = {1, 2, 3, 4, 5};
//        int n = 9;
//        int val, index;
//        for (int i = 0; i < arr.length/2; i++) {
//            val = arr[i];
//            index = ((n+i-1) % arr.length);
//            arr[i] = arr[index];
//            arr[index] = val;
//        }
//        System.out.println();
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        int[] arr = { 2,3,4,3,6,7,6,8,2,9 };
//        int[] brr = { 2,3,6,8,5,1 };
//        for (int i = 0; i < brr.length; i++) {
//            for (int j = i; j < arr.length; j++) {
//                if (brr[i] == arr[j]) {
//                    System.out.print(brr[i] + " ");
//                    break;
//                }
//            }
//        }
        int[] arra = {3, 5, 8, 9, 11, 13, 14, 14, 19};
        int[] arrb = {15, 11, 2, 2, 0, -1};
        int[] arrc = new int[arra.length + arrb.length];
        for (int i = 0; i < arra.length; i++) {
            arrc[i] = arra[i];
        }
        for (int i = 0; i < arrb.length; i++) {
            arrc[arra.length + i] = arrb[i];
        }
        for (int i = 0; i < arrc.length; i++) {
            System.out.print(arrc[i] + " ");
        }
        System.out.println();

        int min_i;
        int v;

        for (int i = 0; i < arrc.length; i++) {
            min_i = i;
            for (int j = i; j < arrc.length; j++) {
                if (arrc[min_i] > arrc[j]) {
                    min_i = j;
                }
            }
            v = arrc[i];
            arrc[i] = arrc[min_i];
            arrc[min_i] = v;
        }
        System.out.println();

        for (int i = 0; i < arrc.length; i++) {
            System.out.print(arrc[i] + " ");
        }
    }
}

package l2_datatypes;

public class Array {
    public static void main(String[] args) {
        //        int[] arr = new int[10];
        //        int[] arr = new int[]{1, 2, 3, 4, 5};
//        int[] arr = {1, 2, 3, 4, 5};
//        int[][] arr = new int[5][6];
        int[][] arr = new int[3][];
        arr[0] = new int[]{1,3,5};
        arr[1] = new int[]{5};
        arr[2] = new int[]{3,5};
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

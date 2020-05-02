package l4_functions;

import java.util.Arrays;

import l5_basics_oop.Student;

public class TestArrayChange {
    public static void main(String[] args) {
        int v = 10;
        int[] a = {1,2,3};
        changeData(v,a);
        System.out.println(v);
        System.out.println(Arrays.toString(a));
        System.out.println();
    }
    public static void changeData(int var, int[] arr){
        System.out.println(var);
        System.out.println(Arrays.toString(arr));
        System.out.println();
        var = 0;
        arr[1] =  100;
        System.out.println(var);
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }
}

package Array.SingleArray;

import java.util.Arrays;

public class ArraysMethod {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 2};
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        int key = 8;
        int index = Arrays.binarySearch(arr,key);
        if(index >= 0 ){
            System.out.println("Index of " + key + " is "+ index);
        }else{
            System.out.println(key + " not found in array.");
        }

        // to copy array
        int[] copy  = Arrays.copyOf(arr,3); // here 3 elements of arr will be copied
        System.out.println("\nOriginal: "+Arrays.toString(arr));
        System.out.println("Copy: "+Arrays.toString(copy));

        int[] arr1 = new int[5];
        Arrays.fill(arr1,6);
        System.out.println("\nSecond Array: "+ Arrays.toString(arr1));


        int[] a = {1,2,3};
        int[] b = {1,2,3};

        System.out.println("\nCompare Array A and Array B: " + Arrays.equals(a,b));

        int[][] a1 = {{1,2},{3,4}};
        int[][] b1 = {{1,2},{3,4}};
        System.out.println("\nCompare Array a1 and b1 (multidimensional): "+ Arrays.deepEquals(a1,b1));

        int[] arr2 = {2,3,2};
        int[] arr3 = {2,3,6};
        System.out.println("\nFind first mismatch in array: "+ Arrays.mismatch(arr2,arr3));

        int[] arr4 = {5, 3, 8, 1};
        Arrays.parallelSort(arr4);
        //parallel sort is more faster than sort as it uses different thread.
        System.out.println("\nParallel sort: " + Arrays.toString(arr4));

        int[] arr5 =  new int[5];
        Arrays.setAll(arr5,i-> i*3);
        System.out.println("\nSetall: " + Arrays.toString(arr5));
    }
}

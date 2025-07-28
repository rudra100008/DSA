package SelectionAlgorithm;

import java.util.Arrays;

//Selection Sort is a comparison-based sorting algorithm. It sorts an array by repeatedly
// selecting the smallest (or largest) element from the unsorted portion and swapping it with the
// first unsorted element. This process continues until the entire array is sorted.
//
//1. First we find the smallest element and swap it with the first element.
// This way we get the smallest element at its correct position.
//2.Then we find the smallest among remaining elements (or second smallest)
// and swap it with the second element.
//3. We keep doing this until we get all elements moved to correct position.
public class SelectionSort {
    public static int[] selectionsort(int[] arr){
        for (int j = 0; j<arr.length;j++) {
            int smallest = j;
            for (int i = j+1; i < arr.length; i++) {
                if (arr[i] < arr[smallest]) {
                    smallest = i;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] array = { 64, 25, 12, 22, 11};
        System.out.println("UnSorted Array: "+ Arrays.toString(array));
        int[] output = selectionsort(array);
        System.out.println("Sorted Array: "+Arrays.toString(output));
    }
}

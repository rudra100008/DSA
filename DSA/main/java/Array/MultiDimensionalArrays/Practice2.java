package Array.MultiDimensionalArrays;

import java.util.Arrays;

//Traversing 2D array
public class Practice2 {
    public static void main(String[] args) {
        int[][] arrays1 = {{5,2,3,1,4},{8,9,6}};

        for (int[] a :arrays1){
            Arrays.sort(a);
            System.out.println(Arrays.toString(a));
        }

//        for (int i = 0; i<arrays1.length; i++){
//            Arrays.sort(arrays1[i]);
//            for (int j = 0; j< arrays1[i].length; j++){
//                System.out.println("["+i+"]"+"["+j+"] : " +  arrays1[i][j]);
//            }
//        }
    }
}

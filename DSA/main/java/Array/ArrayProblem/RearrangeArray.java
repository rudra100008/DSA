package Array.ArrayProblem;

//Examples:
//
//Input: arr[] = [-1, -1, 6, 1, 9, 3, 2, -1, 4, -1]
//Output: [-1, 1, 2, 3, 4, -1, 6, -1, -1, 9]
//Explanation: In range 0 to 9, all except 0, 5, 7 and 8 are present. Hence, we print -1 instead of them.
//
//Input: arr[] = [0, 1, 2, 3, 4, 5]
//Output: [0, 1, 2, 3, 4, 5]
//Explanation: In range 0 to 5, all number are present.


import java.util.Arrays;

public class RearrangeArray {
    public int[] modifyArray(int[] arr){
        int temp;
        for (int i = 0;i<arr.length;i++){
            for(int j = 0; j<arr.length;j++){
                if(arr[j] == i){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    break;
                }
            }
        }
        return  arr;
    }
    public static void main(String[] args) {
        RearrangeArray rearrangeArray = new RearrangeArray();
        int[] arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
         int[] output = rearrangeArray.modifyArray(arr);

        System.out.println("Output: " + Arrays.toString(output));
    }
}

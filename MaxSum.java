import java.util.*;
public class MaxSum {

    private static void FindMaxSum(int[] arr) {
       //Kadane Algo
       int currele=arr[0];
       int maxsum=arr[0];
       for (int i = 0; i < arr.length; i++) {
        currele=Math.max(arr[i], currele+arr[i]);
        maxsum=Math.max(maxsum, currele);
        
       }
       System.out.println(maxsum);
    }
    public static void main(String[] args) {
        int arr[]={1,-2,5,-1,4,-6,9};
        FindMaxSum(arr);
    }

}
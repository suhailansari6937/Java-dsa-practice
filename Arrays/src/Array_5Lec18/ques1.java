package Array_5Lec18;

import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class ques1 {
    static void numOfElements_distinct(int [] arr, int m ){
        int count=1;
        Arrays.sort(arr);
        for (int i=1;i<arr.length;i++){
            if (arr[i]!=arr[i-1]) count++;
        }
        if (count >= m) System.out.println("true");
        else System.out.println("False");
    }
    static void reverse(int [] arr){
        int i =0, j=arr.length-1;
        while (i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    static int [] squarein_Increasing(int [] arr){
        int n = arr.length;
        int [] ans = new int [n];
        int start =0, end =n-1;
        int k=n-1;
        while(start<=end) {
            if (Math.abs(arr[start]) < Math.abs(arr[end])) {
                ans[k--] = arr[end] * arr[end];
                end--;
            } else {
                ans[k--] = arr[start]*arr[start];
                start++;

            }
        }
        return ans;
    }
    // ye approach ekdum chutiya type ka soch hai what if numbers
    // are negative then this approach will be fialed


    static void evenAt_Beginning(int [] arr){
        int n = arr.length;
        int start = 0, end = arr.length-1;
        while(start<end){
            if (arr[start]%2==1&& arr[end]%2==0){
                swap(arr, start, end);
                start++;
                end--;
            }
            if(arr[start]%2==0){
                start++;
            }
            if (arr[end]%2==1){
                end--;
            }
        }
    }
    static void twopointerSort(int [] arr){
        int n = arr.length;
        int start = 0, end = arr.length-1;
        while(start<end){
            if (arr[start]==1&& arr[end]==0){
                swap(arr, start, end);
                start++;
                end--;
            }
            if(arr[start]==0){
                start++;
            }
            if (arr[end]==1){
                end--;
            }
        }
    }
    static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void printArray(int [] arr){
        for (int i =0; i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
        static void sort(int [] arr){
        int count = 0;
        for(int i = 0;i<arr.length;i++) {
            if (arr[i] == 0) count++;
        }
        for (int i =0;i<arr.length;i++) {
            if (i < count) {
                arr[i] = 0;
            } else arr[i] = 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number M :");
        int m = sc.nextInt();
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " Elements");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array : ");
//            System.out.println("sorted Array : ");
        printArray(arr);
        System.out.println("sorted Array : ");
//        sort(arr);
//        twopointerSort(arr);
//        evenAt_Beginning(arr);
//        squareof_NUm(arr);
//       int [] ans = squarein_Increasing(arr);
//        reverse(ans);
//        printArray(arr);
        numOfElements_distinct(arr,m);
    }
}

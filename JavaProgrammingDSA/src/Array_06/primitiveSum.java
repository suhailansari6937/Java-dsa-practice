package Array_06;

import java.util.Scanner;

public class primitiveSum {
    static int arraySum(int [] arr){
        int totalSum=0;
        for (int i=0;i<arr.length;i++){
            totalSum+=arr[i];
        }
        return totalSum;
    }
    static boolean subArrayWithoutSuffix(int arr []) {
        int totalSum = arraySum(arr);
        int [] prefixSumarr= prefixSum(arr);
        for (int i =0;i<arr.length;i++){
            if (prefixSumarr[i] == (totalSum - prefixSumarr[i]))
                return true;
        }
        return false;


    }
    static boolean subArray(int [] arr1, int [] arr2){
        for (int i=1;i<arr1.length-1;i++){
            if(arr1[i]==arr2[i+1]) return true;
        }
        return false;
    }
    static int [] suffixSum(int [] arr){
        int n =arr.length;
        for (int i=n-2;i>=0;i--){
            arr[i]+=arr[i+1];
        }
        return arr;
    }
    static int [] prefixSum(int [] arr){
        int n =arr.length;
        for (int i=1;i<n;i++){
            arr[i]+=arr[i-1];
        }
        return arr;
    }
    static void printArray(int [] arr){
        int n = arr.length;
        for (int i =0;i<n;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    static int rangeSum(int arr [],int l, int r){
        prefixSum(arr);
        int n = arr.length;
       return arr[r]-arr[l-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter values : ");
        for (int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter a number less than the size of array: ");
        int l = sc.nextInt();
        int r = sc.nextInt();
        printArray(arr);
        System.out.println(rangeSum(arr,l,r));
//    int [] prearray=prefixSum(arr.clone());
//        System.out.println(rangeSum(prearray,l,r));
//    int suSum [] = suffixSum(arr.clone());
//    printArray(suSum);
//        System.out.println(subArray(prearray,suSum));
//        System.out.println(subArrayWithoutSuffix(arr));
    }
}

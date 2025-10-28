package afterMidSem;

import java.util.Arrays;
import java.util.Scanner;

public class reverse {
    static void sortingSquare(int [] arr){
        int n = arr.length;
        int x = 0;
        int ans [] = new int [n];
        int start=0;
        int end = n-1;
        while(start<=end){
            if (Math.abs(arr[start])> Math.abs(arr[end])){
                ans[x++]=arr[start]*arr[start];
                start++;
            }
            else {
                ans[x++]=arr[end]*arr[end];
                end--;
            }
        }
        reversee(ans,0,n-1);
        printArray(ans);
    }
    static void sorting03(int [] arr){
        int n = arr.length;
        for (int i=0;i<n;i++){
            arr[i] = arr[i]*arr[i];
        }
        Arrays.sort(arr);
        printArray(arr);
    }
    static void sorting(int [] arr){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        while(start<end){
            if (arr[start]%2==1 && arr[end]%2==0){
                swap(arr,start,end);
                start++;
                end--;
            }
            if (arr[start]%2==0) start++;
            if (arr[end]%2==1) end--;
        }
        printArray(arr);
    }
    static int [] patterrn0011(int arr[]){
        int n = arr.length;
        int left =0;
        int end= n-1;
        while(left<end) {
            if (arr[left] == 1 && arr[end] == 0) {
                swap(arr, left, end);
                left++;
                end--;
            }
            if (arr[left]==0) left++;
            if (arr[end]==1) end--;
        }
        return arr;
    }
    static int [] kRotation(int arr[],int k){
        int n =arr.length;
        k= k%n;
        reversee(arr,0,k-1);
        reversee(arr,k,n-1);
        reversee(arr,0,n-1);
        return arr;

    }
    static int[] reversee(int arr[], int i, int j) {
//        int i = 0;
//        int j = arr.length - 1;
        while (i < j) {
            swap( arr,i, j);
            i++;
            j--;
        }
        return arr;
    }

    static void swap(int [] arr,int i, int j) {
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }

    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of first array : ");
        int n = sc.nextInt();
//        System.out.println("Enter size of second array : ");
//        int m = sc.nextInt();
        int[] arr1 = new int[n];
//        int arr2[] = new int [m];
        System.out.println("Enter elements of first array : ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
//        System.out.println("Enter elements of second array : ");
//        for (int i=0; i<m;i++){
//            arr2[i] = sc.nextInt();
//        System.out.println("Number of rotation :");
//        int k =sc.nextInt();

        System.out.println("Original array : ");
        printArray(arr1);
//        System.out.println("after k rotaion is :");
//        printArray(reversee(arr1,0,n-1));

//        printArray(patterrn0011(arr1));
//        sorting(arr1);
//        sorting03(arr1);
        sortingSquare(arr1);
    }


}

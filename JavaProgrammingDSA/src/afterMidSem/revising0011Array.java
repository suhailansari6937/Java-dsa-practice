package afterMidSem;

import java.util.Scanner;
class helper{
    void printArray(int [] arr){
        int n = arr.length;
        for (int i =0; i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    void swap(int[] arr,int i, int j ){
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    int [] sortArray(int [] arr){
        int n = arr.length;
        int start =0;
        int end = n-1;
        while(start<end){
            if (arr[start]==0) start++;
            if (arr[end]==1) end--;
            swap(arr,start, end);
            start++;
            end--;

        }
        return arr;

    }
}

public class revising0011Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array :");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter elements only 0 and 1's :");
        for (int i =0; i<n;i++){
            arr[i] =sc.nextInt();
        }
        helper obj = new helper();
        obj.printArray(arr);
        System.out.println("After sorting : ");
        obj.sortArray(arr);
        obj.printArray(arr);
    }
}

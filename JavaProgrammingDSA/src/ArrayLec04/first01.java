package ArrayLec04;

//import Array.Operations;

import java.util.Scanner;

public class first01 {
    public static void reverse(int [] arr){
       int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }
    public static void printArr(int [] arr){
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter values : ");
        for (int i =0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        reverse(arr);
        printArr(arr);

    }
}

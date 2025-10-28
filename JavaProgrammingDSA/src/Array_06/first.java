package Array_06;

import java.util.Scanner;

public class first {
    static void  intersectio(int [] arr1, int arr2[]){
        int n = arr1.length;
        int m = arr2.length;
        int count =0;
        for(int i =0;i<n;i++){
//            boolean check = false;
            for (int j =0; j<m;j++){
                if (arr1[i]==arr2[j]){
                    count++;
                    break;
                }
            }
//            if (!check) count++;
        }
//        return count;
        System.out.println(count);
    }
    static void printArray(int [] arr){
        int n = arr.length;
        for (int i =0;i<n;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    static void prefixSum(int [] arr){
        int n = arr.length;

        for (int i=1; i<n;i++){
            arr[i]+=arr[i-1];
        }
        printArray(arr);
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
        System.out.println("Enter size of second array : ");
        int m = sc.nextInt();
        int [] arr2= new int[m];
        System.out.println("Enter values : ");
        for (int i =0; i<m;i++){
            arr2[i] = sc.nextInt();
        }
        System.out.println("Original array: ");
        printArray(arr);
//        System.out.println("After prefix sum : ");
//        prefixSum(arr);
//        System.out.println(intersectio(arr,arr2));
        intersectio(arr,arr2);
    }
}

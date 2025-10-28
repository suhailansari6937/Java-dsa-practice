package afterMidSem;

import java.util.Scanner;

public class finding_union {
    static void printArray(int[] arr ){
        int n = arr.length;
        for (int i =0; i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static int union(int [] a, int b []){
        int n = a.length;
        int m = b.length;
        int count=0;
        for (int i =0;i<n;i++){
            boolean found = false;
            for (int j =i+1;j<n;j++){
                if (a[i] == a[j]){
                    found = true;
                    break;
                }
            }
            if (!found) count++;

        }
        for (int i=0;i<m;i++){
            boolean check = false;
            for(int j =0;j<n;j++){
                if (b[i]== a[j]){
                    check = true;
                    break;
                }
            }
            for (int j =i+1;j<m;j++){
                if (b[i] == b[j]){
                    check = true;
                    break;
                }
            }
            if (!check ) count++;

        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of first array : ");
        int n = sc.nextInt();
        System.out.println("Enter size of second array : ");
        int m = sc.nextInt();
        int [] arr1 = new int [n];
        int arr2[] = new int [m];
        System.out.println("Enter elements of first array : ");
        for (int i =0; i<n;i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter elements of second array : ");
        for (int i=0; i<m;i++){
            arr2[i] = sc.nextInt();
        }
        System.out.println("Original array : ");
        printArray(arr1);
        printArray(arr2);
        System.out.print("the number of distinct element in both the arrays are :");
        System.out.println(union(arr1,arr2));
//        union(arr1,arr2);
    }
}
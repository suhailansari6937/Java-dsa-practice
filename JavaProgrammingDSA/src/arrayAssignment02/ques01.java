package arrayAssignment02;

import java.util.Scanner;

public class ques01 {
    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter sizw of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                ans[j++] = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                ans[j++] = arr[i];


            }
        }
        System.out.println("Original array : ");
        printArray(arr);
        System.out.println("After solving : ");
        printArray(ans);

    }
}

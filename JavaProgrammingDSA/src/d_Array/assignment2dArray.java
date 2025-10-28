package d_Array;

import java.util.Scanner;

public class assignment2dArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int arr[][] = {{3, 8, 0}, {6, 3, 2}, {12, 9, 10}};
        System.out.println("Search for : ");
        int n = sc.nextInt();
        boolean found = false;
       for (int i = 0; i < arr.length; i++) {
           for (int j = 0; j < arr[i].length; j++) {
               if (arr[i][j] == n){
                   System.out.println("row "+ i+ " col "+j);
                   found = true;
//                   break;
               }
           }
       }
       if (!found){
        System.out.println(-1);}
    }
}

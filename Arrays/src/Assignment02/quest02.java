package Assignment02;

import java.util.Scanner;

public class quest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in first array : ");
        int m = sc.nextInt();
        System.out.println("Enter its elements : ");
        int []arr1 = new int[m];
        for (int i =0;i<m;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter size of seccond array : ");
        int n = sc.nextInt();
        int [] arr2= new int [n];
        for (int i=0; i<n;i++){
            arr2[i] = sc.nextInt();
        }
        int [] ans = new int [m+n];
        int ind=0;
        for(int i =0;i<m;i++){
            ans[ind++] = arr1[i];
        }
        for (int j =0;j<n;j++){
            ans[ind++]= arr2[j];
        }
        for (int i =0;i<m+n;i++){
            for (int j =i+1;j<m+n;j++){
            }
        }

    }
}

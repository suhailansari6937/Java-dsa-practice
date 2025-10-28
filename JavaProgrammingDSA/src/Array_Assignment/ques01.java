package Array_Assignment;

import java.util.Scanner;
class Assignment {
    int question02(int[] a, int[] b){
        int m = a.length;
        int x = m;
        int n = b.length;
        for(int i =0; i<m; i++){
            for (int j =0; j<n;j++){
                if (a[i] ==b[j]) break;
                else {
                    x++;
                    break;
                }
            }
        }
        return x;
    }
    void question01(int[] arr) {
        int ind = 0;
        int n =arr.length;
        int[] ans = new int [n];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                ans[ind] = arr[i];
                ind++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                ans[ind] = arr[i];
                ind++;
            }
        }
        for(int i =0; i<arr.length;i++){
            System.out.print(ans[i]+ " ");
        }
    }
}

public class ques01 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Sixe of array : ");
//        int n = sc.nextInt();
//      int [] arr = {-3,-1,0,-7};
//        int [] arr = new int [n];
//        for (int i =0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
        Assignment obj = new Assignment();
        int [] arr1= {1,2,3,4,5};
        int arr2[] = {1,2,3};
        int n = obj.question02(arr1,arr2);
        System.out.println("Number of distinct element : ");
        System.out.println(n);
//        obj.question01(arr);

    }
}

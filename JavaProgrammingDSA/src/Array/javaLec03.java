package Array;

import java.util.Arrays;
import java.util.Scanner;
class concepts{
    int firstsmallest(int [] arr){
        int min = Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    int secondSmallest(int [] arr){
        int min = firstsmallest(arr);
        for (int i=0;i<arr.length;i++){
            if (arr[i] ==min ){
                arr[i] = Integer.MAX_VALUE;
            }
        }
        int sMin = firstsmallest(arr);
        return sMin;
    }
    int firstRepatingValue(int [] arr){
        int ans =-1;
        for (int i =0; i<arr.length;i++){
            for (int j =i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    ans =arr[i];
                }
            }
        }
        return ans;
    }
    int findMax(int [] arr){
        int mx = Integer.MIN_VALUE;
        for (int i=0; i<arr.length;i++){
            if (arr[i]>mx){
                mx = arr[i];
            }
        }
        return mx;
    }
    int secondLargest02(int [] arr){
        int max = findMax(arr);
        for (int i=0;i<arr.length;i++){
            if(arr[i] == max){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondMax = findMax(arr);
        return secondMax;
    }
    public int secondLargest(int [] arr){
        int n = arr.length;
        int sLarge=0;
        Arrays.sort(arr);
        int large = arr[n-1];
        for (int i=n-2;i>0;){
            if(arr[i] == large) i--;
            else {
                sLarge = arr[i];
                break;
            }
        }
        return sLarge;

    }
//    public int triple_Sum(int [] arr, int target){
//        int n = arr.length;
//        int ans =0;
//        for (int i=0;i<n;i++){
//            for (int j=i+1;j<n;j++){
//                for (int k =j+1;k<n;k++){
//                    if (arr[i]+arr[j]+arr[k] == target){
//                        ans++;
//                    }
//                }
//            }
//        }
//        return ans;
//    }
}

public class javaLec03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter size of array : ");
        int n  = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter its elements : ");
        for (int i =0; i<n;i++) {
            arr[i] = sc.nextInt();
        }
//        System.out.println("Enter target sum : ");
//        int t = sc.nextInt();
            concepts obj = new concepts();
            System.out.println(obj.secondSmallest(arr));
        }
    }


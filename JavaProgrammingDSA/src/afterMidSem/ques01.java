package afterMidSem;

import java.util.Scanner;

public class ques01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []  arr = {2,6,-5,-1,0,4,-9};
        for (int i=0; i<arr.length;i++){
            if (arr[i]>=0){
                System.out.println(arr[i]);
            }
        }
    }
}

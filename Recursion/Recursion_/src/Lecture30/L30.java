package Lecture30;

import java.util.Scanner;

public class L30 {
    static int sumOfN(int n ){
        if(n==1) return 1;
        return sumOfN(n-1)+n;
    }
    static int question2(int n){
        if(n==0) return 0;
        if(n%2==0) return question2(n-1) - n;
        else return   question2(n-1) +n ;
    }
    static void  ques01(int n, int k){
        if(k==1) {
            System.out.println(n);
            return;
        }
         ques01(n,k-1);
        System.out.println(n*k);
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value of num : ");
        int num = sc.nextInt();
//        System.out.println("Enter value of k : ");
//        int k= sc.nextInt();
//        ques01(num,k);
//        System.out.println(question2(num));
        System.out.println(sumOfN(5));
        }



}


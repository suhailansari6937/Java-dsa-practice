package Lecture29;

import java.util.Scanner;

public class sumOfDigits {
    // second method for pow which has less time complexity i.e O(logn)
    static int pow2(int p, int q){
        if(q==0){
            return 1;
        }
        int smallAns = pow2(p,q/2);
        if(q%2==0){
            return smallAns * smallAns;
        }
        else return p*smallAns*smallAns;
    }
    static int pow(int p, int q){
        if(p==0 && q==0){
            System.out.println("Not Defined");
            return -1;
        }
        if(q==0){
            return 1;
        }
        return p * pow(p, q-1);
    }
    static int countOfDigits(int n){
        n = Math.abs(n);
        if( n<=9){
            return 1;
        }
        return 1+countOfDigits(n/10);
    }
    static int SOD(int n){
        if(n==0){
            return 0;
        }
//        int sum = n%10;
//        SOD(n/10);
        return n%10 + SOD(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m  = sc.nextInt();
        System.out.println(pow2(n,m));
    }
}

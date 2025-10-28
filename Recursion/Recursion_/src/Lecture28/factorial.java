package Lecture28;

import java.util.Scanner;

public class factorial {
    static int fibonacci(int n ){
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }
    static int fact(int n){
        if(n==0)
            return 1;
        int ans = fact(n-1);
        return ans*n;
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
//        System.out.println(fact(n));
        for(int i=1;i<=n;i++){
            System.out.println(fibonacci(i));
        }
    }
}

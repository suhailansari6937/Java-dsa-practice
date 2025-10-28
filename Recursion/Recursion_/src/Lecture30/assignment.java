package Lecture30;

public class assignment {
    /* Q2 - Find m-th summation of first n natural numbers where m-th summation of first n natural
numbers is defined as following:
If m > 1: SUM(n, m) = SUM(SUM(n, m - 1), 1)
Else :SUM(n, 1) = Sum of first n natural numbers.


Input1: n = 3, m = 2
Output1: SUM(3, 2) = 21
Explanation : SUM(3, 2)
= SUM(SUM(3, 1), 1)
= SUM(6, 1)
= 21

Input2 : n = 4, m = 1
Output2 : SUM(4, 1) = 10*/
    static int question2(int n, int m){
        if(m==1){
            if(n==1) return n;
            return n+question2(n-1,m);
        }
        int ans = question2(n,m-1);
        return  ans + question2(ans-1,m-1);

    }

    //Q1 - Given a number n, print the following pattern without using any loop.
    //n, n-5, n-10, ..., 0, 5, 10, ..., n-5, n
    //
    //Input1: n = 16
    //Output1: 16, 11, 6, 1, -4, 1, 6, 11, 16
    //Input2: n = 10
    //Output2: 10, 5, 0, 5, 10
    static void ques1(int n ){
        if(n<=0){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        ques1(n-5);
        System.out.println(n);

    }
    static void main(String[] args) {
//        ques1(10);
        System.out.println(question2(4,2));


    }
}

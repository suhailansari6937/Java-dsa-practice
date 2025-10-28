package Lecture30;

public class assignment {
    static int question2(int n, int m){
        if(m==1){
            if(n==1) return n;
            return n+question2(n-1,m);
        }
        int ans = question2(n,m-1);
        return  ans + question2(ans-1,m-1);

    }
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

package Lecture30;

public class assignment {
    static int question2(int n, int m){
        if(m==0){
            return 0;
        }
        int sum = question2(question2(n,m-1),1);
        return sum;

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
        question2(3,2);


    }
}

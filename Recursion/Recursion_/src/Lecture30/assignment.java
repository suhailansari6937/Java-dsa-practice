package Lecture30;

public class assignment {
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
        ques1(10);


    }
}

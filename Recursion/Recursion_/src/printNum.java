import java.util.Scanner;

public class printNum {
    //factorial print krke dikaho to manu
    static void factorialPrint(int n,int ans){
        if(n==0){
            return;
        }
//        int sum=1;
        ans*=n;
        factorialPrint(n-1,1);
        System.out.println(ans);
    }
    //print table
    static void printTable(int n, int i){
        if(i>20){
            return;
        }
        System.out.print(n*i+ " ");
        printTable(n, i+2);
    }
    // print numbers from n => 1
    static void printNum(int num) {
        if (num == 0) {
            return;
        }
        System.out.print(num);
        printNum(num-1);

    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//        printNum(num);
//        printTable(num,0);
        factorialPrint(num,1);
    }
}

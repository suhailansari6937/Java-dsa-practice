package someBaiscProblems;
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1, b =1;
        System.out.println("Enter number upto which you wants to run fibonacci series : ");
        int n = sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        int c;
        for(int i =1; i<=n;i++){
            c = a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
//        int c = a+b

    }
}

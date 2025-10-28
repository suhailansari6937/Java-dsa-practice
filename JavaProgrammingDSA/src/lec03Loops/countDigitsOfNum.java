package lec03Loops;
import java.util.Scanner;
public class countDigitsOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        int a = 0;
        for(int i=1; i<=n;){
            if(n/i!=0)
            a=a+1;
            i=i*10;
        }
        System.out.println(a);
    }
}

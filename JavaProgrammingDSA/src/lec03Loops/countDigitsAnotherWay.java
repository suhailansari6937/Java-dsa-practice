package lec03Loops;
import java.util.Scanner;
public class countDigitsAnotherWay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();
        int a = 1;
        if(n/10!=0){
            a++;
        }
        System.out.println(a);
    }
}

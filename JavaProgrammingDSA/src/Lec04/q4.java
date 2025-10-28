package Lec04;
import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        // loop through test cases
        for(int i =0; i<t;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a+b;
            System.out.println(sum);
        }
    }
}

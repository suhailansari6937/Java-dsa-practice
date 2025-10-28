package Lec05;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int d1 = a/100;
       int d2 = (a/10)%10;
       int d3 = a%10;
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        int sum = d1+d2+d3;
        System.out.println(sum);
    }
}

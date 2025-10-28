package lec03Loops;
import java.util.Scanner;
public class displayArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n= sc.nextInt();
        for (int i=0;i<n;i++){
            System.out.println(2*i+1);
        }
    }
}

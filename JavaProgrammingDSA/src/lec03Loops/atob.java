package lec03Loops;
import java.util.Scanner;

public class atob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int a = sc.nextInt();
        System.out.println("Upto which number you want to print :");
        int b = sc.nextInt();
        for(int i =a; i<=b;i++){
            System.out.println(i);
        }
    }
}

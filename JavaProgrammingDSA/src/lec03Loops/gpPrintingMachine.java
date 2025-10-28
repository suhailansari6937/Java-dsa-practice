package lec03Loops;
import java.util.Scanner;
public class gpPrintingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms : ");
        int n = sc.nextInt();
        System.out.println("Enter first term : ");
        int a = sc.nextInt();
        System.out.println("Enter common ratio : ");
        int r = sc.nextInt();
        for(int i =1;i<=n;i++){
            System.out.print(a+ " ");
            a*=r;
        }
    }
}

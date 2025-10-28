package lec03Loops;
import java.util.Scanner;
public class wowLeet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value : ");
        int n = sc.nextInt();
        if(n!=0){
            int a = n%10;
            int b = n/10;
            n = a*a + b*b;
        }
        else {
            System.out.println("Done");
        }
    }
}

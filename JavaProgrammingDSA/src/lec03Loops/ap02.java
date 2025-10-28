package lec03Loops;
import java.util.Scanner;
public class ap02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :" );
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(3*i+1);
        }

    }
}

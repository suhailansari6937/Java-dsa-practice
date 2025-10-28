package BasicsOfJava.HW;
import java.util.Scanner;
public class findRemainder {
    public static void main(String[] args) {
        // find remainder without using modulo operator
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter dividend : ");
        int dividend = sc.nextInt();
        System.out.println("Enter divisor : ");
        int divisor  = sc.nextInt();
        int qoutient = dividend/divisor;
        System.out.println("The remainder is : ");
        int rem = dividend - qoutient*divisor;
        System.out.println(rem);

    }
}

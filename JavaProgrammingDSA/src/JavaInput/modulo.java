package JavaInput;
import java.util.Scanner;
public class modulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dividend : ");
        int p = sc.nextInt();
        System.out.println("Enter divisor : ");
        int q = sc.nextInt();
        System.out.println("The remainder is "+p%q);
    }
}

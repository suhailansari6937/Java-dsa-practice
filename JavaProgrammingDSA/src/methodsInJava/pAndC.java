package methodsInJava;
import java.util.Scanner;
public class pAndC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n : ");
        int n = sc.nextInt();
        System.out.println("Enter value of r : ");
        int r = sc.nextInt();
        if (n < r) {
            System.out.println("Invalid");

        } else {
            System.out.println(permutation(n,r));
        }
    }
    public static int factorial(int a) {
        int b = 1;
        for (int i = 1; i <= a; i++) {
            b *= i;
        }
        return b;
    }
        public static int permutation (int n,int r){
             return factorial(n)/factorial(n-r);
        }
    }


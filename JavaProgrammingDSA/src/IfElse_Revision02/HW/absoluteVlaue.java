package IfElse_Revision02.HW;
import java.util.Scanner;
public class absoluteVlaue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<0) {
            n = n * -1;
        }
            System.out.println(n);

    }
}

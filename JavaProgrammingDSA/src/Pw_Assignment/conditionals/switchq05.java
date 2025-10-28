package Pw_Assignment.conditionals;
import java.util.Scanner;
public class switchq05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter operation :");
        char operator = sc.next().charAt(0);
        double num1;
        double num2;
        double ans;
        System.out.println("Enter num 1 : ");
        num1 = sc.nextDouble();
        System.out.println("Enter num2 : ");
        num2 = sc.nextDouble();

        switch(operator){
            case '+':
                ans = num1+num2;
                System.out.println(ans);
                break;
            case '-':
                ans = num1+num2;
                System.out.println(ans);
                break;

        }

    }
}

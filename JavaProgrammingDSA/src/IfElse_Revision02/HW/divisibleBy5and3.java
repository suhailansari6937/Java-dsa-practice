package IfElse_Revision02.HW;
import java.util.Scanner;
public class divisibleBy5and3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        if(n%5==0 && n%3 == 0){
            System.out.println("It is divisible by 3 and 5");
        }
        else {
            System.out.println("No it is nit divisible by 3 and 5");
        }
    }
}

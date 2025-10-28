package IfElse_Revision02;
import java.util.Scanner;
public class divisibleby3_5notby_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        if(n%3==0 || n%5==0){
            if(n%15==0){
                System.out.println("Not this number");
            }
            else {
                System.out.println("I got the number");
            }
        }
        else {
            System.out.println("NOt this number");
        }
    }
}

package IfElse_Revision02.HW;
import java.util.Scanner;
public class threeDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        if(num>99 && num<1000){
            System.out.println("Yes it's a three  digit number");
        }
        else {
            System.out.println("No its not a three digit number");
        }
    }
}

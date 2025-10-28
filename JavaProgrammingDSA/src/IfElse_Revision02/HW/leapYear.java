package IfElse_Revision02.HW;
import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 4 == 0) {
            System.out.println("it's a leap year : ");
        }
        else {
            System.out.println("Normal year");
        }

    }
}
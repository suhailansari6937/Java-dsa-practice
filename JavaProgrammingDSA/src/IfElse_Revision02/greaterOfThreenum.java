package IfElse_Revision02;
import java.util.Scanner;

public class greaterOfThreenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        System.out.println("1st number : ");
        int a = sc.nextInt();
        System.out.println("2nd number : ");
        int b = sc.nextInt();
        System.out.println("3rd number : ");
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println(a+" is greater");
        } else if (b>a && b>c) {
            System.out.println(b+" is greater");

        }
        else {
            System.out.println(c+ " greater");
        }
    }
}

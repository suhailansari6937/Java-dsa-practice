package IfElse_Revision02;
import java.util.Scanner;
public class greatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers : ");
        System.out.println("First number : ");
        int a = sc.nextInt();
        System.out.println("Second number : ");
        int b = sc.nextInt();
        System.out.println("Third Number : ");
        int c = sc.nextInt();
        if(a>b){
            if (a>c){
                System.out.println(a+"is greatest");
            }
            else {
                System.out.println(c+" is greatest");
            }
        }
        else {
            if (b>c){
                System.out.println(b+ " is greatest");
            }
            else {
                System.out.println(c+ " is greatest");
            }
        }
    }
}

package IfElse_Revision02;
import java.util.Scanner;
public class triangleOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of triangle :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a+b>c && b+c>a && c+a>b){
            System.out.println("It is a triangle");
        }
        else {
            System.out.println("It is not a triangle");
        }
    }
}

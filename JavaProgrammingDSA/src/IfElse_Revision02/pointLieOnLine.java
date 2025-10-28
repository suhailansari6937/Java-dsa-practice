package IfElse_Revision02;
import java.util.Scanner;

public class pointLieOnLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first point : ");
        double x1 = sc.nextInt();
        double y1 = sc.nextInt();
        System.out.println("Enter second point : ");
        double x2 = sc.nextInt();
        double y2 = sc.nextInt();
        System.out.println("Enter third point : ");
        double x3 = sc.nextInt();
        double y3 = sc.nextInt();
        double m1 = (y2-y1)/(x2-x1);
        double m2 = (y3-y2)/(x3-x2);
        if (m1 == m2){
            System.out.println("points lies on straight line");
        }
        else {
            System.out.println("point does not lies on straight line");
        }
    }
}

package IfElse_Revision02.HW;
import java.util.Scanner;

public class rectangleProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length : ");
        int len = sc.nextInt();
        System.out.println("Enter breadth : ");
        int bre= sc.nextInt();
        int area = len*bre;
        int perimeter = 2*(len+bre);
        if(area>perimeter){
            System.out.println("area of rectangle is greater than perimeter");

        }
        else if (area<perimeter){
            System.out.println("area of rectangle is smaller than perimeter");
        }
        else {
            System.out.println("area and perimeter are equal");
        }
    }
}

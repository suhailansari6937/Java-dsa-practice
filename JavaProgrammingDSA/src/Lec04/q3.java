package Lec04;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in respective subjects: ");
        System.out.println("Maths : ");
        double m = sc.nextDouble();
        System.out.println("OS : ");
        double os = sc.nextDouble();
        System.out.println("chem : ");
        double ch = sc.nextDouble();
        double total_mark = m+os+ch;
        double per = total_mark/3;
        System.out.println("Total marks : "+total_mark);
        System.out.println("percentage : "+per);
    }
}

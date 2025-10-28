package Lec04;
import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name : ");
        String Name = sc.nextLine();
        System.out.println("Enter Roll no : ");
        int rollno = sc.nextInt();
        sc.nextLine();
        System.out.println("Field of interest : ");
        String field_of_interest = sc.nextLine();
        System.out.println(Name+ rollno+ field_of_interest);
    }
}

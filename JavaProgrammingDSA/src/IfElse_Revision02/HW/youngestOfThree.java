package IfElse_Revision02.HW;
import java.util.Scanner;

public class youngestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age of Ram: ");
        int ram = sc.nextInt();
        System.out.println("Enter age of Shyam : ");
        int shyam = sc.nextInt();
        System.out.println("Enter age of Ajay : ");
        int ajay = sc.nextInt();
        if(ram>shyam){
            if(ajay>shyam){
                System.out.println(shyam+ "shyam is youngest");

            }
            else {
                System.out.println(ajay+ "ajay is youngest");
            }
        }  else {
            if(ram<ajay){
                System.out.println(ram+ "ram is youngest");
            }
            else {
                System.out.println(ajay+ "ajay is youngest");
            }
        }
    }
}

package methodsInJava;
import java.util.Scanner;
public class passingArgument {
    public static void greet(String name){
        System.out.println("Good morning "+name);
    }

    public static void main(String[] args) {
//        greet("Suhail");
//        sum(10,50);
        StudentDetail("Suhail",22,"Mca",'A');

    }
    public static void sum(int a,int b){
        System.out.println("Sum is : "+(a+b));
    }

    public static void StudentDetail(String name, int age, String classs, char grade){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Class : "+classs);
        System.out.println("grade : "+grade);
    }
}

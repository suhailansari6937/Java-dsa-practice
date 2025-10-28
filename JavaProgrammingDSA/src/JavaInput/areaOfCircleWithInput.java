package JavaInput;
import java.util.Scanner;
public class areaOfCircleWithInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius : ");
        int radius = sc.nextInt();
        double pi = 3.14;
        double area = pi*radius*radius;
        System.out.println(area);



    }
}

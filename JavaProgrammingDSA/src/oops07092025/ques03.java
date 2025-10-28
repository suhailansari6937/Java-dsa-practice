package oops07092025;
import java.util.Scanner;
class Area{
    int l,b;
    public double getArea(){
        double area = l*b;
        return area;

    }
}
public class ques03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area obj = new Area();
        obj.l = sc.nextInt();
        obj.b = sc.nextInt();
        System.out.println(obj.getArea());
    }
}

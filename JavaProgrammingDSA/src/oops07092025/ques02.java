package oops07092025;
import java.util.*;
class Triangle{
    int a =3;
    int b = 4;
    int c = 5;
    double s =(a+b+c)/2;
    double areaa = (s*(s-a)*(s-b)*(s-c));
    double area = Math.sqrt(areaa);
    double perimeter = a+b+c;
}
public class ques02 {
    public static void main(String[] args) {
        Triangle obj = new Triangle();
        System.out.println(obj.area);
        System.out.println(obj.perimeter);
    }
}

package afterMidSem;
import java.util.*;
public class ques4 {
    public static void main(String[] args) {
        int [] arr={2,-3,5,8,1,0,-4};
         int a =Arrays.stream(arr).min().getAsInt();
        System.out.println(a);
    }

}

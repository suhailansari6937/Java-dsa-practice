package afterMidSem;

public class ques5 {
    public static void main(String[] args) {
        int [] arr = {1,1,3,4,2,3,5,7,0};
        int lastElement = -1;
        for (int i = 1; i<arr.length-1;i++){
            if (arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                lastElement=arr[i];
            }
        }
        System.out.println(lastElement);
    }
}

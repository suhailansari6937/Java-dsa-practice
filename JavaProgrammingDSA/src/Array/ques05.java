package Array;

public class ques05 {
    public static void main(String[] args) {
        int [] arr ={1,5,8,8,5,46,5,96,5,20};
        int x=5;
        int count = 0;
        for (int i =0;i<arr.length;i++){
            if(arr[i] == x){
                count++;
            }

        }
        System.out.println(count);
    }
}

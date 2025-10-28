package Array;

public class findMax {
    public static void main(String[] args) {
        int [] arr = {1,5,56,87,77,14,56,87};
        int max =arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
            else ;
        }
        int max2=arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i] == max) continue;
            else if (arr[i]>max2){
                    max2 = arr[i];
            }
            else;

        }
        System.out.println(max2);
    }
}

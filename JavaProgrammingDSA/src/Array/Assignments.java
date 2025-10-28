package Array;
class problems{
    void ques05(){
        int [] arr= {1,1,3,4,2,3,5,7,0};
        for( int i =1;i<arr.length-1;i++){
            if (arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                System.out.println(arr[i]);
                break;
            }
        }
    }
    void ques02(){
        String [] str = {"ab", "bc","cd","de","ef","fg","gh"};
        for(int i =0; i<str.length;i++){
            if(i%2!=0){
                System.out.println(str[i]);

            }
        }

    }
    void ques01(){
        int [] arr = {2, 6, -5, -1, 0, 4, -9};
        for(int i =0;i<arr.length; i++){
            if( arr[i]>=0) System.out.println(arr[i]);
        }
    }
}
public class Assignments {
    public static void main(String[] args) {
        problems obj = new problems();
//        obj.ques01();
//         obj.ques02();
       obj.ques05();
    }


}

package arrayAssignment02;

public class ques03 {
    public static void main(String[] args) {
        int arr[] ={};
        int n =arr.length;
       int s =6;
       int i =0;
       int j =0;
       int sum =0;
       while(j<n){
           sum+=arr[j];
           if (sum>s){
               while(sum>s && i<j){
                   sum-=arr[i];
                   i++;
               }
           }
           if (sum==s){
               System.out.print(i +" "+ j);
//               break;
           }
           j++;
       }
    }
}

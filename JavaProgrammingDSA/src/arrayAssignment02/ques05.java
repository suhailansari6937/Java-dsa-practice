package arrayAssignment02;

public class ques05 {
    public static void main(String[] args) {
        int a[]={2,5,7,9,11};
        int b[]={2,5,7,9,11};
        int n1 = a.length;
        int n2 = b.length;
        boolean found = true;
        if(n1 ==n2){
            for (int i=0;i<n1;i++){
                if (a[i]!=b[i]) {
                    found = false;
                    break;
                }
            }
        }
        else found = false;
        System.out.println(found);
    }
}

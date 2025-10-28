import java.util.ArrayList;
public class array_List {
    static void main(String[] args) {
//        Integer i = Integer.valueOf(4);
//        System.out.println(i);

        ArrayList<Integer> l1 = new ArrayList<>();
//        ArrayList<Boolean> bool = new ArrayList<>();
        // add new element
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);
        l1.add(7);
//        l1.add(true) // error show kr rha hai kyuki restrict kr diye hai elent ko ki wo integer hi ho;

        // get an element at index i
//        System.out.println(l1.get(0));


//        // print with for loop
//        for (int i = 0; i < l1.size(); i++) {
//            System.out.println(l1.get(i));
//        }

        // printing the arrayList directly
        System.out.println(l1); // [5,6,7,8]

        // adding element at index i
        l1.add(1,10);
        System.out.println(l1);

        // modifying element at index i
        l1.set(1,100);
        System.out.println(l1);

        //remove an element index i
        l1.remove(1);
        System.out.println(l1);

        // remove an element e
        l1.remove(Integer.valueOf(7)); // ye method boolean return krta hai
        System.out.println(l1);

        // checking if an element exist or not
        System.out.println(l1.contains(Integer.valueOf(10)));

        // if we don't specify class, we can put anything inside l;
        ArrayList l = new ArrayList();
        l.add(5);
        l.add("Suhail");
        l.add(true);
        System.out.println(l);

    }
}

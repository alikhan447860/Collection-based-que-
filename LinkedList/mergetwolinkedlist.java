import java.util.*;
public class mergetwolinkedlist {
    public static void main(String[] args) {
        LinkedList<String>ll=new LinkedList<>();
        ll.add("A");
        ll.add("B");
        LinkedList<String>l2=new LinkedList<>();
        l2.add("C");
        l2.add("D");
        ll.addAll(l2);

        System.out.println(ll);
    }
}

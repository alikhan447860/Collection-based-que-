import java.util.*;
public class SwaptwoElement {
    public static void main(String[] args) {
        LinkedList<String>ll=new LinkedList<>();
        ll.add("Ali");
        ll.add("khan");
        ll.add("Siddik");
        ll.add("khan");
        System.out.println("Original list "+ll);
        Collections.swap(ll, 0, 2);
        System.out.println("list after swaping "+ll);
        Collections.shuffle(ll);
        System.out.println("after shuffling "+ll);
    }
}

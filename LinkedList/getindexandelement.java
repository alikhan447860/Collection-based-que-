import java.util.*;
public class getindexandelement {
    public static void main(String[] args) {
        LinkedList<Integer>ll=new LinkedList<>();
        ll.add(22);
        ll.add(88);
        ll.add(2);
        ll.add(43);
        ll.add(21);
        System.out.println("Original list "+ll);
        for(int i=0;i<ll.size();i++){
            System.out.println("Element at index "+i+": "+ll.get(i));
        }
    }
}
  
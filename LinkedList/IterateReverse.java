import java.util.*;
public class IterateReverse {
    public static void main(String[] args) {
        LinkedList<Integer>ll=new LinkedList();
        ll.add(22);
        ll.add(88);
        ll.add(8);
        ll.add(7);
        Iterator l=ll.descendingIterator();
        while (l.hasNext()) {
            System.out.print(l.next()+" ");
            
        }
    }
}

import java.util.LinkedList;

public class findfirstandlast {
    public static void main(String[] args) {
        LinkedList<Integer>ll=new LinkedList<>();
        ll.add(88);
        ll.add(99);
        ll.add(5);
        ll.add(100);
        System.out.println("Original linkedlist"+ll);
        System.out.println("First element "+ll.getFirst());
        System.out.println("Last elemtn "+ll.getLast());
    }
}

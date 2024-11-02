import java.util.*;
public class IterateSpecificpos {
    public static void main(String[] args) {
        LinkedList<String>ll=new LinkedList<>(); 
        ll.add("ali");
        ll.add("Khan");
        ll.add("haha");
        ll.add("srk");
        Iterator l=ll.listIterator(2);
        while (l.hasNext()) {
            System.out.println(l.next());
        }
    }
}

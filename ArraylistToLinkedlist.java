import java.util.*;
public class ArraylistToLinkedlist {
    public static void main(String[] args) {
        List<String>li=new ArrayList();
        li.add("cheerry");
        li.add("apple");
        li.add("mango");
        LinkedList<String>ll=new LinkedList<>(li);
        System.out.println(ll);
    }
}

import java.util.*;
public class comparingList {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        List<Integer>list2=new ArrayList<>();
        list2.add(1);
        list2.add(2);
        boolean areequal=list1.equals(list2);
        System.out.println("List are equal? "+areequal);
    }
}

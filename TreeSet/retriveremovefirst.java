import java.util.*;
public class retriveremovefirst {
    public static void main(String[] args) {
        TreeSet<Integer>ts=new TreeSet<>();
        ts.add(10);
        ts.add(88);
        ts.add(44);
        ts.add(32);
        ts.add(99);
        ts.add(23);
        ts.add(27);
        System.out.println("retrived element from treeset "+ts.pollFirst());
        System.out.println(ts);
        System.out.println("retrive last element from treeset "+ts.pollLast());
        System.out.println(ts);
        System.out.println("remove 88 "+ts.remove(88));
        System.out.println(ts);       
    }
}

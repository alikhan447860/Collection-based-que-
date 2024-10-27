import java.util.*;
public class SortHashMap {
    public static void main(String[] args) {
        Set<String>hs=new HashSet<>();
           hs.add("orange");
           hs.add("banana");
           hs.add("apple");
           System.out.println(hs);
           TreeSet<String>ts=new TreeSet<>(hs);
           System.out.println("Sorted TreeSet "+ts);
    }
}

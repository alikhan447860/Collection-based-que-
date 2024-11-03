import java.util.*;
public class hashsetintotreeset {
    public static void main(String[] args) {
        HashSet<Integer>hs=new HashSet<>();
        hs.add(1);
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        System.out.println("Original hashset "+hs);
        TreeSet<Integer>ts=new TreeSet<>(hs);
        System.out.println("Converted treeset "+ts);
    }
}

import java.util.*;
public class Hashsetintoanotherhash {
    public static void main(String[] args) {
        HashSet<String>hs=new HashSet<>();
        hs.add("a");
        hs.add("b");
        hs.add("c");
        HashSet<String>hss=new HashSet<>(hs);
        System.out.println(hss);
    }
}

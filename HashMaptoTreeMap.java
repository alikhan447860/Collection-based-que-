import java.util.*;
public class HashMaptoTreeMap {
    public static void main(String[] args) {
        HashMap<Integer,String>hs=new HashMap<>();
        hs.put(1, "ALi");
        hs.put(2, "Siddik");
        hs.put(3, "yusuf");
        hs.put(2, "kk");
        System.out.println(hs);
        TreeMap<Integer,String>ts=new TreeMap<>(hs);
        System.out.println(ts);
    }
}

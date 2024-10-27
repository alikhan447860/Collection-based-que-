import java.util.*;
public class CopyHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer>hs=new HashMap<>();
        hs.put("ali", 100);
        hs.put("siddik",110);
        System.out.println("Original hashmap "+hs);
        HashMap<String,Integer>copy=new HashMap<>(hs);
        System.out.println("Copied map "+copy);

    }
}

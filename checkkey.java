import java.util.*;
public class checkkey {
    public static void main(String[] args) {
        HashMap<Integer,String>hs=new HashMap<>();
        hs.put(1, "Apple");
        hs.put(2, "Banana");
        boolean exist=hs.containsKey(1);
    System.out.println(exist);
    }
}

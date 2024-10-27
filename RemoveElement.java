import java.util.*;
public class RemoveElement {
    public static void main(String[] args) {
       Set s=new HashSet<>();
        s.add(23);
        s.add(44);
        s.add("ALi khan");
        s.add("khan");
        System.out.println(s);
        s.remove("khan");
        System.out.println(s);

    }
}

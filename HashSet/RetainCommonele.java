import java.util.*;
public class RetainCommonele {
    public static void main(String[] args) {
        HashSet<String>hs=new HashSet<>();
        hs.add("Black");
        hs.add("Green");
        hs.add("Blue");
        System.out.println(hs);
        HashSet<String>hs2=new HashSet<>();
        hs2.add("Black");
        hs2.add("Blue");
        hs2.add("Red");
        hs.retainAll(hs2);
        System.out.println("Common element "+hs);

        

    }
}

import java.util.*;
public class ComparingSet {
    public static void main(String[] args) {
        Set<Integer>set1=new HashSet<>();
        set1.add(1);
        set1.add(2);
        Set<Integer>set2=new HashSet<>();
        set2.add(2);
        set2.add(1);
        boolean areequal=set1.equals(set2);
        System.out.println("Set are equal? "+areequal);
    }
}

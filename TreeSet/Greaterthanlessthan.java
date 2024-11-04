import java.util.*;
public class Greaterthanlessthan {
    public static void main(String[] args) {
        TreeSet<Integer>ts=new TreeSet<>();
        ts.add(10);
        ts.add(88);
        ts.add(44);
        ts.add(32);
        ts.add(99);
        ts.add(23);
        ts.add(27);
        System.out.println("Greater than or equal 88 elements "+ts.ceiling(88));
        System.out.println("Greater than or equal 29 elements "+ts.ceiling(29));
    }
}

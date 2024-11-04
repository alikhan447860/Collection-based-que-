import java.util.*;
public class Lessthan7 {
    public static void main(String[] args) {
        TreeSet<Integer>ts=new TreeSet<>();
        ts.add(1);
        ts.add(2);
        ts.add(3);
        ts.add(7);
        ts.add(8);
        ts.add(9);
        
        System.out.println(ts.headSet(7));
}
}
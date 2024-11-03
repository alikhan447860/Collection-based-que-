import java.util.*;
public class numlessthan7 {
    public static void main(String[] args) {
        TreeSet<Integer>ts=new TreeSet<>();
        ts.add(1);
        ts.add(3);
        ts.add(5);
        ts.add(7);
        ts.add(9);
        ts.add(11);
        ts.add(13);
        System.out.println(ts.headSet(7));

    }
}

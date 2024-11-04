import java.util.*;
public class cloneTreeset {
    public static void main(String[] args) {
        TreeSet<Integer>ts=new TreeSet<>();
        ts.add(1);
        ts.add(2);
        ts.add(3);
        TreeSet<Integer>newts=(TreeSet<Integer>)ts.clone();
        System.out.println(newts);
    }
}

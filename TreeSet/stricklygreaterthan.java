import java.util.*;
public class stricklygreaterthan {
    public static void main(String[] args) {
        TreeSet<Integer>ts=new TreeSet<>();
        ts.add(10);
        ts.add(88);
        ts.add(44);
        ts.add(32);
        ts.add(99);
        ts.add(23);
        ts.add(27);
        System.out.println("greater  than or equal 89 elements "+ts.higher(89));
        System.out.println("greater than or equal 29 elements "+ts.higher(29));
        System.out.println("lower  than or equal 89 elements "+ts.lower(89));
        System.out.println("lower than or equal 29 elements "+ts.lower(29));
    }
}

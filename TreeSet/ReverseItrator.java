import java.util.*;
public class ReverseItrator {
    public static void main(String[] args) {
        TreeSet<Integer>ts=new TreeSet<>();
        ts.add(1);
        ts.add(2);
        ts.add(3);
      System.out.println("Original order "+ts);
      Iterator<Integer>t=ts.descendingIterator();
      while (t.hasNext()) {
        System.out.print(t.next());
      }
    }
}

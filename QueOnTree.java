import java.util.*;
public class QueOnTree {
    public static void main(String[] args) {
        TreeSet<CharSequence> set = new TreeSet<>((s1, s2)->{
            if (s1.length() != s2.length()) {
                return Integer.compare(s1.length(), s2.length());
            }
            return s1.toString().compareTo(s2.toString());
        });
        set.add("A");
        set.add(new StringBuffer("XX"));
        set.add(new StringBuffer("ZZZ"));
        set.add("ABC");
        set.add(new StringBuffer("AA"));
        set.add(new StringBuffer("ABCD"));
        
      System.out.print(set);
    }
}

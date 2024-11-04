import java.util.*;
public class IteratonTreeSet{
    public static void main(String[] args) {
        TreeSet<String>ts=new TreeSet();
        ts.add("apple");
        ts.add("badaApple");
        ts.add("chotaApple");
        // for(String val:ts){
        //     System.out.println(val);
        // }
        Iterator<String> t=  ts.iterator();
        while (t.hasNext()) {
            System.out.println(t.next());
        }
    }
}
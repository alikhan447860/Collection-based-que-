import java.util.*;
public class removegivenele {
    public static void main(String[]args){
        TreeSet<Integer>ts=new TreeSet<>();
        ts.add(10);
        ts.add(11);
        ts.add(12);
        ts.add(13);
       ts.remove(13);
       System.out.println(ts);

    }
}

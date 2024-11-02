import java.util.*;
public class Iterat{
    public static void main(String[]args){
    HashSet<String>hs=new HashSet<>();
    hs.add("Red");
    hs.add("Green");
    hs.add("Yellow");
    hs.add("Blue");
    Iterator<String> it=hs.iterator();
    while (it.hasNext()) {
        System.out.print(it.next()+" ");        
    }
    }
}
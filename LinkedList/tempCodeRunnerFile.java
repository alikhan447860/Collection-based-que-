import java.util.*;
public class iterateallelement{
    public static void main(String[]args){
       LinkedList<Integer>ll=new LinkedList<>();
       ll.add(10);
       ll.add(44);
       ll.add(9);
       ll.add(55);
       for(Integer element:ll){
        System.out.println(element);
       }
    }
}
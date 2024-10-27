import java.util.*;
public class QueOnArrayList{
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(1,1,2,2,2,5,0,0,6));
        int removecount=0;
        while(!list.isEmpty()){
            Integer element=list.get(0);
            list.remove(element);
            removecount ++;
            System.out.println("current list after removal "+element+": "+list);
        }
        System.out.println("Total removal operation untill array empty is "+removecount);
    }
}
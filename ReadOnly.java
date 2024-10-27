import java.util.ArrayList;
import java.util.*;
public class ReadOnly {
    public static void main(String[] args)throws UnsupportedOperationException{
        List<Integer>numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        List<Integer>readonly=Collections.unmodifiableList(numbers);
        try{
            readonly.add(4);
        }catch(UnsupportedOperationException e){
            System.out.println("You can not add new numbers in the list");

        }
System.out.println(readonly);
    }
}

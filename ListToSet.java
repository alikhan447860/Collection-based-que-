import java.util.*;
public class ListToSet {
    public static void main(String[] args) {
        List<Integer>numberlist= Arrays.asList(1,2,3,4,5,1);
        Set<Integer>numberset=new HashSet<>(numberlist);
        System.out.println(numberlist);
        System.out.println(numberset);

    }
}

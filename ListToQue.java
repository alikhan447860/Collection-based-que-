import java.util.*;
public class ListToQue {
    public static void main(String[] args) {
        List<Integer>li= Arrays.asList(1,2,3,4);
           Queue<Integer>que =new LinkedList<>(li);
           System.out.println(que);
    }
}

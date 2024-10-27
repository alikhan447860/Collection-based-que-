import java.util.*;
public class iteratQue {
    public static void main(String[] args) {
        Queue<Integer>que=new LinkedList<>();
        que.add(1);
        que.add(2);
        que.add(3);
        Iterator<Integer>itr=que.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

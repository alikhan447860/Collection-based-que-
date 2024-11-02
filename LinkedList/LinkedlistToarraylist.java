import java.util.*;;
public class LinkedlistToarraylist {
    public static void main(String[] args) {
        LinkedList<Integer>ll=new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        System.out.println("original linked list "+ll);
        List<Integer>al=new ArrayList<>(ll);
        for(Integer val:al){
            System.out.print(val+" ");
        }
    }
}

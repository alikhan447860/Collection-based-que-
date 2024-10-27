import java.util.*;
public class CompareTwoElements {
    public static void main(String[] args) {
        List<Integer>li=new ArrayList<>();
        li.add(12);
        li.add(24);
        li.add(36);
        li.add(48);
        int index1=0;
        int index2=3;
        if(li.get(index1).equals(li.get(index2))){
            System.out.println("Both the elements are equal ");
        }else{
            System.out.println("Both the element is not equal");
        }
    }
}

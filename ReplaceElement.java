import java.util.*;
public class ReplaceElement {
    public static void main(String[] args) {
        List<String>li=new ArrayList();
        li.add("Red");
        li.add("blue");
        li.add("green");
        System.out.println("Original lis "+li);
        li.set(1,"Orange");
        System.out.println("Changed List "+li);
    }
}

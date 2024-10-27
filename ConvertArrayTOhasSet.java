import java.util.*;
public class ConvertArrayTOhasSet {
    public static void main(String[] args) {
        String arr[]={"Ali","khan"};
        Set<String>hs= new HashSet<>(Arrays.asList(arr));
        System.out.println(hs);
    }
}

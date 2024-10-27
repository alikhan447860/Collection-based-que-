import java.util.*;
public class OccuerenceOfStringInMap {
    public static void main(String[] args) {
        String text="A Girl alice is good girl";
        Map<String,Integer>counts=new HashMap<>();
        String[]words=text.split(" ");
        for(String word:words){
            if(counts.containsKey(word)){
counts.put(word,counts.get(word)+1);
            }else{
                counts.put(word,1);
            }
        }
        for(Map.Entry<String,Integer>entry:counts.entrySet()){
            System.out.println(entry.getKey()+"="+entry.getValue());
        }

    }
}

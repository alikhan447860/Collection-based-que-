import java.util.*;
public class Weightofparanthesis {
    public static void main(String[] args) {
        String s="(()(()))";
        System.out.println(calculateweight(s));
    }
    public static int calculateweight(String s){
        int weight=0;
        int level=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                level++;
            }else{
                level--;
                if(s.charAt(i-1)=='('){
                    weight+=1<<level;
                }
            }
        }
        return weight;
    }
}

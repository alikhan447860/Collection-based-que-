public class withcharArray {
    public static void main(String[] args) {
        String str="MohdAli12345678";
        char arr[]=str.toCharArray();
        for(char ch:arr){
            if(Character.isDigit(ch)&& (ch-'0')%2==0){
                System.out.println("Even numbers :"+ch);
            }
        }
    }
}

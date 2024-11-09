public class Solugenixque1{
    public static void main(String[] args) {
        String str="MohdAli12345";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isDigit(ch)&&(ch-'0')%2==0){
                System.out.println("Evene num :"+ch);
            }
        }
    }
}
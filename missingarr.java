public class missingarr {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,9};
        int n=arr.length+1;
         int sum=n*(n+1)/2;
         for(int val:arr){
            sum=sum-val;
         }
         System.out.println(sum);

    }
}

package arrays;

public class besttimetosellstocks {

    public static int sellstocks(int arr[]){

        int costprice=Integer.MAX_VALUE;
        int profit=0;
        int maxprofit=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<costprice){
                costprice=arr[i];
            }
            if(arr[i]>costprice){
                profit=arr[i]-costprice;
                maxprofit=Math.max(profit, maxprofit);
            }
        }   
        return maxprofit;
 }

 public static void main(String[] args) {
    int numbers[]={7,1,5,3,6,4};
    System.out.println(sellstocks(numbers));
 }
    
}

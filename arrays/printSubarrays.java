package arrays;
import java.util.*;

public class printSubarrays {

    public static void printSubarrays(int arr[]){
        int totalSubarrays=0;

        
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
       


       for(int i=0;i<arr.length;i++){
        
         for(int j=i;j<arr.length;j++){
            int sum=0;
           
            for(int k=i;k<=j;k++){
                System.out.print(arr[k]+ " ");//subarray
                sum+=arr[k];
            }
          
            totalSubarrays++;
            System.out.println();
            System.out.println("sum: "+sum);

            if(sum<min){
                min=sum;
            }
            if(max<sum){
                max=sum;
            }
         }
         
         System.out.println();
       }
       System.out.println("total subarrays: "+ totalSubarrays);
       System.out.println(max);
       System.out.println(min);

    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};

        printSubarrays(numbers);
    }
    
}
 
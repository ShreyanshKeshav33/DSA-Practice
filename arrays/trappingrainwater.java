package arrays;
import java.util.*;


public class trappingrainwater {

    public static int trappingrainwater(int arr[]){
          
        int leftmax[]=new int[arr.length];
        leftmax[0]=arr[0];
        for(int i=1;i<arr.length;i++){
          leftmax[i]=Math.max(leftmax[i-1], arr[i]);
        }

        int rightmax[]=new int[arr.length];
        rightmax[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1], arr[i]);
        }

        int trappedwater=0;
        int width=1;
        
        for(int i=0;i<arr.length;i++){
            trappedwater+=(Math.min(rightmax[i],leftmax[i])-arr[i])*width;
        }

        return trappedwater;
            
        }

    

    public static void main(String[] args) {

        int numbers[]={4,2,0,6,3,2,5};
        int res=trappingrainwater(numbers);
        System.out.println(res);
        
    }
    
}

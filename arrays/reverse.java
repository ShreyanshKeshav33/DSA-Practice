package arrays;
import java.util.*;

public class reverse {

    public static int[] reverse(int num[]){
        int first=0;
        int last=num.length-1;

        while(first<last){
            int temp=num[last];
            num[last]=num[first];
            num[first]=temp;

            first++;
            last--;
        }
        return num;
    }

    public static void main(String[] args){
        int num[]={2,4,6,8,10};

        reverse(num);
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]+" ");
        }
        System.out.println();
    }
    
}

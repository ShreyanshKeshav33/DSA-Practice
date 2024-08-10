package arrays;

public class kadanemaxsubarraysum {

    public static int kadane(int arr[]){

    int max= Integer.MIN_VALUE;
    int sum=0;

    for(int i=0;i<arr.length;i++){
      sum+=arr[i];
    }
    if(sum<0){
        sum=0;
    }

    if(sum>max){

        max=sum;
    }
    return max;

    }
    public static void main(String[] args){
        int numbers[]={2,4,6,8,10};

        System.out.println(kadane(numbers));
    }

    
}

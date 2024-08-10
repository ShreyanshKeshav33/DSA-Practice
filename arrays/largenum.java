package arrays;


public class largenum {
    public static int largest(int num[]){
        int large=Integer.MIN_VALUE;

        for(int i=0;i<num.length;i++){
            if(num[i]>large){
              large=num[i];
            }
        }
        return large;

    }
    public static void main(String[] args){
        int num[]={1,2,4,3,6,5};

        int res=largest(num);
       System.out.println(res);

    }
}

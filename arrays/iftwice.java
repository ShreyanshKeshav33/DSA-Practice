package arrays;
public class iftwice {
    public static boolean twice(int arr[]){
          for(int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
          }
          return false;
        }
    public static void main(String[] args) {
        int number[]={1,2,3,2};
        int numbers[]={3,4,5,6};
        int num[]={1,3,1,3,3,4,3,2,4,2};

        System.out.println(twice(number));
        System.out.println(twice(numbers));
        System.out.println(twice(num));
    }
}

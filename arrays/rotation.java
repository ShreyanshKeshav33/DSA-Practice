package arrays;

public class rotation {
//optimal
public static void reverse(int arr[], int start, int end) {
    
    while (start <= end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
}

    public static void rotation(int arr[], int n, int k){
        
        k=k%n;
        /*
          Brute
         
         k=k%arr.length;
         int temp[]= new int[k];

         for(int i=0;i<k;i++){
            temp[i]=arr[i];
         }
         
         for (int i=k;i<arr.length;i++){
            arr[i-k]=arr[i];
         }

         int j=0;
         for(int i=arr.length-k;i<arr.length;i++){
                arr[i]=temp[j];
                j++;
         }
         return arr;
            
         */

         //Optimal
         reverse(arr,0,k-1);
         reverse(arr,k,n-1);
         reverse(arr,0,n-1);


          }
         
    

    public static void main(String[] args) {
            int n = 7;
            int arr[] = {1, 2, 3, 4, 5, 6, 7};
            int k = 3;
    
            System.out.println("Before rotation:");
            for (int i = 0; i < n; i++)
                System.out.print( arr[i] + " ");
            System.out.println();
    
            rotation(arr, n, k);
            System.out.println("After rotation:");
            for (int i = 0; i < n; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
        }
    
    }
    

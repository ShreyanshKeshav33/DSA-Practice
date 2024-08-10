package arrays;
import java.awt.*; //abstract window toolkit library

public class main{

    int a;
    Color piant;

public static void update(int marks[]){
    for(int i=0;i<marks.length;i++){
        marks[i]=marks[i]+1;
    }
}    

public static void main(String[] args) {
    System.out.println("hi");
    System.out.println("shrey");

    //int marks[]=new int[50];
    String fruits[]={"a","b"};
    int marks[]={97,98,99};
    update(marks);

    //print
    for(int i=0;i<marks.length;i++){
        System.out.println(marks[i]+" ");
    }
    
 
    //input
   // Scanner sc= new Scanner(System.in);

    //int phy;
    //phy=sc.nextInt();
   // marks[0]=sc.nextInt();
    
    //System.out.println(marks[0]);
}

}


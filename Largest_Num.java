// program to find  largest Number in an given array
import java.util.Scanner;

class Largest_Num{
      public static int getlargestNum(int arr[]){
        int largest=Integer.MIN_VALUE;//  Integer.MIN_VALUE means -Infinite
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
            
        }
        return largest;
      }
    
       public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in); 
        System.out.println(" enter the length of array ");

        int len=sc.nextInt();
        int arr []= new int[len];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(getlargestNum(arr));
        
        
 sc.close();   }
}
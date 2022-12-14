public class Bubble_Sort {
     public static void bubblesort(int arr[]){
        for(int i =0 ;i < arr.length-1; i++){
                int swap = 0;
            for(int j = 0; j< arr.length-1-i; j++){
                // comparing current element by next element  
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp ;
                    swap =swap+ 1;
                }
               
               
            }
      //  return swap;      
        }
     }
    public static void main(String[] args) {
        int arr [] ={1,2,3,4,5};
        bubblesort(arr);
        
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print("  " + arr[i]);
        }
    }
}

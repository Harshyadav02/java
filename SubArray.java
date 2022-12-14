public class SubArray {
    public static void subpair(int arr[]) {
        for(int i=0; i < arr.length ; i++)
           {
            int start = i;
            int sum = 0;
            
            for(int j = i ; j < arr.length; j++){
                int end = j;
                sum=sum+arr[j];
                
                for(int k = start; k<= end; k++){
                    System.out.print(arr[k] + " ");
                   
                }
                System.out.println();
                
            } 
            System.out.println();
           
           }
    }
    public static void main(String[] args) {
       int arr[]= { 1,3,2,5,4,8};
       subpair(arr); 
    }
}

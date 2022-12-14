import java .util.Scanner;
public class Two_Dim_Array {
    public static int search(int matrix[][], int key){
        int count =0;
        for(int i =0 ; i< matrix.length; i++){
        
            // Second Loop for Column
            for(int j =0; j< matrix[0].length;j++){
                if(matrix[i][j] == key){
                  //  System.out.println(" Key found at index ("+ i + "," + j + ")");
                    count ++;
                    
                }
           }  
       } System.out.println(count);
        return count; 
    } 
    public static int sum(int arr[][]){

      int sum =0; //print sum of second row
      
        for( int j =0; j < arr[0].length; j++){
          sum+= arr[1][j];
        }
       System.out.println(sum);
      return sum;
    }
    public static void main(String[] args) {
      int matrix [][] = new int [3][3];
      int n = matrix.length; int m =matrix[0].length;
      Scanner sc = new Scanner(System.in);
      
      // frist loop for Rows
      for(int i =0 ; i< n; i++){
        
        // Second Loop for Column
        for(int j =0; j< m;j++){
            matrix [i][j] =sc.nextInt();
        }
      }
      // printing the 2 dim array
      for(int i =0 ; i< n; i++){

        for(int j =0; j< m;j++){
            System.out.print( matrix [i][j] + " ");
            
        }
        System.out.println();
      }
     // search(matrix, 7);
     sum(matrix);
    sc.close();
    }
}

public class Diagonal_Sum {
    public static int diagonalsum(int matrix [][]){
        int sum =0;
        // for(int i =0; i < matrix.length ;i++) // time complexcity is O(n**2) not an optimized code
           
        //     for(int j=0; j< matrix[0].length; j++){
               
        //         if(i == j){
        //             sum += matrix[i][j];
        //         }

        //         else if (i+j == matrix.length -1) {
        //             sum += matrix[i][j];
        //         }
        //     }
            
        // }
            for(int i =0 ; i< matrix.length; i++){ // Linear time complexity which is an optimized code
                //primary daigonal
                sum+= matrix[i][i];

                // secondary diagonal
                if(i != matrix.length -1 -i) // this condition is for Overlapping part
                    sum+= matrix[i][matrix.length -1 -i];
                
            }

        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = { {1,2,3,4} ,
                        {5,6,7,8} ,
                         {9,10,11,12},
                           {13,14,15,16}};
    System.out.println(diagonalsum(matrix));    
    
    }
}

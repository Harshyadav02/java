public class RainTraping_Water { // Time complexity O(n) 

    public static int collector(int height []){
        
        // RightMax
        int rightMax [] = new int [height.length]; // helping array 
        
        rightMax[height.length -1] = height[height.length -1];
        
        for(int i= height.length -2; i>=0; i--){
            
            rightMax[i] = Math.max(rightMax[i +1],height[i]);
        }
       
       
        // leftMax
        int leftMax []= new int [height.length]; // helping array 
        
        leftMax [0] = height [0];
        
        for(int i =1; i< height.length; i++){
           
            leftMax [i] = Math.max(leftMax[i -1],height[i]); 
        }
        int  Trapped_Water =0;
        // min( RightMAx ,  LeftMAx)
        for(int i= 0; i< height.length ;i++){
            int minBuliding =Math.min(rightMax[i] , leftMax [i]);
        
            //Trapped Water
         Trapped_Water +=  minBuliding -height[i];
            
         }
       
       return Trapped_Water ;
    
    }
    public static void main(String[] args) {
        int height [] ={0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(collector(height));
    }
}

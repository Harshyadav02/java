// This method is also known as Kadnas Algorithm It is most important concept

public class MaxSum_I {
    public static int printMaxSum(int arr[]) {
        int sum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i =  0; i < arr.length ; i ++){
            if(sum < 0){
                return 0;
            } 
            sum = sum + arr[i];
            if(sum > maxsum ){
                maxsum = sum;
            }
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int arr []={1,2,-1,6,7};
        System.out.println(" Maximum sum of given array is = "+printMaxSum(arr));

    }
}

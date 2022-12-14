public class Recursion {
    public static void DecreasingOrder(int x){
        if (x== 1){
          System.out.println(x);
          return ;
        }
        DecreasingOrder(x-1);
        System.out.println(x);
        
    }

    public static int fact(int x) {
        
        if(x == 0){
            return 1;
        }
        x =x * fact(x -1);
        return  x;
    }
    public static int sum_Nat(int x) {
        
        if(x == 1){
            return 1;
        }
        int sum = sum_Nat(x -1);
        int sn = x+ sum;
        return sn;
    }

    public static int fabonacii(int x){

        if(x == 0  || x == 1){
            return x;
        }
        
        int fabnm1 = fabonacii(x -1 );
        int fabnm2 = fabonacii(x -2 );
        int fbn = fabnm1 + fabnm2;
        return fbn;
    }
    public static int firstOccr(int arr[], int key , int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccr(arr, key, i+1);
    }
    public static int power(int x ,int y) {
        // time complexity is big O(n)
        // but this can be optimized and time complexity will be o(logn)
        if(y == 0 ){
            return 1;
        }
        
        return x * power(x, y-1);
    }
    public static int Optimized_power(int x ,int y) {
        
        if(y == 0 ){
            return 1;
        }
        int halfPower =  Optimized_power(x, y/2); // here the time complxity id O(logn)
        int halfpowerfun = halfPower * halfPower ;// optimized code s
        if( y %2 != 0){// for odd power
            halfpowerfun = x * halfpowerfun;
        }
        return halfpowerfun ;
    }

    public static void main(String[] args) {
       // int x [] = {2,4,6,8,4,8,9} ;
        //DecreasingOrder(x);
       // System.out.println( fact(x));
       //System.out.println(sum_Nat(x));
       //System.out.println(fabonacii(x));
        //System.out.println(firstOccr(x, 8, 0));
        //System.out.println(power(2,10));
        System.out.println(Optimized_power(2,10));


    }
}

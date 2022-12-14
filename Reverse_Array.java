
public class Reverse_Array {

    public static void  reverseArray(int number[]) {
        int temp;
        int last = number.length-1;
        int first=0;
        // for(int i=0; i<number.length-1; i++){
        //     temp = number[last];

        //     number[last] = number[i];

        //     number[i] = temp;
        //     last--;
        // }
       while(first < last){
        temp =  number[last];

        number[last] = number[first];

        number[first] = temp;

        last -- ;
        first ++ ;
       } 
    }
    public static void main(String[] args) {                                                                                    
        int num [] = {1,3,2,6,7,9,11};
        reverseArray(num);
        System.out.println("Reversed Array is ");
        for(int i=0; i<num.length; i++){
            System.out.print(num[i]+ " ");
        }
     System.out.println();
    }
}

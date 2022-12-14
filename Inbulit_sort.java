import java.util.Arrays;
import java.util.Collections;
public class Inbulit_sort {

    public static void printArr(Integer arr[]) {

        for(int i=0; i <arr.length; i++){
            System.out.print(arr [i] + " ");
        }
    }
    
    public static void main(String[] args) {
        Integer arr[]= {1,4,2,8,5};

        //ARRAYS IS A CLASS WHICH CONTAIN SORT METHOD
        Arrays.sort(arr); // time complexity is O(nLOGn) 
        
        // for an specific index
        Arrays.sort(arr,0,4);
        printArr(arr);

        // for reverse order import Collection Framework
        //this works on object type not on  premitive type
        Arrays.sort(arr,Collections.reverseOrder());
        printArr(arr);
    }
}

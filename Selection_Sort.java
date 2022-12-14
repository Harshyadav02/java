public class Selection_Sort {
    public static void selectionSort(int arr[]){
        for(int i = 0; i <= arr.length -2; i++){
                int miniPos = i; // manlo ki minimum elment i vala h
            for(int j =i+1 ;j <= arr.length -1 ; j++){
                if(arr[miniPos] > arr[j]){
                    miniPos = j;
                }
            }
             // swaping the elements
            int temp = arr[miniPos];
            arr[miniPos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int arr [] = {2,1,6,1,7};
        selectionSort(arr);
        for(int i= 0 ;i < arr.length ; i++){
            System.out.print(arr [i ]+ " ");
        }
    }
}

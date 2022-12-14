public class True_False {
    public static boolean checking(int arr[]) {
        for (int i = 0; i < arr.length; i++)
        { int curr =arr[i];
            for(int j=i+1; j < arr.length;j++){
                if( curr == arr[j]){
                    return true;
                }
                
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr []={1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(checking(arr));
    }
}

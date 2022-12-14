public class Arrays_pairs {

    public static void pair(int number[]) {
        for(int i = 0 ; i < number.length; i ++){
            int curr = number[i];
            for(int j = i+1; j < number.length; j ++){
                System.out.print("( "+ curr+ " " + number[j] + ")"+" ");
                
            }
            System.out.println();
           
        }
    }
    public static void main(String[] args) {
       int num []={1,2,3,4,5};
       pair(num);
    }
}

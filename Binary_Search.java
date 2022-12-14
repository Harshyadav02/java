// program for Binary Search

public class Binary_Search {
    public static  int FindEle(int number[], int key){
        int start=0;
        int end=number.length-1;
        while(start <= end){
           int mid=(start + end) / 2;
           
           if ( number[mid] == key) {
             return mid;
           }

           if(number [mid] < key){
               
               start=mid + 1;
            } else {
                end=mid-1;
            }
            
         }
        return -1;
    }
    public static void main(String[] args) {
        
      
        int arr[]={1};
        int key = 0;
        System.out.println("the index is "+ FindEle(arr, key));
    }
}
// Tim complexcity of this Algo is :- O(log(n))
/*
  we have iterate n time frist time and tookout the mid and compared with key 
  second time we had iterate n/2 time 
  third time we had iterated n/4 time
  .
  .
  .
  .
  As we will iterate n/2^k time =1
  take log and solve

 */
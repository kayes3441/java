public class BinarySeachPrac2 {
    public static int binary_search(int[]arr ,int x, int left , int right){
        
        if(left> right){
            return -1;
        }
        
        else {
            int mid = (left+right)/2;
            if(arr[mid] == x){
                return mid;
            }
            else if(arr[mid] < x){
                return binary_search(arr, x, mid+1, right);
            }
            else{
                return binary_search(arr, x, left, right-1);
            }
        }
      
    }
    public static void main(String[] args) {

        // array must be sorted ....
        








        
        int[]arr = {2,4,7,9,11,19,23,35,40};
        int x    = 19;
        int left = 0;
        int right=arr.length-1;


        System.out.println(x+" is in array "+binary_search(arr, x, left, right));
    }
}

/*
 * time complexity will be 
 * O(log(n)); because of you are find the mid array size become half...
 * 
 */

 /*
  * space complexity will be 
  * O(1); because of only an array ..
  */

public class LinearSearchPrac {
    public static int linear_search(int arr[],int x,int n){
        for(int i = 0 ; i<n ;i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[]arr = {10,2,43,50,100,102,20,32};
        int x    = 43;
        int n    = arr.length;

        System.out.println(x+" Is in array index "+linear_search(arr, x, n));
    }

    /*
     * Time complexity will be 
     *  O(n)
     * n time array will search ...
     */

     /*
      * Space complexity will be
      * O(1)
      * Taking only an array that why space complexity will be O(1);
      */
}

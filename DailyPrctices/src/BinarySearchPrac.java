public class BinarySearchPrac {
    public static int  binary_search(int[] arr,int x, int n){
        int left  = 0;
        int right = n-1;
        int mid;
        while(left <=right){
            mid = (left +right)/2;
            if(arr[mid] == x){
                return mid;
            }
            else if(arr[mid] > x){
                right = mid -1;
            }
            else{
                left = mid +1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2,5,9,11,17,19,24,39};
        int x     = 17;
        int n     = arr.length;

        System.out.println(x+"is in array "+binary_search(arr, x, n));

    }
}

public class Binary_search {
    public static int binary_search(int[]A,int x,int n){
       int left,right,mid;  
       left = 0;
       right = n-1;
       while(left<=right){
        mid = (left+right)/2;
        if(A[mid] == x){
            return mid;
        }
        else if(A[mid]<x){
            left = mid+1;
        }
        else{
            right = mid-1;
        }
       }
       return -1;
    }

    public static void main(String[] args) {
        int[] A = {2,3,5,10,26,30,33,50,100};
        int n = A.length;
        int x =33;
        System.out.println(x +" is found in "+binary_search(A,x,n));
    }
}

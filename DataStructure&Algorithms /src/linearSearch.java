import java.util.Scanner;

public class linearSearch {
    public static int linear_search(int[]A,int n){
        int i;
        for (i=0;i<A.length;i++){
            if(A[i]==n){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        
        int[] A = {10,20,21,40,101};
        int n = 101;
        System.out.println(n +"is found in "+linear_search(A,n));
       }
}

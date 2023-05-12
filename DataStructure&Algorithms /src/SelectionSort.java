public class SelectionSort {
    void Selection_sort(int []A ,int n){
        int i,j,index_min,temp;
        for(i = 0; i<n-1;i++){
            index_min = i;
            for(j = i+1 ;j<n;j++){
                if(A[j]<A[index_min]){
                    index_min = j;
                }
            }
            if(index_min !=i){
                temp = A[i];
                A[i] = A[index_min];
                A[index_min] = temp;


            }
        }

    }
    void printArr(int[]A){
        for(int i = 0; i<A.length;i++){
            System.out.print(A[i]+" ");
        }

    }
    public static void main(String[] args) {
        SelectionSort s = new SelectionSort();
        int[] A = {10,3,39,40,23};
        int n = A.length;
        s.Selection_sort(A,n);
        s.printArr(A);

    }
}

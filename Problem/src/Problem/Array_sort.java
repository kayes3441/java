package Problem;

import java.util.Arrays;

public class Array_sort {
    public static void main(String[] args) {
        int[]num ={11,90,-3,10,30,22};
        String[]names = {"kayes","sadi","hello","bello","cello"};
        Arrays.sort(num);
        Arrays.sort(names);

        System.out.print("Ascending Order :");
        for (int i=0;i<6;i++){
            System.out.print(" "+num[i]);
        }
        System.out.println();
        System.out.print("Descending Order :");
        for (int i=5;i>=0;i--){
            System.out.print(" "+num[i]);
        }
        System.out.println();
        System.out.print("Ascending Order :");
        for (int i=0;i<5;i++){
            System.out.print(" "+names[i]);
        }
        System.out.println();
        System.out.print("Descending Order :");
        for (int i=4;i>=0;i--){
            System.out.print(" "+names[i]);
        }
    }
}

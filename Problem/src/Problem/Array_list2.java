package Problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Array_list2 {
    public static void main(String[] args) {
        Scanner size_input = new Scanner(System.in);
        System.out.print("Enter the Size Of Array : ");
        int size_a = size_input.nextInt();
        ArrayList<Integer>number = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Numbers : " );
        for(int x=0;x<size_a;x++){
            number.add(sc.nextInt());
        }
        System.out.print(number);
        System.out.println();
        Collections.sort(number);
        System.out.print(number);
        Collections.sort(number,Collections.reverseOrder());
        System.out.println();
        System.out.print(number);
    }
}

package Problem;

import java.util.Scanner;

public class Series3 {
    public static void main(String[] args) {
        int n,sum=1;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Last Number : ");
        n = sc.nextInt();
        for(int i =1 ;i<=n ; i++){
            sum =sum*i;
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("the sum is :" +sum);
    }
}

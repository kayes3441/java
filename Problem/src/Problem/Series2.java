package Problem;

import java.util.Scanner;
//1^2+2^2+3^2+4^2+.......+n^2
public class Series2 {
    public static void main(String[] args) {
        int n;
        int sum =0;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the last number :");
        n =  sc.nextInt();
        for (int i =1 ; i<=n; i++){
            sum +=i*i;
            System.out.print(i +"x"+ i +" ");
        }
        System.out.println();
        System.out.println("The sum is : "+sum);
    }
}

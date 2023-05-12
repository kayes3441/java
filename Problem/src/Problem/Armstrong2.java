package Problem;

import java.util.Scanner;

public class Armstrong2 {
    public static void main(String[] args) {
        int m,n;
        Scanner sc_m = new Scanner(System.in);
        System.out.print("Enter Start Number : ");
        m = sc_m.nextInt();

        Scanner sc_n = new Scanner(System.in);
        System.out.print("Enter Last Number : ");
        n = sc_n.nextInt();

        int sum = 0 ;
        int rem ;
       for(int i= m;i<=n;i++){
        int temp=i;
        while(temp!=0){
            rem= temp%10;
            sum =sum+ rem*rem*rem;
            temp =temp/10;
            
        }
        if(sum == i){
            System.out.println(i+" Is Armstrong Number");
        }
        else
        // System.out.println(i+" Is Not Armstrong Number");
        sum = 0;
        
       }
        
    }
}

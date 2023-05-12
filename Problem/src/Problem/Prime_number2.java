package Problem;

import java.util.Scanner;

public class Prime_number2 {
    public static void main(String[] args) {
        int m,n;
        Scanner sc_m = new Scanner(System.in);
        System.out.print("Enter Start Number : ");
        m = sc_m.nextInt();
        
        Scanner sc_n = new Scanner(System.in);
        System.out.print("Enter Last number : ");
        n = sc_n.nextInt();
        int count =0;

        for (int i = m; i<=n ;i++){
            
           for (int j=2; j<=i-1;j++){
            if(i%j==0){
                count++;
                break;
            }
           }
         
         
          if (count == 0){
            System.out.print(i+" ");
          }
          count =0;
        }
       
        
    }
}

package Problem;

import java.util.Scanner;

public class Multiplication_table2 {
    public static void main(String[] args) {
        int m,n;
        Scanner sc_m = new Scanner(System.in);
        System.out.print("Enter Start Number : ");
        m = sc_m.nextInt();
        Scanner sc_n = new Scanner(System.in);
        System.out.print("Enter Last Number : ");
        n = sc_n.nextInt();

        for(int i =m ;i<=n ; i++){
            for(int j =1 ;j<=10;j++){
                System.out.println(i+"x"+j+"="+i*j);
            }
            System.out.println("-------------");
        }
    }
}

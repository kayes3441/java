package program;
import java.util.Scanner;
public class Multi_table2 {
	public static void  main(String args[]) {
		int num, end_num;
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter strat number:");
		num =sc.nextInt();
		Scanner sc_end_num = new Scanner (System.in);
		System.out.print("Enter End number:");
		end_num =sc_end_num.nextInt();
//		
//		for(int j=num;j<=end_num;j++) {
//			for (int i=1;i<=10;i++) {
//				System.out.println(j+"x"+i+"="+j*i);
//			}
//		}
		
		//using while loop
		
		
//		int i=num;
//		while(i<=end_num) {
//			int j=1;
//			while(j<=10) {
//				System.out.println(i+"X"+j+"="+i*j);
//				j++;
//			}
//			i++;
//		}
		
		int i=num;
		do {
			int j=1;
			do {
				System.out.println(i+"X"+j+"="+i*j);
				j++;
			}while(j<=10);
			i++;		
		}while(i<=end_num);
	}
}

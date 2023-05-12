package program;
import java.util.Scanner;
public class Multi_table {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner (System.in);
		num = sc.nextInt();
		
		for (int i=1;i<=20;i++) {
			int result =num * i;
			System.out.println(result);
		}
		
	}

}

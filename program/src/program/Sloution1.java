package program;
import java.util.Scanner;
public class Sloution1 {
	public static void main(String[] args) {
		int steps=0,num;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your Number:");
		num =sc.nextInt();
		
		while(num > 0) {
			if (num % 2 == 0){
				num /=2;
			}else {
				num--;
			}
			steps++;
		}
		System.out.println(steps);
	}
}

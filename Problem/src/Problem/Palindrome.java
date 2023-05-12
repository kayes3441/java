package Problem;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		// palindrome number
		int num,rem,sum =0 ;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		num = sc.nextInt();
		int temp = num;
		
		while(num>0) {
			rem = num % 10 ;
			sum = (num*10)+rem;
			num/=10;
		}
		
		if(temp == sum) {
			System.out.println(temp+" is Palindrome");
		}else
			System.out.println(temp+" is not Palindrome");
	}

}

package program;

import java.util.Scanner;

public class Vowel_check {
	public static void main(String args[]) {
		char ch;
		Scanner sc = new Scanner(System.in);
		ch =sc.next().charAt(0);
		switch(ch) {
		case 'a':
		case 'e':
		case 'o':
		case 'i':
		case 'u':
			System.out.println("This is vowel");
			break;
//		case 'e':
//			System.out.println("This is vowel");
//			break;
//		case 'i':
//			System.out.println("This is vowel");
//			break;
//		case 'o':
//			System.out.println("This is vowel");
//			break;
//		case 'u':
//			System.out.println("This is vowel");
//			break;
		default:
			System.out.println("This is Consonant");
				
				
		}
	}

}

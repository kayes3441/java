package program;

import java.util.ArrayList;

public class Array_list {
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<>();
		num.add(29);
		num.add(10);
		num.add(20);
		num.add(3, 30);
		
		
		System.out.println(num);
		
		
		//using for loop;
		for (int i = 0 ; i<num.size();i++) {
			System.out.println(num.get(i)+" ");
		}
	}
}

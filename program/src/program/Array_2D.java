package program;

public class Array_2D {

	public static void main(String[] args) {
		
		int[][]num = {{10,20,30},{40,50,60},{80,90,100}};
		
//		System.out.print(num.length);
		
		int sum = 0;
//		
		for(int i = 0  ; i < num.length; i++) {
			
			for (int j = 0; j<num[i].length; j++) {
				System.out.print(num[j][i]+" ");
//				System.out.println(j);
				sum += num[j][i];
			}
			System.out.println();
		}
		System.out.println("--------------");
		System.out.println(sum);
		
	}

}

package program;

public class Sum_array {
	public static void main(String[] args) {
		int[]num=new int[5];
		num[0] = 10;
		num[1] = 50;
		num[2] = 55;
		num[3] = 65;
		num[4] = 75;
		
		int sum = 0;
		
//		int len = num.length;
//		for(int i=0 ; i<len ;i++) {
//			sum +=num[i];
//		}
//		
//		System.out.print("The sum is :"+sum/len);
		
		for (int n:num) {
			sum+=n;
		}
		System.out.print("The sum is :"+sum/num.length);
	}

}

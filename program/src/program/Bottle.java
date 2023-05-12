package program;

 class bottle {
	 public static void main(String args[]) {
		 int num=99;
		 String word="bottles";
		 while(num>0) {
			 if (num==1) {
				 word="bottle";
			 }
			 System.out.println(num+""+word+"of beer on the wall");
			 System.out.println(num+""+word+ "of beer");
			 System.out.println("Take one down");
			 System.out.println("Pass it around");
			 num =num-1;
			 if(num>0) {
				 System.out.println(num+""+word+"of beer on the wall");
			 }
			 else
				 System.out.println("No"+" "+word+" "+"left");
		 }
	 }

}

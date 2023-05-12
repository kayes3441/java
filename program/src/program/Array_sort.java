package program;

import java.util.Arrays;

public class Array_sort {

	public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
           for(int j=i+1;j<nums.lengthk;j++){
               if(nums[i] + nums[j] == target){
                   return new int[]{i, j};
               } 
           }
        }
        return nums;
    }
// 	public static void main(String[] args) {
// 		int[] num= {10,90,30,40,50};
// 		Arrays.sort(num);
		
// 		for(int n:num) {
// 			System.out.print(" "+n);
// 		}
// 		for (int i=num.length-1 ; i>=0; i--) {
// 			System.out.print(" "+num[i]);
// 		}
		
		
// 		String[]name = {"Sadi","Kayes","Babu","Tabu"};
// 		Arrays.sort(name);
		
// 		for(String n:name) {
// 			System.out.print(" "+n);
// 		}
// //		
// 		for (int i=name.length-1 ; i>=0; i--) {
// 			System.out.print(" "+name[i]);
// 		}
// 	}
}

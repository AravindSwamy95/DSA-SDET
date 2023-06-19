package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class RemoveElement {
	
	@Test
	public void example1() {
		int nums[] = {3,2,2,3};
		int target = 3;
		removeElement1(nums, target);
	}
	
	@Test
	public void example2() {
		int nums[] = {0,1,2,2,3,0,4,2};
		int target = 2;
		removeElement1(nums, target);
	}
	private void removeElement(int [] nums, int target) {
		List<Integer> lst = new ArrayList<Integer>();
		 for(int i=0;i<nums.length;i++) {
			 if(nums[i]!=target) {
				 lst.add(nums[i]);
			
			 }
		 }
			 System.out.println(lst);/*///when list can be printed directly, why need to create output array
			 int output [] = new int[lst.size()];
			 for (int i = 0; i<lst.size();i++) {
				 output [i] = lst.get(i);
			 }
			 return output;
			 */
			 
		 }
	
	
	private void removeElement1(int [] nums, int target) {
		int left =0,right=0;
		/*
		for(int right=0; right<nums.length; right++) {
		if(nums[right]!=target) {
			nums[left]=nums[right];      
			left++;
		}
		}
		*/
		while(right<nums.length) {
			if(nums[right]!=target) {
				nums[left++]=nums[right];
			}
			right++;
		}
		
		int [] arr2 = Arrays.copyOf(nums, left);
		for (int i = 0; i < arr2.length; i++) {
	         System.out.println(arr2[i]);
			
		
	}
		
	}
}



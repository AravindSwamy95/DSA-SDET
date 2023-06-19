package DSA;

import org.junit.Test;

public class MissingNumber {
	
	
	//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.


	
	@Test
	public void example1() {
		int[] nums = {0,-1,2};
		System.out.println(missingNumber(nums));;
		       
	}
	@Test
	public void example2() {
		int[] nums = {0,1};
		System.out.println(missingNumber(nums));;
		       
	}
	@Test
	public void example3() {
		int[] nums = {3,0,1};
		System.out.println(    (nums));;
		       
	}
	public int missingNumber(int[] nums) {
		int max=nums[0],sum=0,sum1=0,min=0;
		for(int i=0;i<nums.length;i++) {
			sum=sum+nums[i];
			if(max <nums[i]) {
				max=nums[i];
			}
			else
				min=nums[i];
			
		}
	
		for(int i=min;i<=max;i++) {
				sum1=sum1+i;

		}
		//System.out.println(sum1);
		
		return sum1-sum;
		
		
	}

}

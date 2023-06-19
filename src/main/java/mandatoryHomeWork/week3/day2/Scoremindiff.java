package DSA;

import java.util.Arrays;

import org.junit.Test;

public class Scoremindiff {
	
	@Test
	public void test1() {
		int[] nums = {1,4,7,9};//1 4 7 9
		int k=2;
		System.out.println(minimumDifference(nums, k));
	}

	       
    public int minimumDifference(int[] nums, int k) {
		int left=0, right=0;int diff=0;int min=Integer.MAX_VALUE;
		Arrays.sort(nums);
		if(nums.length<k)
			throw new IllegalArgumentException("Invalid input");
			//return 0;
		while(left<=nums.length-k) {
			diff = nums[left+(k-1)]-nums[left];
		//	min=0;
			if(diff<min) {
				min = diff;
			}
			left++;
			right++;
		}
		return min;
	}
}

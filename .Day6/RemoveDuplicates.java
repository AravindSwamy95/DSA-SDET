package DSA;

import java.util.Arrays;

import org.junit.Test;

public class RemoveDuplicates {

	@Test
	public void example1() {
		int [] nums = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(removeDuplicates(nums))
		;
	}
	
	public int removeDuplicates(int[] nums) {
	    int n = nums.length;
	    if (n == 0) { // if the array is empty, there are no duplicates to remove
	        return 0;
	    }
	    int left = 0; 
	    int right = 1; 
	    while (right < n) { 
	        if (nums[left] == nums[right]) { 
	            right++; 
	        } else { 
	            left++; 
	            nums[left] = nums[right]; 
	            right++; 
	        }
	    }
	    int k = left + 1;

	    return k; 
	}

}

package DSA;

import org.junit.Test;

public class MaximumAverageSubArray {
	
	@Test
	public void test1() {
		int nums[] = {1,12,-5,-6,50,3};
		int k=4;
		System.out.println(findMaxAverage(nums, k));
	}

	@Test
	public void test2() {
		int nums[] = {5};
		int k=1;
		System.out.println(findMaxAverage(nums, k));
	}
	
    public double findMaxAverage(int[] nums, int k) {
    	int left=0, right=0, currentSum=0; double maxSum=0; double maxAvg=0;
    	
    	for(right=0;right<nums.length;right++) {
    		currentSum=currentSum+nums[right];
    		if(right-left+1==k) {
    			if(currentSum>maxSum) {
    				maxSum = currentSum;
    				 maxAvg = (maxSum)/k;
    			}
    			System.out.println(maxSum+""+maxAvg);
    			currentSum=currentSum-nums[left];
    					left++;
    		}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
    	}
    	
    	
		return maxAvg;

		
	}
}

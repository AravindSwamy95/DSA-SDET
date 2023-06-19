package DSA;

import org.junit.Test;

public class SearchInsertPosition {
	
	@Test
	public void test1() {
		int[] nums = {1,3,5,6};
		int target = 5;
		System.out.println(searchInsert(nums, target));
	}
	@Test
	public void test2() {
		int[] nums = {1,3,5,6};
		int target = 2;
		System.out.println(searchInsert(nums, target));
	}
	
	@Test
	public void test3() {
		int[] nums = {1,3,5,6};
		int target = 7;
		System.out.println(searchInsert(nums, target));
	}
	
	
    public int searchInsert(int[] nums, int target) {
    	int left=0, right = nums.length-1, mid;
   
    	
    	while(left<=right) {
    		mid = (left+right)/2;

    		if(nums[mid]==target) {
    			return mid;
    		}
    			else if(nums[mid]>target) {
    					right = mid-1;
    			}
    			else {
    				left = mid+1;
    			}
    		}
    	return left;
}
}

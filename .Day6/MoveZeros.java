package DSA;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class MoveZeros {

	@Test
	public void example1() {
		//int [] nums = {3,0,4,5,0,0,1};
//        moveZeros(nums);
        
	}
	
	@Test
	public void example2() {
		//int [] nums = {3,4,5,1};
       // moveZeros(nums);
        
	}
	
	public void example3() {
		int [] nums = {0,0,0,0};
        moveZeros(nums);
        
	}

	private void moveZeros(int [] nums) {
		// TODO Auto-generated method stub
		int left=0, right=0;
	
		
		while(right< nums.length) {
				if(nums[right]!=0) {
				int temp = nums[left];
				nums[left++]=nums[right];
				nums[right]=temp;
			}
				right++;
		}
		
		System.out.println(Arrays.toString(nums));
	}
}

	/*private void moveZeros(int [] nums) {
	int left=0, right=nums.length-1;


	
	while(left< right) {
			if(nums[left]==0 && nums[right]!=0) {
			int temp = nums[left];
			nums[left]=nums[right];
			nums[right--]=temp;
 		
	}
		left++;
	}
	System.out.println(Arrays.toString(nums));
	
}
}
*/
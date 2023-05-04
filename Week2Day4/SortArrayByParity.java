package DSA;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.junit.Test;

public class SortArrayByParity {
	/*
	 *  1) Did I understand the problem? Yes
	 *  
	 *Yes
	 * 
	 * 
	 * 2) Derive Test Data
	 * 
	 * --> Minimal 3 Test Data set
	 * --> Positive,Edge and Negative
	 * --> Valid with your interviewer
	 * 
	 * 3) Do I know how to solve this?
	 * 
	 * yes
	 *
	 *7) Start with Pseudo code
	 *
	 *1) Initialize two pointers left=0, right=0;
	 *2) Left is a slow pointer and right is fast pointer
	 *3) While loop will check if number in the array is even,swap number in the
	 *   right to number in the left and increase right and left for next numbers in the array
	 *4) if right indexed number is not even then move the pointer in else block
	 *5) return num array
	 *
	 *Time and Space Complexity : O(n) & O(1) or O(n)
	 *
	 *8) Implement the code
	 *yes done
	 *
	 *9) Test aagainst different test data set
	 *-->yes. done
	 *  
	 *  */
	@Test
	public void test1() {
		int [] nums = {2,4,6,1};
		System.out.println((Arrays.toString(sortArrayByParity(nums))));
	}
	@Test
	public void test2() {
		int [] nums = {0};
		System.out.println((Arrays.toString(sortArrayByParity(nums))));
	}
	@Test
	public void test3() {
		int [] nums = {1,3,5,7};
		System.out.println((Arrays.toString(sortArrayByParity(nums))));
	}
	
	
public int[] sortArrayByParity(int[] nums) {
int left=0, right=0;
boolean allOdd = true;
while(right<nums.length) {
	if(nums[right]%2==0) {
		int temp = nums[left];
		nums[left++]=nums[right];
		nums[right++]=temp;
		allOdd = false;
	}
	else {
		right++;
	}
}
if(allOdd) {
    System.out.println("All numbers in the input array are odd");
}

return nums ;
}
}

package DSA;

import java.util.Arrays;

import org.junit.Test;

public class PlusOne{

	@Test
public void test1() {
	int[] digits  = {4,3,2,9};
	
	int[] result = plusOne(digits);

	System.out.print(Arrays.toString(result));
	


	
	
}


	public int[] plusOne(int[] digits) {
	    for (int i = digits.length - 1; i >= 0; i--) {
	        digits[i]++;
	        
	        if (digits[i] < 10) {
	            return digits;
	        }

	        digits[i] = 0;
	    }
	    int[] result = new int[digits.length + 1];
	    result[0] = 1;
	    
	    return result;
	
	}
}


      
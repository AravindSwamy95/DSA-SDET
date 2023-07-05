package DSA;

import org.junit.Test;

public class LOveMysteryHackerank {
	
	@Test
	public void test1() {
		String s= "aabax";
		System.out.println(theLoveLetterMystery(s));
		
	}
	    public  int theLoveLetterMystery(String s) {
	        int operations = 0;
	        int left = 0;
	        int right = s.length() - 1;

	        while (left < right) {
	            operations = operations+ Math.abs(s.charAt(left) - s.charAt(right));
	            left++;
	            right--;
	        }

	        return operations;
	    }

}

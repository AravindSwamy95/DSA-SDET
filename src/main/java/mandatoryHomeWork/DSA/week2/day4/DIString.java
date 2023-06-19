package DSA;

import java.util.Arrays;

import org.junit.Test;

public class DIString {
	@Test
	public void example1() {
		String s = "IDID";
			System.out.println(Arrays.toString(diStringMatch(s)));
	}
	 public int[] diStringMatch(String s) {
       
		 
		 int n = s.length();
		 int left=0, right=n;
		 int output[] =  new int[n+1];
		 int i=0;
		 while(left<right) {
			 if(s.charAt(left) == 'I') {
				 output[i] = left++;
				 i++;
			 }
			 else {
				 output[i] = right--;
				 i++;
			 }
		 }
		 output[n] = left;
		return output;
}
}

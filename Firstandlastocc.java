package DSA;

import java.util.Arrays;

import org.junit.Test;

public class Firstandlastocc {

	@Test
	public void example1() {
		int[] input = {1,2,3,4,5,1};
		int number = 1;
		
	System.out.println(Arrays.toString(firstandlast(input, number)));
	
	}
	
	public int[] firstandlast(int[] input, int number) {
		int[] new1 = new int[input.length-2];
		if(input[input.length-input.length] == number && input[input.length-1] == number) {
		for(int i=1,j=0;i<input.length-1;i++) {
				new1[j++] = input[i];
			}
			
		return new1;
		}
		
		else {
			return input;
		}
	}
}

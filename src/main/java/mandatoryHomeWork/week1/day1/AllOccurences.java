package DSA;

import java.util.Arrays;

import org.junit.Test;

public class AllOccurences {

	@Test
	public void example1() {
		int[] input = {6,9,7,8,5};
		int indextoberemoved = 3;
		
	System.out.println(Arrays.toString(allOccurences(input, indextoberemoved)));
	
	}
	
	public int[] allOccurences(int[] input, int indextoberemoved) {
		
		int x= input[indextoberemoved];
		int count=0;
		for(int i=0,j=0;i<input.length;i++) {
			if(input[i]==x) {
				count++;
			}
		}
				int[] new1 = new int[input.length-count];
				if(input.length>=indextoberemoved) {
				for(int i=0,j=0;i<input.length;i++) {
				if(!(input[i]==x)) {
					new1[j++] =input[i];
				}
		}
				return new1;

	}
				else
					return input;
	}
	}

	

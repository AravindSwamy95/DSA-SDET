package DSA;

import javax.management.RuntimeErrorException;

import org.junit.Test;

public class MinimumRecolors {
	
	@Test
	public void test1() {
		String blocks = "WBBWWBBWBW"; int k=7;
		System.out.println(minimumRecolors(blocks, k));
		
	}

	
    public int minimumRecolors(String blocks, int k) {
    	int currentCount = 0, minCount=Integer.MAX_VALUE;
    	for(int i=0;i<=blocks.length()-k;i++) {
    		currentCount=0;
    		String s1 = blocks.substring(i, i + k);   
			for (int j=0;j<s1.length();j++) {
    		if(s1.charAt(j)=='W') {
    			currentCount++;
    		}
			}
    			if(currentCount<minCount) {
    				minCount=currentCount;
    						
    			}
    			}   
    	return minCount;
 
}
}

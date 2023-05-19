package DSA;

import java.util.Arrays;


import org.junit.Test;

public class SortPeople {
	@Test
	public void test1() {
		String[] names = {"Mary","John","Emma"}; int [] heights = {180,165,170};
		System.out.println(Arrays.toString(sortByHeight(names, heights)));
	}

	    public String[] sortByHeight(String[] names, int[] heights) {
	        int n = names.length;

	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (heights[j] < heights[j + 1]) {
	
	                    int tempHeight = heights[j];
	                    heights[j] = heights[j + 1];
	                    heights[j + 1] = tempHeight;

	                    String tempName = names[j];
	                    names[j] = names[j + 1];
	                    names[j + 1] = tempName;
	                }
	            }
	        }

	        return names;
	    }
}
	   
    

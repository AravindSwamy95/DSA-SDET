package DSA;

import java.util.Arrays;
import java.util.List;
import java.util.*;

import org.junit.Test;

public class MinimumAbsoluteDiff {
	
	@Test
	public void test1() {
		int[] arr = {1,3,6,10,15};
		minimumAbsDifference(arr);
	}

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
    	int minDiff =Integer.MAX_VALUE;
    	Arrays.sort(arr);
    	int left=0;
    	List<List<Integer>> result = new ArrayList<>();
    	for(int right=1;right<=arr.length-1;right++) {
    		int diff = arr[right]-arr[right-1];
    		if(diff<minDiff) {
    			minDiff = diff;
    			result.clear();
    			result.add(Arrays.asList(arr[right - 1], arr[right]));
    		}
    		else if (diff == minDiff) {
                result.add(Arrays.asList(arr[right - 1], arr[right]));
            }
    		diff = diff-arr[left++];
    	
    	}
		return result;
    	
    	
    }

}

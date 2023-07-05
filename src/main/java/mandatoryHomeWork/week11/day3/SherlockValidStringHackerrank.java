package DSA;
import java.util.*;

import org.junit.Test;

public class SherlockValidStringHackerrank {
	@Test
	public void test1() {
		
		String s = "aabbccddeefghi";
		System.out.println(isValid(s));
		
	}
	@Test
	public void test2() {
		
		String s = "aabbcd";
		System.out.println(isValid(s));
		
	}
	@Test
	public void test3() {
		
		String s = "abc";
		System.out.println(isValid(s));
		
	}
    public static String isValid(String s) {

    	HashMap<Character, Integer> hm = new HashMap<>();
    	for(int i=0;i<s.length();i++) {
    		char c = s.charAt(i);
    		hm.put(c, hm.getOrDefault(c, 0)+1);
    	}
    	
    	
    	int[] arr = new int[hm.size()];
    	int idx=0;
    	for(Map.Entry<Character, Integer> hm1 : hm.entrySet()) {
    	arr[idx++] = hm1.getValue();
    	
    	}
    	Arrays.sort(arr);
    	if(hm.size()==1)
    		return "Yes";
    	
    	int first = arr[0];
    	int second=arr[1];
    	int secondlast=arr[arr.length-2];
    	int last = arr[arr.length-1];
    	
    	if(first==last)
    		return "Yes";
    	if(first==1 && second==last)
    		return "Yes";
    	if(first==second && second==secondlast && secondlast==(last-1))
    		return "Yes";
    	
    		return "No";
    	
}
}
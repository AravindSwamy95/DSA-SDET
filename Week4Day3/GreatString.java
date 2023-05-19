package DSA;
import org.junit.Test;

import java.util.Stack;

public class GreatString {
	

	public class GoodString {
	    
	    @Test
	    public void example1() {
	        String s = "leEeetcode";
	        System.out.println(makeGood(s)); // Output: "leetcode"
	    }
	    
	    @Test
	    public void example2() {
	        String s = "abBAcC";
	        System.out.println(makeGood(s)); // Output: ""
	    }
	    
	    @Test
	    public void example3() {
	        String s = "s";
	        System.out.println(makeGood(s)); // Output: "s"
	    }
	    
	    public String makeGood(String s) {
	        Stack<Character> stack = new Stack<>();

	        for (char ch : s.toCharArray()) {
	            if (!stack.isEmpty() && Math.abs(stack.peek() - ch) == 32) {
	                stack.pop();
	            } else {
	                stack.push(ch);
	            }
	        }

	        StringBuilder result = new StringBuilder();
	        while (!stack.isEmpty()) {
	            result.append(stack.pop());
	        }

	        return result.reverse().toString();
	    }
	}


}

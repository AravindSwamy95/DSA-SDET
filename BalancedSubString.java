package DSA;

import org.junit.Test;
import java.util.Stack;

public class BalancedSubString {
	@Test
	public void test1() {
		String s ="RLRLRLRL";
		System.out.println(balancedStringSplit(s));
	}
	    public int balancedStringSplit(String s) {
	    	Stack<Character> stack = new Stack<Character>();
	    	int count =0;
	    
	      for(char c : s.toCharArray()) {
	    	  if(stack.isEmpty()) {
	    		  stack.push(c);
	    	  }
	    	  else {
	    		 if(stack.peek() == c) {
	    			 stack.push(c);
	    		 }
	    		 else {
	    			 stack.pop();
	    			 if(stack.isEmpty()) {
	    				 count++;
	    			 }
	    		 }
	    	  }
	      }
		return count;
	    }
}
	     

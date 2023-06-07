package DSA;
import java.util.Collections;
import java.util.Stack;

import org.junit.Test;

public class Defangingipaddress {
	@Test
	public void test1() {
		String address = "1.1.1.1";
		System.out.println(defangIPaddr(address));
		
	}
	@Test
	public void test2() {
		String address = "255.100.50.0";
		System.out.println(defangIPaddr(address));
		
	}
	@Test
	public void test3() {
		String address = "0.150.50..1";
		System.out.println(defangIPaddr(address));
		
	}

	 public String defangIPaddr(String address) {
		 Stack<Character> stack = new Stack<>();
		 for(int i=address.length()-1;i>=0;i--) {
			 if(address.charAt(i) == '.') {
				 stack.push(']');
				 stack.push('.');
				 stack.push('[');
			 }
			 else {
				
				 stack.push(address.charAt(i));
				 
			 }
		 }
		 StringBuffer defanged = new StringBuffer();
		 while(!stack.isEmpty()) {
			 defanged.append(stack.pop());
		 }
		return defanged.toString();
		 
	 }
	}


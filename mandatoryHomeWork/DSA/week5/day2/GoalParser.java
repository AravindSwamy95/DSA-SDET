package DSA;

import org.junit.Test;

import java.util.Stack;

public class GoalParser {
	@Test
	public void tes1() {
		String command = "G()(al)";
		System.out.println(interpret(command));
	}

	    public static String   interpret(String command) {
	        Stack<Character> stack = new Stack<>();
	        StringBuilder interpreted = new StringBuilder();

	        for (char c : command.toCharArray()) {
	            if (c == 'G') {
	                interpreted.append(c);
	            } else if (c == ')') {
	                if (stack.peek() == '(') {
	                    interpreted.append('o');
	                    stack.pop();
	                } else {
	                    StringBuilder sb = new StringBuilder();
	                    while (stack.peek() != '(') {
	                        sb.append(stack.pop());
	                    }
	                    sb.reverse();
	                    interpreted.append(sb);
	                    stack.pop();
	                }
	            } else {
	                stack.push(c);
	            }
	        }

	        return interpreted.toString();
	    }
	}
// Time and Space Complexity:O(n2),O(1)
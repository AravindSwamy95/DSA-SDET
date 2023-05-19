package DSA;
import org.junit.Test;
import java.util.Stack;

	public class BaseballGame {

	    // Time complexity: O(n), where n is the length of the array
	    // Space complexity: O(n)
	    public int calPoints(String[] ops) {
	        Stack<Integer> stack = new Stack<>();

	        for (String op : ops) {
	            if (op.equals("+")) {
	                int top = stack.pop();
	                int newTop = top + stack.peek();
	                stack.push(top);
	                stack.push(newTop);
	            } else if (op.equals("D")) {
	                stack.push(2 * stack.peek());
	            } else if (op.equals("C")) {
	                stack.pop();
	            } else {
	                stack.push(Integer.parseInt(op));
	            }
	        }

	        int sum = 0;
	        for (int score : stack) {
	            sum += score;
	        }

	        return sum;
	    }

	    @Test
	    public void example1() {
	        String[] ops = {"5", "2", "C", "D", "+"};
	        System.out.println(calPoints(ops)); // Output: 30
	    }

	    @Test
	    public void example2() {
	        String[] ops = {"5", "-2", "4", "C", "D", "9", "+", "+"};
	        System.out.println(calPoints(ops)); // Output: 27
	    }

	    @Test
	    public void example3() {
	        String[] ops = {"1", "C"};
	        System.out.println(calPoints(ops)); // Output: 0
	    }

	}



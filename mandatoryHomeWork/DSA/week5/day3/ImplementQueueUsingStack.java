package DSA;


import java.util.Stack;

public class ImplementQueueUsingStack {
	

	    private Stack<Integer> stack1; // Stack for enqueue operation
	    private Stack<Integer> stack2; // Stack for dequeue operation

	    public ImplementQueueUsingStack() {
	        stack1 = new Stack<>();
	        stack2 = new Stack<>();
	    }

	   
	    public void push(int x) {
	        stack1.push(x);
	    }

	    public int pop() {
	        if (stack2.isEmpty()) {
	            // Move elements from stack1 to stack2 in reverse order
	            while (!stack1.isEmpty()) {
	                stack2.push(stack1.pop());
	            }
	        }
	        return stack2.pop();
	    }

	
	    public int peek() {
	        if (stack2.isEmpty()) {
	            // Move elements from stack1 to stack2 in reverse order
	            while (!stack1.isEmpty()) {
	                stack2.push(stack1.pop());
	            }
	        }
	        return stack2.peek();
	    }

	   
	    public boolean empty() {
	        return stack1.isEmpty() && stack2.isEmpty();
	    }
	}




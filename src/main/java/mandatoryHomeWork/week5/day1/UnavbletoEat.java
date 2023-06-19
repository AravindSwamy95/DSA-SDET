package DSA;

import java.util.Stack;

import org.junit.Test;
public class UnavbletoEat {

@Test
public void test1() {
	int[] students = {1,1,0,0}; int[] sandwiches = {0,1,0,1};
	System.out.println(countStudents(students, sandwiches));
	
} 

public static int countStudents(int[] students, int[] sandwiches) {
    Stack<Integer> stack = new Stack<>();
    int n = students.length;


    for (int i = sandwiches.length - 1; i >= 0; i--) {
        stack.push(sandwiches[i]);
    }

    int unableToEat = 0;

    for (int student : students) {
        if (stack.isEmpty()) {
          
            unableToEat++;
            continue;
        }

        boolean foundMatch = false;
        Stack<Integer> tempStack = new Stack<>();

       
        while (!stack.isEmpty()) {
            int topSandwich = stack.peek();
            if (topSandwich == student) {
                stack.pop(); 
                foundMatch = true;
                break;
            }
            tempStack.push(stack.pop());
        }

        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }

        if (!foundMatch) {
            
            unableToEat++;
        }
    }

    return unableToEat;
}
}

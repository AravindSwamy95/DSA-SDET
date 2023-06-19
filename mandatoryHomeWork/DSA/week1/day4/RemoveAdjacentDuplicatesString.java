package DSA;
import org.junit.Test;
import java.util.Stack;
       

public class RemoveAdjacentDuplicatesString {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.reverse().toString();
    }

    public static class TestSolution {
        @Test
        public void example1() {
            String s = "abbaca";
            String result = new RemoveAdjacentDuplicatesString().removeDuplicates(s);
            System.out.println(result); // Output: "ca"
        }

        @Test
        public void example2() {
            String s = "azxxzy";
            String result = new RemoveAdjacentDuplicatesString().removeDuplicates(s);
            System.out.println(result); // Output: "ay"
        }
    }
}

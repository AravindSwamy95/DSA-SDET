package DSA;
import java.util.Stack;

public class SpecialpositionsBinaryMatrix {
//time complexity O(n^2), and the space complexity is O(n)
    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";
        System.out.println(backspaceCompare(s, t));
        
        s = "ab##";
        t = "c#d#";
        System.out.println(backspaceCompare(s, t)); 
        
        s = "a#c";
        t = "b";
        System.out.println(backspaceCompare(s, t)); 
    }
    
    public static boolean backspaceCompare(String s, String t) {
        return buildString(s).equals(buildString(t));
    }

    private static String buildString(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '#') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop());
        }

        return sb.toString();
    }
}




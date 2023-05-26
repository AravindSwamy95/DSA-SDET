package DSA;
import org.junit.Test;

public class SmallestNumberGreaterThanTarget {
	

	public class NextGreatestLetter {

	    // Time complexity: O(log n)
	    // Space complexity: O(1)
	    @Test
	    public void example1() {
	        char[] letters = {'c', 'f', 'j'};
	        char target = 'a';
	        System.out.println(nextGreatestLetter(letters, target));
	    }

	    @Test
	    public void example2() {
	        char[] letters = {'c', 'f', 'j'};
	        char target = 'c';
	        System.out.println(nextGreatestLetter(letters, target));
	    }

	    @Test
	    public void example3() {
	        char[] letters = {'x', 'x', 'y', 'y'};
	        char target = 'z';
	        System.out.println(nextGreatestLetter(letters, target));
	    }

	    public char nextGreatestLetter(char[] letters, char target) {
	        int left = 0;
	        int right = letters.length - 1;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            if (letters[mid] <= target) {
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }

	        return left < letters.length ? letters[left] : letters[0];
	    }
	}

}

package DSA;
import org.junit.Test;

public class XMatrix {
	
	//Time and Space Complexity :O(n) and O(1)
	
	 @Test
	    public void example1() {
	        int[][] grid = {{2, 0, 0, 1}, {0, 3, 1, 0}, {0, 5, 2, 0}, {4, 0, 0, 2}};
	        System.out.println(isXMatrix(grid)); 
	    }
	    
	    @Test
	    public void example2() {
	        int[][] grid = {{5, 7, 0}, {0, 3, 1}, {0, 5, 0}};
	        System.out.println(isXMatrix(grid)); 
	    }
	    
	    @Test
	    public void example3() {
	        int[][] grid = {{1}};
	        System.out.println(isXMatrix(grid)); 
	    }
	    
    public boolean isXMatrix(int[][] grid) {
        int n = grid.length;
        int left = 0; // Left pointer starting from the beginning of each row
        int right = n - 1; // Right pointer starting from the end of each row
        
        for (int i = 0; i < n; i++) {
            if (left == right) {
                if (grid[i][left] == 0) {
                    return false; // Diagonal element is zero
                }
            } else {
                if (grid[i][left] != 0 || grid[i][right] != 0) {
                    return false; // Non-diagonal element is non-zero
                }
            }
            
            left++; // Move the left pointer to the next element in the row
            right--; // Move the right pointer to the previous element in the row
        }
        
        return true;
    }
    
 
    }


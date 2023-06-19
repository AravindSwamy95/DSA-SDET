package DSA;
import org.junit.Test;


//Time and Space Complexity are O(n) and O(1)
public class MatrixDiagonalSum {
	
	  @Test
	    public void example1() {
	        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
	        System.out.println(diagonalSum(mat)); 
	    }
	    
	    @Test
	    public void example2() {
	        int[][] mat = {{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};
	        System.out.println(diagonalSum(mat)); 
	    }
	    
	    @Test
	    public void example3() {
	        int[][] mat = {{5}};
	        System.out.println(diagonalSum(mat)); 
	    }
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        int left = 0; // Left pointer starting from the beginning of each row
        int right = n - 1; // Right pointer starting from the end of each row
        
        for (int i = 0; i < n; i++) {
            sum += mat[i][left]; // Add the element pointed by the left pointer
            sum += mat[i][right]; // Add the element pointed by the right pointer
            
            left++; // Move the left pointer to the next element in the row
            right--; // Move the right pointer to the previous element in the row
        }
        
        // Subtract the duplicate element if the matrix has odd dimensions
        if (n % 2 == 1) {
            int mid = n / 2;
            sum -= mat[mid][mid];
        }
        
        return sum;
    }
    
   
    }


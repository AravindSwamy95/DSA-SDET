package DSA;


import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;


public class flippingImage {
	//TIme and Space Complexity : O(n2)
	
	    
	    @Test
	    public void test1() {
	        int[][] image = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
	        int[][] expected = {{1, 0, 0}, {0, 1, 0}, {1, 1, 1}};
	        assertArrayEquals(expected, flipAndInvertImage(image));
	    }
	    
	    @Test
	    public void test2() {
	        int[][] image = {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};
	        int[][] expected = {{1, 1, 0, 0}, {0, 1, 1, 0}, {0, 0, 0, 1}, {1, 0, 1, 0}};
	        assertArrayEquals(expected, flipAndInvertImage(image));
	    }
	    
	    public int[][] flipAndInvertImage(int[][] image) {
	        int n = image.length;
	        int[][] result = new int[n][n];
	        
	        for (int i = 0; i < n; i++) {
	            int[] reversedRow = reverseArray(image[i]);  // Reverse the current row
	            int[] invertedRow = invertArray(reversedRow);  // Invert the values
	            
	            result[i] = invertedRow;
	        }
	        
	        return result;
	    }
	    
	    private int[] reverseArray(int[] arr) {
	        int start = 0;
	        int end = arr.length - 1;
	        
	        while (start < end) {
	            int temp = arr[start];
	            arr[start] = arr[end];
	            arr[end] = temp;
	            
	            start++;
	            end--;
	        }
	        
	        return arr;
	    }
	    
	    private int[] invertArray(int[] arr) {
	        int[] inverted = new int[arr.length];
	        
	        for (int i = 0; i < arr.length; i++) {
	            inverted[i] = (arr[i] == 0) ? 1 : 0;
	        }
	        
	        return inverted;
	    }
	}




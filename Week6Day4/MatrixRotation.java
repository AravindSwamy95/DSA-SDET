package DSA;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;


public class MatrixRotation {
    //Time and SPace : O(n2)
    @Test
    public void test1() {
        int[][] mat = {{0, 1}, {1, 0}};
        int[][] target = {{1, 0}, {0, 1}};
        assertEquals(true, findRotation(mat, target));
    }
    
    @Test
    public void test2() {
        int[][] mat = {{0, 1}, {1, 1}};
        int[][] target = {{1, 0}, {0, 1}};
        assertEquals(false, findRotation(mat, target));
    }
    
    @Test
    public void test3() {
        int[][] mat = {{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        int[][] target = {{1, 1, 1}, {0, 1, 0}, {0, 0, 0}};
        assertEquals(true, findRotation(mat, target));
    }
    
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
      
        for (int rotation = 0; rotation < 4; rotation++) {
            if (areMatricesEqual(mat, target))
                return true;
            
            mat = rotateMatrix(mat);
        }
        
        return false;
    }
    
    private boolean areMatricesEqual(int[][] mat1, int[][] mat2) {
        int n = mat1.length;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat1[i][j] != mat2[i][j])
                    return false;
            }
        }
        
        return true;
    }
    
    private int[][] rotateMatrix(int[][] mat) {
        int n = mat.length;
        int[][] rotated = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - 1 - i] = mat[i][j];
            }
        }
        
        return rotated;
    }
}



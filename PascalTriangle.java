package DSA;

import org.junit.Test;

public class PascalTriangle {

	/*
	 * * 
* * 
* * * 
* * * * 
* * * * * 
* * * * 
* * * 
* * 
* 
	 */
	@Test
	public void test1() {
		int rows  = 9;
		 pascal(rows);
		
	}
	
	
	    public void pascal(int rows){
	        int n = 5; 
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	        for (int i = n - 1; i >= 1; i--) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	    }
	}



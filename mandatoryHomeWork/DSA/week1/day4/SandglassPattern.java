package DSA;

import org.junit.Test;

public class SandglassPattern{

	@Test
public void test1() {
	int rows  = 5;
	 pyramid(rows);
	
}


		public void pyramid(int rows) {

			for (int i = rows-1; i >=0; i--) {
	            for (int j = 0; j < rows - i - 1; j++) {
	                System.out.print(" ");
	            }
	            for (int k = 0; k <= i; k++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < rows - i - 1; j++) {
		                System.out.print(" ");
		            }
		            for (int k = 0; k <= i; k++) {
		                System.out.print("* ");
		            }
		            System.out.println();
		        }
		    }
		}



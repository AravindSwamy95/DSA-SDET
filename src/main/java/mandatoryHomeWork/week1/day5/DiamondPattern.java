package DSA;

import org.junit.Test;

public class DiamondPattern{

	@Test
public void test1() {
	int rows  = 9;
	 pattern(rows);
	
}


		public void pattern(int rows) {

		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < rows - i - 1; j++) {
		                System.out.print(" ");
		            }
		            for (int k = 0; k <= i; k++) {
		                System.out.print("* ");
		            }
		            System.out.println();
		        }
		        for (int i = rows-3; i >=0; i--) {
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



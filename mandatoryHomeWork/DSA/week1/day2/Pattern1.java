package DSA;

import org.junit.Test;

public class Pattern1{

	@Test
public void test1() {
	int rows  = 5;
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
		    }
		}



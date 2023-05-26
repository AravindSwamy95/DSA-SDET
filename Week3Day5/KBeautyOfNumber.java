package DSA;
import org.junit.Test;

public class KBeautyOfNumber {
	



	    // Time complexity: O(n^2), where n is the length of num
	    // Space complexity: O(1)
		 @Test
		    public void example1() {
		        int num = 240;
		        int k = 2;
		        System.out.println(kBeauty(num, k)); // Output: 2
		    }

		    @Test
		    public void example2() {
		        int num = 430043;
		        int k = 2;
		        System.out.println(kBeauty(num, k)); // Output: 2
		    }
		    
	    public int kBeauty(int num, int k) {
	        String numStr = String.valueOf(num);
	        int count = 0;

	        for (int i = 0; i <= numStr.length() - k; i++) {
	            String substring = numStr.substring(i, i + k);
	            int subNum = Integer.parseInt(substring);
	            if (subNum != 0 && num % subNum == 0) {
	                count++;
	            }
	        }

	        return count;
	    }

	   
	}


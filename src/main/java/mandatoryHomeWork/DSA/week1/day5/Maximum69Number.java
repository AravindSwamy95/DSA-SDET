package DSA;

import java.util.Arrays;

import org.junit.Test;

public class Maximum69Number {

	@Test
	public void example1() {
		int num = 9669;
		System.out.println(maximum69Number(num));
	}
	@Test
	public void example2() {
		int num = 9999;
		System.out.println(maximum69Number(num));
	}
	@Test
	public void example3() {
		int num = 9996;
		System.out.println(maximum69Number(num));
	}
	
	
	public int maximum69Number (int num) {
		
       String s= String.valueOf(num);
       char[] digits = s.toCharArray();
       int count=0;
       for(int i=0;i<digits.length;i++) {
    	   if(Integer.parseInt(String.valueOf(digits[i]))==6 && count==0) {
    		  digits[i]=(char)57;;
    		   count++;
    	   }
    	   else 
    		   digits[i] = digits[i];
       }
		 
      int number = Integer.parseInt(new String(digits));
      return number;
    	   
       }
		
	}

	
	


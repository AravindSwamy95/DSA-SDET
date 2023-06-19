package DSA;

import org.junit.Test;

public class PowerofTwo {
	
@Test
	public void test1() {
	int n=-4;
	isPowerOfTwo(n);
	}

@Test
    public void test2() {
    int n=0;
    isPowerOfTwo(n);
    }


    @Test
    public void test3() {
   int n=1632;
    isPowerOfTwo(n);
    }      
	
	public boolean isPowerOfTwo(int n) {
   
    	if(n==1) {
    		System.out.println("Power of two");
    		return true;
    	}
    while(n>1 && n%2==0) {
    	n=n/2;
    	if(n==1) {
    	System.out.println("Power of two");
    	return true;
    	}
	
    		}
    System.out.println("Power of not two");
	return false;
		
     
}
}

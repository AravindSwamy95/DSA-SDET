package DSA;

import org.junit.Test;

public class numberOfMatches {
	
@Test
	public void example1() {
		int n=1;
	//	System.out.println(numberMacthes(n));
		
	}
@Test
    public void example2() {
	    int n=7;
	    System.out.println(numberMacthes(n));
	
    }
@Test
    public void example3() {
	    int n=14;
	//    System.out.println(numberMacthes(n));
	
    }
	public int numberMacthes(int n) {
		int Ematchesplayed = 0,Omatchesplayed = 0;
		if(n==1)
			return n;
		
		while(n>1) {
			if(n%2==0) {
				int Matches = n/2;
				 n = n/2;
				Ematchesplayed =Ematchesplayed+ Matches;
				
			}
			else {
				int Matches = (n-1)/2;
				 n = (n-1)/2+1;
				Omatchesplayed = Omatchesplayed+Matches;
			}
			
	}
		return Ematchesplayed+Omatchesplayed;
		
		
		
	 
}

}
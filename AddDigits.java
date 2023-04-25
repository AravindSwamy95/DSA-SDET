package DSA;

import org.junit.Test;

public class AddDigits {
	
	@Test
public void test1() {
		int num = 9999;
		System.out.println(addDigits(num));
	}
	
	public int addDigits(int num) {
		int num1,num2;
		
		if(num <=0) {
			throw new RuntimeException("Invalid number");
			
		}
		
		boolean flag=false;
	while(num>0) {
		if(num>9) {
		num1=num/10;
		num2=num%10;
		num = num1+num2;
		
		
		}
		else {
			return num;
		}
	}
	return num;

}
}

package DSA;

import org.junit.Test;

public class ReversePrefixOfWord {
@Test	
   public void test1() {
	        String word = "abcdefd"; 
			char ch = 'd';
			System.out.println(reversePrefix(word, ch));
    }
     @Test
    public void test2() {
	        String word = "xyxzxe"; 
			char ch = 'z';
			System.out.println(reversePrefix(word, ch));
    }
     @Test
    public void test3() {
	        String word = "abcd"; 
			char ch = 'z';
			System.out.println(reversePrefix(word, ch));
    }
     /*
 	 *  1) Did I understand the problem? Yes/No
 	 *  
 	 *  Yes
 	 * 
 	 * 2) Derive Test Data
 	 * 
 	 * --> Minimal 3 Test Data set
 	 * --> Positive,Edge and Negative
 	 * --> Valid with your interviewer
 	 * 
 	 * 3) Do I know how to solve this?
 	 * 
 	 * yes
 	 *
 	 *7) Start with Pseudo code
 	 *
 	 *1) Take the sub string of the given input string till given input character
 	 *2) Reverse that substring using two pointers
 	 *3) Add reversed sub string to remaining letter of the the given input string annd return them
 	 *
 	 *Time and Space Complexity : O(n)
 	 *
 	 *8) Implement the code
 	 *yes done
 	 *
 	 *9) Test aagainst different test data set
 	 *-->yes. done
 	 *  
 	 *  */
	
    public String reversePrefix(String word, char ch) {
    	


    	String result ="";
        int dindex = word.indexOf(ch);
    	String sub = word.substring(0, dindex+1);
    	char[] ch1 = sub.toCharArray();
    	int left=0, right=ch1.length-1;
    	while(left<right) {
    		char temp = ch1[left];
    		ch1[left++]= ch1[right];
    		ch1[right--] = temp;
    		
    	}
    	
    	result = String.valueOf(ch1)+word.substring(dindex+1, word.length());
		return result;

		
	}

}

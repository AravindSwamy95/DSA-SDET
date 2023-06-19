package DSA;

import org.junit.Test;

public class MergeStringsAlternatively {
	
	@Test
	public void test1() {
		String word1 = "abc"; String word2 = "pqrdef";
		
		System.out.println(mergeStringsAlternatively(word1, word2));
	}
	@Test
	public void test2() {
		String word1 = "abcdef"; String word2 = "pq";
		
		System.out.println(mergeStringsAlternatively(word1, word2));
	}
	@Test
	public void test3() {
		String word1 = "abcd"; String word2 = "pq";
		
		System.out.println(mergeStringsAlternatively(word1, word2));
	}

	/*
	 *  1) Did I understand the problem? Yes
	 *  
	 *  put letters of 1st word and 2nd word alterntively and extar letters either in word1 or word2 append them to new string
	 * 
	 * A) Ask for an example
	 * Input: s = "word1 = "abc", word2 = "pqr""
       Output: "apbqcr"
	 * 
	 * 2) Derive Test Data
	 * 
	 * Positive : s = Input: s = "word1 = "abc", word2 = "pqr""; Output: "apbqcr"
	 * Negativ : s = Input: s = "word1 = "abcdef", word2 = "pqr""; Output: "apbqcrdef"
	 * Negative:s is null string
	 * 
	 * 3) Do I know how to solve this?
	 * 
	 * Yes with brute force and two pointer approach
	 * 
	 
	 * 
	 * 5) Do I know alternate Solutions?
	 * 
	 * --> Yes, How many?
	 * --> No (It is okay to have one solution)
	 * 
	 * 6) If you know more than one?
	 * --> Explain the approaches
	 * --> What O notations (Space and TIme Complexity)
           Space and TIme Complexity : O(n)
	 * 
	 * Hint: Start small/ Brute force
	 * 
	 * --> Start with WOrst
	 * 
	 *--> Optimize
	 *--> This is my final optimized
	 *
	 *7) Start with Pseudo code
	 *
	 *--> Covert string to char array
	 *-->set two pointers at 0th index for thwo char arrays
	 *-->while loop until all elements are added to new empty string
	 *
	 *
	 *8) Implement the code
	 *
	 *--> Most of the interviewers --> Notepad/eclipse
	 *--> Keep talking while writing
	 *
	 *9) Test aagainst different test data set
	 *--> confirm it is working for each test data set
	 *  
	 *10) Debug them to Solve it
}
*/
	
	public String mergeStringsAlternatively(String word1, String words2) {
		int left=0,right=0;
		char [] ch1 = word1.toCharArray();
		char [] ch2= words2.toCharArray();
		//char [] ch = new char[word1.length()];
		String str="";
		while(left<ch1.length || right<ch2.length) {
		if(left<ch1.length) {
			str=str+ch1[left++];	
		}
		if(right<ch2.length) {
			str=str+ch2[right++];	
		}
		
		}
		return str;
		
	}
}
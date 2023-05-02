package DSA;

import org.junit.Test;

public class RevereseeachwordString {

		
		/*
		 *  1) Did I understand the problem? Yes
		 *  
		 *  Convert string to char array using split and traverse each word and reversse it
		 * 
		 * A) Ask for an example
		 * Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
		 * 
		 * 2) Derive Test Data
		 * 
		 * Positive : s = "Let's take LeetCode contest"
		 * Edge:s = s="Let's"
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
		 *--> Covert string to string array
		 *pick each sttring using for loop
		 *reverse each string by converting to chararray using two pointers
		 *append space in b/w
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
		*/
	
	@Test
	    public void example1() {
	    	String s = "Let's take LeetCode contest";
	    	System.out.println(reversewordString(s));
	    }
	@Test
    public void example2() {
    	String s = "Contest";
    	System.out.println(reversewordString(s));
    }
	@Test
    public void example3() {
    	String s = "";
    	System.out.println(reversewordString(s));
    }
		      
		public String reversewordString(String s) {              
			if (s == null || s.length() == 0)
			    System.out.println("This string is null or empty");
			String[] str = s.split(" ");
			String str1=" ";
			for(int i=0;i<str.length;i++) {
				char[] ch = str[i].toCharArray();
				int left=0, right=ch.length-1;
				while(left<right) {
					char temp = ch[left];
				    ch[left++] = ch[right];
				    ch[right--] = temp; 
				}
				str1 = String.valueOf(ch)+" "+str1;
				}
			
			return str1;
			}
				
			}
					
					
		
		
	
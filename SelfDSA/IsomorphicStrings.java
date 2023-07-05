package DSA;
import java.util.*;

import org.junit.Test;

public class IsomorphicStrings {
	@Test
	public void test1() {
		String s = "egg"; String t = "add";
		System.out.println(isIsomorphic(s, t));
	}
	@Test
	public void test2() {
		String s = "foo"; String t = "bar";
		System.out.println(isIsomorphic(s, t));
	}
	@Test
	public void test3() {
		String s = "paper"; String t = "title";
		System.out.println(isIsomorphic(s, t));
	}
    public boolean isIsomorphic(String s, String t) {
         
    	HashMap<Character, Character> hm1 = new HashMap<>();
    	HashMap<Character, Character> hm2 = new HashMap<>();
    	  
        HashMap<Character, Character> sToT = new HashMap<>();
        HashMap<Character, Character> tToS = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            
            // Check s to t mapping
            if (sToT.containsKey(charS)) {
                if (sToT.get(charS) != charT) {
                    return false;
                }
            } else {
                sToT.put(charS, charT);
            }
            
            // Check t to s mapping
            if (tToS.containsKey(charT)) {
                if (tToS.get(charT) != charS) {
                    return false;
                }
            } else {
                tToS.put(charT, charS);
            }
        }
        
        return true;
    }
}
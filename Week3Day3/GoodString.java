package DSA;
import java.util.*;

import org.junit.Test;
public class GoodString {

	@Test
	public void test1() {
	String s = "xyzzaz";
	System.out.println(countGoodSubstrings(s)) ;
}

	public int countGoodSubstrings(String s) {
		int count = 0;
		for (int i = 0; i < s.length()-2; i++) {
			Set<Character> hs = new HashSet<>();
			String s1 = s.substring(i, i + 3);//0 to 2
			for (char c : s1.toCharArray()) {
				if (!hs.add(c)) {
					break;
				}
			}
			if (hs.size() == 3) {
				count++;
			}

		}
		return count;
	}
}

/*
public int countGoodSubstrings(String s) {
int left = 0, right = 2, count = 0;/
while (right < s.length()) {
    if (s.charAt(right-2) != s.charAt(right-1) && s.charAt(right-1) != s.charAt(right) && s.charAt(right) != s.charAt(right-2)) {
        count++;
    }
    left++;
    right++;
}
return count;
}
*/
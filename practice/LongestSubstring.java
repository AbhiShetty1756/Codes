package practice;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
	public static String longestSubstring(String s) {
	    int n = s.length();
	    int left = 0;
	    int right = 0;
	    int maxLen = 0;
	    int startIndex = 0;
	    int endIndex = 0;
	    Set<Character> chars = new HashSet<>();

	    while (right < n) {
	        if (!chars.contains(s.charAt(right))) {
	            chars.add(s.charAt(right));
	            right++;
	            if (right - left > maxLen) {
	                maxLen = right - left;
	                startIndex = left;
	                endIndex = right;
	            }
	        } else {
	            chars.remove(s.charAt(left));
	            left++;
	        }
	    }
	    
	    return s.substring(startIndex, endIndex);
	}

	public static void main(String[] args) {

		System.out.println(longestSubstring("abcbcc"));
	}
}

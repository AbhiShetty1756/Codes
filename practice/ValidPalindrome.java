package practice;

public class ValidPalindrome {
	public static boolean isPalindrome(String s) {
		s = s.toLowerCase();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<s.length();i++) {
			char current = s.charAt(i);
			if(current>=97 && current<=122 || current>=48 && current <=57){
				sb.append(current);
			}
		}
		System.out.println(sb);
		
		int left =0,right= sb.length()-1;
		while(left<right) {
			if(sb.charAt(left)!=sb.charAt(right)) {
				System.out.println("hello");
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(isPalindrome("A man, a plan, a canal: Panam"));
	}
}

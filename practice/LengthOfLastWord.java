package practice;

public class LengthOfLastWord {
	public static int lengthOfLastWord(String s) {
		s=s.trim();
		String[] arr = s.split(" ");
		return arr[arr.length-1].length();
	}

	public static void main(String[] args) {
		String str = "how you doing ";
		System.out.println(lengthOfLastWord(str));
	}
}

package practice;

public class StringExamples {
	public static void main(String[] args) {
		String s1= "hello";
		String s2="hello";
		String s3 = new String("hello");
//		System.out.println(s1==s2);
//		System.out.println(s1==s3);
		String s4="meklo";
		String s5="hemlo";
//		System.out.println(s4.compareTo(s5));
//		System.out.println(s1.compareTo(s3));
//		System.out.println(s1.compareTo(s4));
//		System.out.println(s1.compareTo(s5));
//		System.out.println(s1.toUpperCase());
//		System.out.println(s1);
//		System.out.println(s1.endsWith("Lo"));
		String s6= "how are you?";
		System.out.println(" index of: "+s6.indexOf("are"));
		System.out.println(s6.charAt(0));
		String s7="java string split method";
		String[] words=s7.split("s");
		for(String w:words){
			System.out.println(w);
		}
		String s8=" hello string ";
		System.out.println(s8+"ABhi");//without trim()
		System.out.println(s8.trim()+"ABhi");//
	}
}

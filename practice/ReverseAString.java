package practice;

public class ReverseAString {
public static void main(String[] args) {
	String a = "Abhi";
	
	int index = a.length()-1;
	while(index>=0) {
		System.out.print(a.charAt(index));
		index--;
	}
	
	int num = 12345;
	int temp=0;
	
	while(num!=0) {
		temp=temp*10+num%10;
		num/=10;
	}
	System.out.println(temp);
}
}

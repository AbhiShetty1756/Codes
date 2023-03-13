package practice;

public class largestnumber {
public static void main(String[] args) {
	int a = 100,b=45,c=90;
	int max = a>b?(a>c?a:c):(b>c?b:c);
	System.out.println(max);
}
}

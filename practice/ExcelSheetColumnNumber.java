package practice;

public class ExcelSheetColumnNumber {
	public static int titleToNumber(String columnTitle) {
		int sum = 0;
		int index = columnTitle.length() - 1;
		for (int i=0; i<=index; i++) {
			System.out.println(sum);
			sum += Math.pow(26, (index-i)) * (columnTitle.charAt(i) -'A'+1);
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(titleToNumber("AB"));
	}
}

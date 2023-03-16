package practice;

public class ExcelSheetColumnTitle {
	public static String convertToTitle(int columnNumber) {
	    StringBuilder result = new StringBuilder();
	    while (columnNumber > 0) {
	        int remainder = (columnNumber - 1) % 26;
	        char c = (char) ('A' + remainder);
	        result.append(c);
	        columnNumber = (columnNumber - 1) / 26;
	    }
	    return result.reverse().toString();
	}

	public static void main(String[] args) {
		System.out.println(convertToTitle(701));
	}

}

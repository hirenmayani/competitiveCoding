package leetCode;

public class ZigZagConversion {
	public static void main(String[] args) {
		System.out.println(convert("PAYPALISHIRING", 3));
	}

	public static String convert(String s, int numRows) {
		StringBuilder ans = new StringBuilder();
		// int numCols = ;
		char[][] arr = new char[numRows][s.length()];

		int k = 0 ;
		while (k < s.length()) {
			for (int j = 0; j < numRows; j++) {
				if(k<s.length())
				arr[j][k] = s.charAt(k);
				k++;
			}
			for (int j = numRows-2; j > 0; j--) {
				if(k<s.length())
				arr[j][k] = s.charAt(k);
				k++;
			}
		}
		
			for (int j = 0; j < numRows; j++) {
				for (int i = 0; i < s.length() ; i++) {
					if(arr[j][i] != '\u0000')
						ans.append(arr[j][i]);
					
				}
		}
		return ans.toString();
	}
}

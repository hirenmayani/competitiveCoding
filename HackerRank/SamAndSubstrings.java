package HackerRank;

import java.math.BigInteger;
import java.util.Scanner;

public class SamAndSubstrings {
public static void main(String[] args) {
	Scanner  sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	String s = String.valueOf(n);
	int size = (int)Math.pow(2, s.length());
	int numFormed = 0;
	BigInteger ans = new BigInteger("0");
	
	for (int i = 1; i < size; i++) {
		numFormed = 0;
		String bin = Integer.toBinaryString(i);
		for (int j = bin.length()-1; j >= 0; j--) {
			if(bin.charAt(j) == '1')
			{
//				System.out.print(s.charAt(bin.length() - 1-j));
				numFormed*=10;
				numFormed  += Integer.parseInt(s.charAt(bin.length() - 1-j)+"");
				
			}
		}
		
		ans = ans.add(BigInteger.valueOf(numFormed));
		System.out.println(numFormed);
	}
	System.out.println(ans);
}
}

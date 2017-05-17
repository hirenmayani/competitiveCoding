package HackerRank;

public class SubSequences {
public static void main(String[] args) {
	String s = "abc";
	int size = (int)Math.pow(2, s.length());
	
	for (int i = 1; i < size; i++) {
		String bin = Integer.toBinaryString(i);
		for (int j = bin.length()-1; j >= 0; j--) {
			if(bin.charAt(j) == '1')
			{
				System.out.print(s.charAt(bin.length() - 1-j));
			}
		}
		System.out.println();
	}
}

}

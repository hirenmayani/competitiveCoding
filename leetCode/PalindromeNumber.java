package leetCode;

public class PalindromeNumber {
	public static void main(String[] args) {
		System.out.println(isPalindrome(-21412));
	}

	public static boolean isPalindrome(int x) {
		int y = 0;
		int len = (int) (Math.log10(x) + 1);
		if(x < 0)
		{
			x= x*-1;
		}

		int temp =x;
		for (int i = 0; i < len; i++) {
			y*=10;
			y += (temp%10);
			temp/=10;
		}

		if (x == y)
			return true;
		else
			return false;
	}
}

package HackerRank;
import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciModified {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t1 = sc.nextInt();
		int t2 = sc.nextInt();
		int n = sc.nextInt();
		
		BigInteger[] bigs =new BigInteger[n+1];
		bigs[1] = BigInteger.valueOf(t1);
		bigs[2] = BigInteger.valueOf(t2);
		
		for (int i = 3; i <= n; i++) {
			bigs[i] = bigs[i-2].add(bigs[i-1].multiply(bigs[i-1]));
		}
		
		System.out.println(bigs[n]);
	}
}

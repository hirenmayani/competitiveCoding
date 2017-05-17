package HackerRank;
import java.util.Scanner;

public class SherlockAndCost {
	static int  max = 0 ;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int testcases = sc.nextInt();
		for (int i = 0; i < testcases; i++) {
			int totalC = Integer.parseInt(sc.next());
			
			int[] b = new int[totalC];
			for (int j = 0; j < totalC; j++) {
				b[i] = sc.nextInt();
			}
			
			System.out.println(rec(b,1,0));
		}
	}
	
	public static int rec(int[] a,int val , int curr)
	{
		int ans = 0;
		if(a.length - 1 == curr)
		{
			return val;
		}
		for(int i=1 ;i<a[curr]+1; i++)
		{
			ans += rec(a, i, curr);
		}
		if(ans > max)
			return ans;
		else
			return max;
	}
}
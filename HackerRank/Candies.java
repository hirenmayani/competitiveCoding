package HackerRank;
import java.util.Scanner;

public class Candies {
	static int[] a ;
	static int[] ans ;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		a = new int[size];
		ans = new int[size];
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < ans.length; i++) {
			ans[i] = 1;
		}

		if(a[0] > a[1])
		{
			ans[0] = 2;
		}
//
//		if(a[size-1] > a[size-2])
//		{
//			ans[0] = 2;
//		}

//		for (int i = 0; i < a.length - 1; i++) {
//			if ( a[i] > a[i+1] && ans[i] == ans[i+1]) {
//				ans[i] += 1;
//			}
//		}
		forward();
		backward();
	
	
		int answ = 0;
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
			answ += ans[i];
		}
		System.out.println(answ);
		sc.close();
	}
	
	static int forward()
	{
		int noChanges = 0 ;
		
		for (int i = 1; i < a.length ; i++) {
			if (a[i] > a[i-1] && ans[i] <= ans[i-1]) {
				noChanges++;
				ans[i] = ans[i-1] +1;
			}
		}
		return noChanges;
	}	
	static int backward()
	{
		int noChanges = 0 ;
		
		for (int i =  a.length - 1; i > 0 ; i--) {
			if (a[i] < a[i-1] && ans[i] >= ans[i-1]) {
				noChanges++;
				ans[i-1] = ans[i] +1;
			}
		}
		return noChanges;
	}
}

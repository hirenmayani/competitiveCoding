package HackerRank;
	import java.util.Arrays;
	import java.util.Scanner;
	
	public class MaxSubArray {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int attempt = sc.nextInt();
	
			for (int i = 0; i < attempt; i++) {
				int size = sc.nextInt();
				int[] a = new int[size];
	
				for (int j = 0; j < size; j++) {
					a[j] = sc.nextInt();
				}
	
				System.out.print(C(a) + " ");
				System.out.println(nonC(a));
			}
			sc.close();
		}
	
		private static int nonC(int[] a) {
			int ans = 0;
	
			for (int i = 0; i < a.length; i++) {
				if (a[i] > 0)
					ans += a[i];
			}
			if (ans == 0) {
				Arrays.sort(a);
				ans = a[a.length - 1];
			}
			return ans;
		}
	
		private static int C(int[] a) {
			int ans = Integer.MIN_VALUE;
			int tempAns = Integer.MIN_VALUE;
			int intempAns = Integer.MIN_VALUE;
	
			for (int i = 0; i < a.length; i++) {
				tempAns = a[i];
				intempAns = a[i];
				for (int j = i + 1; j < a.length; j++) {
					tempAns += a[j];
					if (intempAns < tempAns) {
						intempAns = tempAns;
					}
				}
				if (intempAns > ans) {
					ans = intempAns;
				}
			}
	
			return ans;
		}
	
	}

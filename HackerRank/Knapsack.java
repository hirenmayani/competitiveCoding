package HackerRank;
import java.util.Arrays;
import java.util.Scanner;

public class Knapsack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i = 0; i < a; i++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] arr = new int[n];

			for (int j = 0; j < n; j++) {
				arr[j] = sc.nextInt();
			}

			Arrays.sort(arr);
			
			boolean[] toAns = new boolean[k + 1];

			if (k < arr[0]) {
				System.out.println("0");
				continue;
			}

			for (int j = 0; j < arr[0]; j++) {
				toAns[j] = false;
			}

			for (int ki = 0; ki < arr.length; ki++) {
				if(arr[ki] > k)
				{
					break;
				}
					toAns[arr[ki] ] = true;
				
			}
			int ans = arr[0];
			for (int j = arr[0]; j <= k; j++) {
				if (toAns[j] == true) {
					for (int ki = 0; ki < arr.length; ki++) {
						if (arr[ki] + j <= k) {
							toAns[arr[ki] + j] = true;
						} else {
							break;
						}
					}
					ans = j;
				}
			}
			System.out.println(ans);
		}
		sc.close();
	}
}

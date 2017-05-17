package HackerRank;

import java.util.Scanner;

public class MrKmarsh {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		boolean[][] land = new boolean[m][n];
		boolean[][] nland = new boolean[m][n];

		for (int i = 0; i < m; i++) {
			String line = sc.next();
			for (int j = 0; j < n; j++) {
				if (line.charAt(j) == '.')
					land[i][j] = true;
			}
		}

		int[][] up = new int[m + 1][n + 1];
		int[][] left = new int[m + 1][n + 1];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				nland[i][j] = land[i][j];
			}
		}

		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				nland[i][j] = land[i][j];
			}
		}

		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (!land[i-1][j-1]) {
					up[i][j] = 0;
				} else {
					up[i][j] = up[i - 1][j] + 1;
				}
			}
		}
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (!land[i-1][j-1]) {
					left[i][j] = 0;
				} else {
					left[i][j] = left[i][j-1] + 1;
				}
			}
		}

		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(left[i][j] +","+ up[i][j] + " ");
			}
			System.out.println();
		}
//		System.out.println("-----------------");
//		for (int i = 0; i <= m; i++) {
//			for (int j = 0; j <= n; j++) {
//				System.out.print((2*(left[i][j]-1) + 2*(up[i][j]-1)) + " ");
//			}
//			System.out.println();
//		}
		System.out.println("-----------------");

	}
	
}

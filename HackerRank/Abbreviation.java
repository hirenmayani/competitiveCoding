package HackerRank;

import java.util.Scanner;

public class Abbreviation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int testCs = sc.nextInt();
		for (int i = 0; i < testCs; i++) {
			String a = sc.next();
			String b = sc.next();

			// if (abbvRec(a, b)) {
			// System.out.println("YES");
			// } else {
			// System.out.println("NO");
			// }

			boolean[][] dp = new boolean[a.length() + 1][b.length() + 1];

			boolean gotCap = false;
			for (int j = 0; j < a.length(); j++) {

				if (!gotCap) {
					if (Character.isUpperCase(a.charAt(j))) {
						gotCap = true;
						dp[j + 1][0] = false;
					} else {
						dp[j + 1][0] = true;
					}
				} else {
					dp[j + 1][0] = false;
				}
			}

			for (int j = 0; j <= b.length(); j++) {
				dp[0][j] = false;
			}
			dp[0][0] = true;

//			for (int j = 0; j <= a.length(); j++) {
//				for (int j2 = 0; j2 <= b.length(); j2++) {
//					System.out.print(dp[j][j2] + " ");
//				}
//				System.out.println();
//			}

			for (int j = 1; j <= a.length(); j++) {
				for (int j2 = 1; j2 <= b.length(); j2++) {
					if (Character.isUpperCase(a.charAt(j-1))) {
						if (a.charAt(j-1) == b.charAt(j2-1)) {
							if(dp[j-1][j2-1])
							{
								dp[j][j2] = true;
							} else {
								dp[j][j2] = false;
							}
						} else {
							dp[j][j2] = false;
						}

					} else {
						if (Character.toUpperCase(a.charAt(j-1)) == b.charAt(j2-1)) {
							if(dp[j-1][j2-1] || dp[j-1][j2] )
							{
								dp[j][j2] = true;
							}else
							{
								dp[j][j2] = false;								
							}
							
						} else {
							dp[j][j2] = dp[j-1][j2];
						}
					}
				}
			}
			
			 if (dp[a.length()][b.length()]) {
			 System.out.println("YES");
			 } else {
			 System.out.println("NO");
			 }

//			 for (int j = 0; j <= a.length(); j++) {
//			 for (int j2 = 0; j2 <= b.length(); j2++) {
//			 System.out.print(dp[j][j2]+" ");
//			 }
//			 System.out.println();
//			 }

		}
	}

	static boolean abbvRec(String a, String b) {
		// System.out.println(a + " " + b);
		if (a.equals(b)) {
			return true;
		} else if (a.length() == 0 && b.length() == 0) {
			return true;
		} else if (b.length() == 0) {
			if (Character.isLowerCase(a.charAt(0))) {
				return abbvRec(a.substring(1), b);
			} else {
				return false;
			}
		} else if (a.length() == 0) {
			return false;
		} else {
			if (Character.isLowerCase(a.charAt(0))) {
				return abbvRec(a.substring(1), b) || abbvRec(Character.toUpperCase(a.charAt(0)) + a.substring(1), b);
			} else {
				if (a.charAt(0) == b.charAt(0))
					return abbvRec(a.substring(1), b.substring(1));
				else
					return false;
			}
		}
	}
}

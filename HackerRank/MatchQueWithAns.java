package HackerRank;
import java.util.Scanner;

public class MatchQueWithAns {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String para = sc.nextLine();
		String[] que = new String[5];

		for (int i = 0; i < 5; i++) {
			que[i] = sc.nextLine();
		}
		String[] ans = new String[5];

		ans = (sc.nextLine()).split(";");

		System.out.println(ans[0]);
		System.out.println(ans[0]);
		System.out.println(ans[0]);
		System.out.println(ans[0]);
		System.out.println(ans[0]);
	}
}

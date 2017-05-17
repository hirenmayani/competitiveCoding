package HackerRank;
import java.util.Scanner;

public class DOUGHNUT {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i = 0; i < a; i++) {
			int c = sc.nextInt();
			int k = sc.nextInt();
			int w = sc.nextInt();
			
			if (c * w <= k)
				System.out.println("yes");
			else
				System.out.println("no");
		}
		sc.close();
	}
}

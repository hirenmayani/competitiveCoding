package HackerRank;
import java.util.Scanner;

public class RstaurantRatings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int ins = sc.nextInt();
			if (ins == 0) {
				break;
			} else {
				int[] arr = new int[ins];
				for (int i = 0; i < ins; i++) {
					arr[i] = sc.nextInt();
				}
				
			}
		}
		sc.close();
	}
}

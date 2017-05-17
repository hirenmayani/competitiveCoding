package HackerRank;
import java.util.Scanner;

public class BotClean {
	static boolean reachedEnd = false;
	static boolean reachedStart = false;
	static boolean forward = true;
	static int lineCleaned = 0;

	static void next_move(int posr, int posc, String[] board) {

		if (!reachedStart) {
			if (posr != 0) {
				posr--;
				System.out.println("LEFT");
			} else if(posc != 0) {
				posc--;
				System.out.println("UP");
			}
			if (posr == 0 && posc == 0) {
				reachedStart = true;
			}
		}

		System.out.println(posr+" "+posc);
		if (board[posr].charAt(posc) == 'd') {
			System.out.println("CLEAN");
		} else {
			if (posr == board.length - 1 && forward) {
				posc += 1;
				forward = !(forward);
				lineCleaned++;
				System.out.println("DOWN");
			} else if (posr == 0 && !forward) {
				posc += 1;
				forward = !(forward);
				lineCleaned++;
				System.out.println("DOWN");
			} else {
				if (forward) {
					System.out.println("RIGHT");
					posr++;
				} else {
					System.out.println("LEFT");
					posr--;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] pos = new int[2];
		String board[] = new String[5];
		for (int i = 0; i < 2; i++)
			pos[i] = in.nextInt();
		for (int i = 0; i < 5; i++)
			board[i] = in.next();
		next_move(pos[0], pos[1], board);
		in.close();
	}
}

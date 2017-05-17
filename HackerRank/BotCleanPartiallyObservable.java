package HackerRank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BotCleanPartiallyObservable {
	static void next_move(int posr, int posc, String[] board) {
		List<Node4> dirtyNode4s = new ArrayList<Node4>();
		Node4 inVisible = null;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[i].charAt(j) == 'd') {
					dirtyNode4s.add(new Node4(i, j));
				} else if (board[i].charAt(j) == 'o') {
					inVisible = new Node4(i, j);
				}
			}
		}

		Node4 bot = new Node4(posr, posc);
		Node4 closestNode4 = null;
		for (Node4 Node4 : dirtyNode4s) {
			if (closestNode4 == null) {
				closestNode4 = Node4;
			} else if (bot.getD(closestNode4) > bot.getD(Node4)) {
				closestNode4 = Node4;
			}
		}

		if (closestNode4 != null) {
			if (closestNode4.x - bot.x > 0) {
				System.out.println("DOWN");
			} else if (closestNode4.x - bot.x < 0) {
				System.out.println("UP");
			} else if (closestNode4.y - bot.y > 0) {
				System.out.println("RIGHT");
			} else if (closestNode4.y - bot.y < 0) {
				System.out.println("LEFT");
			} else {
				System.out.println("CLEAN");
			}
		} else if (inVisible != null) {
			if (inVisible.x - bot.x > 0) {
				System.out.println("DOWN");
			} else if (inVisible.x - bot.x < 0) {
				System.out.println("UP");
			} else if (inVisible.y - bot.y > 0) {
				System.out.println("RIGHT");
			} else if (inVisible.y - bot.y < 0) {
				System.out.println("LEFT");
			} else {
				System.out.println("CLEAN");
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

class Node4 {
	int x;
	int y;

	public Node4(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getD(Node4 a) {
		return Math.abs(this.x - a.x) + Math.abs(this.y - a.y);
	}
}
package HackerRank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BotCleanStochastic {
	static void next_move(int posr, int posc, String[] board) {
		List<Node1> dirtyNode1s = new ArrayList<Node1>();
		;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[i].charAt(j) == 'd') {
					dirtyNode1s.add(new Node1(i, j));
				}
			}
		}

		Node1 bot = new Node1(posr, posc);
		Node1 closestNode1 = null;
		for (Node1 Node1 : dirtyNode1s) {
			if (closestNode1 == null) {
				closestNode1 = Node1;
			} else if (bot.getD(closestNode1) > bot.getD(Node1)) {
				closestNode1 = Node1;
			}
		}

		if (closestNode1 != null) {
			if (closestNode1.x - bot.x > 0) {
				System.out.println("DOWN");
			} else if (closestNode1.x - bot.x < 0) {
				System.out.println("UP");
			} else if (closestNode1.y - bot.y > 0) {
				System.out.println("RIGHT");
			} else if (closestNode1.y - bot.y < 0) {
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

class Node1 {
	int x;
	int y;

	public Node1(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getD(Node1 a) {
		return Math.abs(this.x - a.x) + Math.abs(this.y - a.y);
	}
}
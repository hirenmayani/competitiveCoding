package HackerRank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BotClean2 {
	static void next_move(int posr, int posc, String[] board) {
		List<Node> dirtyNodes = new ArrayList<Node>();
		;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[i].charAt(j) == 'd') {
					dirtyNodes.add(new Node(i, j));
				}
			}
		}

		Node bot = new Node(posr, posc);
		Node closestNode = null;
		for (Node node : dirtyNodes) {
			if (closestNode == null) {
				closestNode = node;
			} else if (bot.getD(closestNode) > bot.getD(node)) {
				closestNode = node;
			}
		}

		if (closestNode != null) {
			if (closestNode.x - bot.x > 0) {
				System.out.println("DOWN");
			} else if (closestNode.x - bot.x < 0) {
				System.out.println("UP");
			} else if (closestNode.y - bot.y > 0) {
				System.out.println("RIGHT");
			} else if (closestNode.y - bot.y < 0) {
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

class Node {
	int x;
	int y;

	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getD(Node a) {
		return Math.abs(this.x - a.x) + Math.abs(this.y - a.y);
	}
}
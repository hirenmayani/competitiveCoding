package HackerRank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BotCleanLarge {
	static void next_move(int posr, int posc,int h,int w, String[] board) {
		List<Node3> dirtyNode3s = new ArrayList<Node3>();
		
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (board[i].charAt(j) == 'd') {
					dirtyNode3s.add(new Node3(i, j));
				}
			}
		}

		Node3 bot = new Node3(posr, posc);
		Node3 closestNode3 = null;
		for (Node3 Node3 : dirtyNode3s) {
			if (closestNode3 == null) {
				closestNode3 = Node3;
			} else if (bot.getD(closestNode3) > bot.getD(Node3)) {
				closestNode3 = Node3;
			}
		}

		if (closestNode3 != null) {
			if (closestNode3.x - bot.x > 0) {
				System.out.println("DOWN");
			} else if (closestNode3.x - bot.x < 0) {
				System.out.println("UP");
			} else if (closestNode3.y - bot.y > 0) {
				System.out.println("RIGHT");
			} else if (closestNode3.y - bot.y < 0) {
				System.out.println("LEFT");
			} else {
				System.out.println("CLEAN");
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] pos = new int[2];
		int[] dim = new int[2];
		for (int i = 0; i < 2; i++)
			pos[i] = in.nextInt();
		for (int i = 0; i < 2; i++)
			dim[i] = in.nextInt();
		String board[] = new String[dim[0]];
		for (int i = 0; i < dim[0]; i++)
			board[i] = in.next();
		next_move(pos[0], pos[1], dim[0], dim[1], board);
		in.close();
	}
}

class Node3 {
	int x;
	int y;

	public Node3(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getD(Node3 a) {
		return Math.abs(this.x - a.x) + Math.abs(this.y - a.y);
	}
}
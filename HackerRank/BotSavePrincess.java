package HackerRank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BotSavePrincess {

	static void nextMove(int n, int r, int c, String[] grid) {
		int mx = r;
		int my = c;
		int py = 0, px = 0;

		for (int i = 1; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length() -1; j++) {
				if (grid[i].charAt(j) == 'p') {
					px = i;
					py = j;
				}
			}
		}

		px --;
		
		//py = grid.length - 1 - py;
		System.out.println("m "+mx+" "+my);
		System.out.println("p "+px+" "+py);
		
		System.out.println(Math.abs(mx - px));
		System.out.println(Math.abs(my - py));
		if (Math.abs(mx - px) < Math.abs(my - py)) {
			if (mx - px > 0) {
				System.out.println("RIGHT");
			} else {
				System.out.println("LEFT");
			}
		} else {
			if(my-py > 0)
			{
				System.out.println("UP");
			}else
			{
				System.out.println("DOWN");
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, r, c;
		n = in.nextInt();
		r = in.nextInt();
		c = in.nextInt();
		in.useDelimiter("\n");
		String grid[] = new String[n];

		for (int i = 0; i < n; i++) {
			grid[i] = in.next();
		}

		nextMove(n, r, c, grid);
		in.close();
	}
}

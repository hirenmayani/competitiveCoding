package leetCode;
/*
 * not giving correct ans. some problem in logic
 */
import java.util.HashSet;
import java.util.Set;

public class FriendCircles {
	public static void main(String[] args) {
//		int[][] a = { { 1, 1, 0 }, { 1, 1, 1 }, { 0, 1, 1 } };
//		int[][] a = { { 1, 1, 0 }, { 1, 1, 0 }, { 0, 0, 1 } };
		int[][] a= {{1,0,0,1},{0,1,1,0},{0,1,1,1},{1,0,1,1}};
		System.out.println(findCircleNum(a));
	}

	public static int findCircleNum(int[][] M) {
		int ans = 0;
		Set<String> d1 = new HashSet<String>();
		Set<String> d2 = new HashSet<String>();
		Set<String> d3 = new HashSet<String>();
		
		for (int i = 0; i < M.length; i++) {
			if(M[i][i]== 1)
				d1.add(i+"");
		}
		
		for (int i = 0; i < M.length; i++) {
			for (int j = i+1; j < M[i].length; j++) {
				if(M[i][j] == 0)
				{
					for (int j2 = 0; j2 < M.length; j2++) {
						if(M[i][j2] == 1 && M[j][j2] ==1)
						{
							d3.add(sorted(i,j,j2));
						}
					}
				}else
				{
					d2.add(sorted(i,j));
				}
			}
		}
		
		System.out.println("----------");
		String[] d1a = (String[]) d1.toArray(new String[d1.size()]);
		for (int i = 0; i < d1a.length;i++) {
			System.out.println(d1a[i]);
		}
		System.out.println("----------");
		String[] d2a = (String[]) d2.toArray(new String[d2.size()]);
		for (int i = 0; i < d2a.length;i++) {
			System.out.println(d2a[i]);
		}
		System.out.println("----------");
		String[] d3a = (String[]) d3.toArray(new String[d3.size()]);
		for (int i = 0; i < d3a.length;i++) {
			System.out.println(d3a[i]);
		}
		System.out.println("----------");
		ans = d1a.length+d2a.length+d3a.length;
		System.out.println(ans);

		for (int i = 0; i < d2a.length; i++) {
			for (int j = 0; j < d3a.length; j++) {
				if(d3a[j].contains(d2a[i]) && !d2a[i].equalsIgnoreCase(""))
				{	ans--;
					d2a[i] = "";
				}
			}
		}
System.out.println(ans);
		for (int i = 0; i < d1a.length; i++) {
			for (int j = 0; j < d3a.length; j++) {
				if(d3a[j].contains(d1a[i]) && !d1a[i].equalsIgnoreCase(""))
					{
					ans--;
					d1a[i] = "";
					}
			}
		}
		System.out.println(ans);

		for (int i = 0; i < d1a.length; i++) {
			for (int j = 0; j < d2a.length; j++) {
				if(d2a[j].contains(d1a[i]) && !d1a[i].equalsIgnoreCase(""))
				{
					d1a[i] = "";
					ans--;
				}
			}
		}

		return ans;
	}

	private static String sorted(int i, int j) {
		return "" + (i < j ? i + "" + j : j + "" + i);
	}

	private static String sorted(int a, int b, int c) {
		int min, max, med;// assume values are there for a b c
		if (a > b) {
			if (a > c) {
				max = a;
				if (b > c) {
					med = b;
					min = c;
				} else {
					med = c;
					min = b;
				}
			} else {
				med = a;
				max = c;
				min = b;
			}
		} else {
			if (b > c) {
				max = b;
				if (a > c) {
					med = a;
					min = c;
				} else {
					med = c;
					min = a;
				}
			} else {
				med = b;
				max = c;
				min = a;
			}
		}
		return min + "" + med + "" + max + "" + min + "" + max;
	}
}

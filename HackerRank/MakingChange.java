package HackerRank;
import java.util.Scanner;

public class MakingChange {
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	int totalAmount = sc.nextInt();
	int totalNum = sc.nextInt();
	int[] coins= new int[totalNum];

	for (int nu = 0; nu < totalNum; nu++) {
		coins[nu] = sc.nextInt();
	}
	
	int[] ways = new int[totalAmount + 1];
	
	for(int i=0;i<ways.length;i++)
	{
		ways[i] = Integer.MAX_VALUE - 1; 
	}
	for(int i=0;i<totalNum;i++)
	{
		ways[coins[i]] = 1 ; 
	}
	
	for (int i = 1; i<  ways.length;i++) {
		for (int j = 0; j < coins.length; j++) {
			
			int prevNum = i - coins[j];
			if(prevNum > 0 )
			{
					ways[i] = ways[prevNum] + 1 ;
			}
		}
	}

	for (int i = 0; i < ways.length; i++) {
		System.out.println(ways[i]);
		
	}
}

}

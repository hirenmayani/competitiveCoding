package HackerRank;
import java.util.Arrays;

public class SubSetSum {
	static int finalsum = 9; 
	
public static void main(String[] args) {
	int[] set =  {3, 34, 4, 12, 5, 2};	
	System.out.println(isSubSuum(set, finalsum));
}

public static boolean isSubSuum(int[] set,int sum)
{
	if(sum == 0)
	{
		return true;		
	}
	
	if(set.length <= 0)
		return false;
	
	if (sum < 0)
		return false;
	
	return isSubSuum(Arrays.copyOfRange(set, 0, set.length -1), sum - set[set.length - 1]) || isSubSuum(Arrays.copyOfRange(set, 0, set.length -1), sum);
			
	}

}

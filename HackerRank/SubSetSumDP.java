package HackerRank;
               public class SubSetSumDP {
	 
public static void main(String[] args) {
	int[] set =  {3, 34, 4, 12, 5, 2};
	int finalsum = 9;
	boolean[] arr = new boolean[10];
	
	for (int i = 0; i < set.length; i++) {
		if(set[i]<finalsum)
		{
			arr[set[i]] = true;
		}
	}
	
	for (int i = 0; i < arr.length; i++) {
	}
}	
} 


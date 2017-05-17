package leetCode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
public static void main(String[] args) {
	int[] arr =  {2, 7, 11, 15};
	int[] ans = twoSum( arr, 22);
	System.out.println(ans[0]+" "+ ans[1]);
}
public static int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> result = new HashMap<Integer, Integer>();
	int[] ans =  new int[2];
    for (int i = 0; i < nums.length; i++) {
		if(result.containsKey(target - nums[i]))
		{
			ans[1] = i;
			ans[0] =result.get(target - nums[i]);
			
			return ans;
		}
		result.put(nums[i], i );
	}
    return ans;
}
}

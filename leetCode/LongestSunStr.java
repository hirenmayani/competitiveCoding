package leetCode;

import java.util.HashSet;
import java.util.Set;

public class LongestSunStr {
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("a"));
	}
public static int lengthOfLongestSubstring(String s) {
    int ans = 0;
    int tempAns = 0 ;
    Set<Character> set = new HashSet<Character>();
    int i = 0;
    for(i=0;i<s.length();i++)
    {
    	tempAns = 0;
        for(int j=i;j<s.length();j++)
        {
	    	if(set.contains(s.charAt(j)))
	    	{
	    		if(ans < tempAns)
	    		{
	    			ans = tempAns;
	    		}
	    		set.clear();
	        	tempAns = 0;

	    		break;
	    	}else{
	    		set.add(s.charAt(j));
	    		tempAns++;
	    		if(j == s.length() - 1)
	    		{
	    			if(ans < tempAns)
		    		{
		    			ans = tempAns;
		    		}
		    		set.clear();
		        	tempAns = 0;

		    		break;
	    		}

	    	}
        }
    }
    return ans;
	
    }
}

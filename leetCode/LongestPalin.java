package leetCode;

import java.util.HashMap;
import java.util.Map;

public class LongestPalin {
	public static void main(String[] args) {
		System.out.println(longestPalindrome("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth"));
	}
public static String longestPalindrome(String s) {
        int maxLen = 0 ;
        String maxStr = "";
        Map<String, Boolean> dict = new HashMap<String, Boolean>();

        for(int i =s.length() - 1; i >= 0;i--)
        {
            for(int j =i; j>= 0;j--)
            {
            	//len
            	String subStr = s.substring(j, i+1);
            		if(subStr.length() > maxLen)
            		{
                    	if(isPalin(dict, subStr))
                    	{
            			maxLen = subStr.length();
            			maxStr = subStr;
                    	}
                    	
            	}
            }
            
        }
        return maxStr;
    }
	
	public static boolean isPalin(Map<String, Boolean> dict, String s)
	{
		if(dict.containsKey(s))
		{
			System.out.println("in");
			return dict.get(s);
		}else
		{
			int len = s.length();
			for (int i = 0; i < len / 2; i++) {
				if(s.charAt(i) != s.charAt(len-i-1))
				{
					dict.put(s, false);
					return false;
				}
			}			
		}
		dict.put(s, true);
		return true;
	}
	
	public static String longestPalindrome2(String s) {
        int maxLen = 0 ;
        String maxStr = "";
        Map<String, Boolean> dict = new HashMap<String, Boolean>();

        for(int i =s.length() - 1; i >= 0;i--)
        {
            for(int j =i; j>= 0;j--)
            {
            	//len
            	String subStr = s.substring(j, i+1);
            		if(subStr.length() > maxLen)
            		{
                    	if(isPalin(dict, subStr))
                    	{
            			maxLen = subStr.length();
            			maxStr = subStr;
                    	}
                    	
            	}
            }
            
        }
        return maxStr;
    }

}

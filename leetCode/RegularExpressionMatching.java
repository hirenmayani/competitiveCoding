package leetCode;

public class RegularExpressionMatching {
	public static void main(String[] args) {
		System.out.println(isMatch("bbbba", ".*a*a"));
	}

	public static boolean isMatch(String s, String p) {
		
		int j = 0;
		for (int i = 0; i < s.length(); i++) {
			if(j>= p.length())
				return false;
			if(p.charAt(j) == '.'){
				j++;				
			}
			else if(p.charAt(j) == '*')
			{
				char prevChar = p.charAt(j-1);
				int lenRemained = s.length() - i;
				System.out.println(lenRemained);
				
				for(int k = 0;k<=lenRemained;k++)
				{
					String repeated = new String(new char[k]).replace("\0", prevChar+"");
					System.out.println(repeated);
					String srcString = s.substring(i, s.length());
					String expString = repeated.concat(p.substring(j+1,p.length()));

					System.out.println(srcString+" "+expString);
					if(isMatch(srcString, expString))
						{
							return true;
						}
					else
					{
						if(k==lenRemained)
							return false;
						continue;
					}
					
				}
			}else
			{
				if(s.charAt(i) != p.charAt(j))
					{
					if(i<s.length()){
						if(j+1<p.length()){
							if(p.charAt(j+1)== '*')
							{
								System.out.println("here");
									String srcString = s.substring(i, s.length());
									String expString = p.substring(j+2,p.length());
	
									System.out.println(srcString+" "+expString);
									if(isMatch(srcString, expString))
										{
											return true;
										}
									else
									{
										return false;
									}
							}
						}
					}
						return false;
					}
				else{
					j++;
				}
			}
		}
		
		System.out.println(j+" "+p.length());
		if(j==p.length())
			return  true;
		else
		{
			boolean in = false;
			while(j+2<=p.length())
			{
				in = true;
				if(p.charAt(j+1)=='*')
				{
					j++;
					continue;
				}else
				{
					return false;
				}
			}
			if(in)
			{
				return true;
			}
			else
			return false;
		}
	}
}

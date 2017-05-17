package leetCode;

public class ReverseInteger {

	public static void main(String[] args) {
	System.out.println(reverse(1534236469));	
	}
	public static int reverse(int x) {
        long ans =0;  
        long temp;
        if(x<0)
        {
            temp = x*-1;
        	
        }
        else{
            temp = x;        	
        }
        
        while(temp > 0)
        {
        	ans*=10;
        	ans+=(temp%10);
        	temp=temp/10;
        }
        if(x<0)
        {
        	ans= ans*-1;
        	
        }
       	
        if(ans  > Integer.MAX_VALUE || ans < Integer.MIN_VALUE)
        	return 0;
        return (int)ans;
    }
}

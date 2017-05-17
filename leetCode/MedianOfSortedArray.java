package leetCode;

public class MedianOfSortedArray {
public static void main(String[] args) {
	int[] nums1 = {1, 2};
	int[]nums2 = {3,4};
	System.out.println(findMedianSortedArrays(nums1, nums2));
}
public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    double ans = 0;
    	
    int l1 = nums1.length;
    int l2 = nums2.length;
    int i1 = 0;
    int i2 = 0;
    int i= 0 ;
    int[] merged = new int[l1+l2];
    
    	while(i1 < l1 && i2 < l2 )
    	{
    		int n1 = nums1[i1];
    		int n2 = nums2[i2];
    		
    		if(n1 > n2)
    		{
    			merged[i] = n2;
    			i++;
    			i2++;
    		}
    		else if(n1 < n2)
    		{
    			merged[i] = n1;
    			i++;
    			i1++;
    		}
    		else
    		{
    			merged[i] = n1;
    			i++;
    			i1++;
    			
    			merged[i] = n2;
    			i++;
    			i2++;
    		}
    	}
		while(i1 < l1)
    	{
			merged[i] = nums1[i1];
			i++;
			i1++;
    	}
    	if(i2 < l2)
    	
    	while(i2 < l2)
    	{
			merged[i] = nums2[i2];
			i++;
			i2++;
    	}
    	
    	int l = merged.length;
    	if( l % 2 == 0)
    	{
    		double a1 = merged[l/2] + merged[l/2 - 1];
    		double a2 = 2.0;
    		ans = a1/a2;
    	}
    	else
    	{
    		ans =  merged[l/2] ;    		
    	}
	return ans;
}
}

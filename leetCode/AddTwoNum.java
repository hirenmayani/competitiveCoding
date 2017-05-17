package leetCode;

public class AddTwoNum {
public static void main(String[] args) {
	ListNode l1 = new ListNode(8);
	ListNode l2 = new ListNode(9);
	l1.next = l2;
	ListNode l3 = new ListNode(9);
	l2.next = l3;
//	ListNode l4 = new ListNode(9);
//	l3.next = l4;
	
	ListNode ll1 = new ListNode(2);
//	ListNode ll2 = new ListNode(6);
//	ll1.next = ll2;
//	ListNode ll3 = new ListNode(4);
//	ll2.next = ll3;

	//traverse(l1);
	traverse(addTwoNumbers(l1, ll1));
}

public static void traverse(ListNode l)
{
	ListNode currNode = l;
	while(currNode.next != null)
	{
		System.out.println(currNode.val);
		currNode = currNode.next;
	}
	System.out.println(currNode.val);
}

public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

	int val = l1.val+l2.val;
	int carry = 0;
	if(val > 9)
	{
		val = val%10;
		carry = 1;
	}
	ListNode ans  = new ListNode(val); 
	ListNode ansHead = ans;
	while(l1.next != null && l2.next != null)
	{
		l1 = l1.next;
		l2= l2.next;
		
		val = l1.val+l2.val + carry;
		carry = 0;
		if(val > 9)
		{
			val = val%10;
			carry = 1;
		}
		ListNode next = new ListNode(val);
		ans.next = next;
		
		ans = ans.next;
	}
	
	if(l1.next != null)
	{
		l1 = l1.next;
		val = carry + l1.val;
		carry = 0;
		if(val > 9)
		{
			val = val%10;
			carry = 1;
		}
		ListNode next = new ListNode(val);
		ans.next = next;
		while(l1.next != null)
		{
				ans = ans.next;

				l1 = l1.next;
				val = carry + l1.val;
				carry = 0;
				if(val > 9)
				{
					val = val%10;
					carry = 1;
				}
				next = new ListNode(val);
				ans.next = next;
			}
		
	}
	if(l2.next != null)
	{
		
		l2 = l2.next;
		val = carry + l2.val;
		carry = 0;
		if(val > 9)
		{
			val = val%10;
			carry = 1;
		}
		ListNode next = new ListNode(val);
		ans.next = next;
		while(l2.next != null)
		{
			ans = ans.next;
			l2 = l2.next;
			val = carry + l2.val;
			carry = 0;
			if(val > 9)
			{
				val = val%10;
				carry = 1;
			}
		 next = new ListNode(val);
			ans.next = next;
			}
		}
	
	if (carry == 1)
	{
		if(ans.next != null)
		{
			ans = ans.next;			
		}
		ListNode last = new ListNode (1);
		ans.next = last;
	}
	return ansHead;
    
}
public static class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
}

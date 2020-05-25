/*
给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
示例：
给定一个链表: 1->2->3->4->5, 和 n = 2.
当删除了倒数第二个节点后，链表变为 1->2->3->5.
说明：
给定的 n 保证是有效的
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode p=head,pre;
		ListNode q=new ListNode(0);
		q.next=head; 
		pre=q;
		while(n>0){
			p=p.next;
			n--;
		}

		while(p!=null){
			p=p.next;
			q=q.next;
		}
		ListNode tmp=q.next;
		if (tmp==null) {
			q.next=null;
		} else {
			q.next=tmp.next;
		}
		
		return pre.next;
	}
}
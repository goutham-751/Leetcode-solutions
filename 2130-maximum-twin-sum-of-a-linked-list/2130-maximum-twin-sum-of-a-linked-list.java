/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        int maxsum=0;
        if(head==null) return -1;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode fast=head.next;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode second=reverse(slow.next);
        ListNode first=head;
        while(second!=null){
            int sum=first.val+second.val;
            maxsum=Math.max(sum,maxsum);
            first=first.next;
            second=second.next;
        }
        return maxsum;
    }
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode forw=null;
        ListNode curr=head;
        while(curr!=null){
            forw=curr.next;
            curr.next=prev;
            prev=curr;
            curr=forw;
        }
        return prev;
    }
}
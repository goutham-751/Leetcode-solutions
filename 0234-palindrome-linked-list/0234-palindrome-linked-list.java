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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        ListNode fast=head;
        ListNode slow=head;
        //find the middle element
        while(fast!=null && fast.next!=null ){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode first=head;
        ListNode second=reverse(slow);
        while(first!=null && second!=null){
            if(first.val!=second.val) return false;
            first=first.next;
            second=second.next;
        }
        return true;
    }
    public ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        ListNode forw=null;
        while(curr!=null){
            forw=curr.next;
            curr.next=prev;
            prev=curr;
            curr=forw;
        }
        return prev;
    }
}
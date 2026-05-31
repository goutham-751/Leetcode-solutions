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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null ){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode first=head;
        ListNode second=slow.next;
        slow.next=null;//break the list
        first=sortList(first);
        second=sortList(second);
        return merge(first,second);

    }
    public ListNode merge(ListNode l1,ListNode l2){
        ListNode dummy=new ListNode(-1);
        ListNode current=dummy;
        while(l1!=null && l2!=null){
            if(l1.val>=l2.val){
                current.next=l2;
                l2=l2.next;
            }
            else{
                current.next=l1;
                l1=l1.next;
            }
            current=current.next;
        }
        if(l1!=null){
            current.next=l1;
        }
        else{
            current.next=l2;
        }
        return dummy.next;
    }
}
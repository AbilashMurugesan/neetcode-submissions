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
    public ListNode removeNthFromEnd(ListNode head, int tn) {
        int n=0;
        ListNode temp=head;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        int idx=n-tn;
        ListNode res=new ListNode(-1);
        ListNode prev=res;
        prev.next=head;
        int curIdx=0;
        while(head!=null && curIdx!=idx){
            curIdx++;
            prev=prev.next;
            head=head.next;
        }
        prev.next=prev.next.next;
        return res.next;
    }
}

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
    public void reorderList(ListNode head) {
        // ListNode head=head1;
        ListNode slow=head;
        // if(head.next==null){
        //     return ;
        // }
        ListNode fast=head;
        // System.out.println("loop");
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        // System.out.println(slow.val);
        ListNode temp1=null;
        ListNode newHead=slow.next;
        slow.next=null;

        while(newHead!=null){
            ListNode temp2=newHead.next;
            newHead.next=temp1;
            temp1=newHead;
            newHead=temp2;
        }
        ListNode temp2=new ListNode(-1);
        while(temp1 != null || head!=null){
            if(temp1 != null && head!=null){
                temp2.next=head;
                temp2=temp2.next;
                head=head.next;

                temp2.next=temp1;
                temp2=temp2.next;
                temp1=temp1.next;
            }
            while(head==null && temp1!=null){
                temp2.next=temp1;
                temp2=temp2.next;
                temp1=temp1.next;
            }
            while(head!=null && temp1==null){
                temp2.next=head;
                temp2=temp2.next;
                head=head.next;
            }
        }   
        head=temp2;
    }
}

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
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        ListNode head=new ListNode(-1);
        ListNode temp=head;
        while(A!=null || B!=null){
            // 1 2 3
            // 3 5
            if(A!=null && B!=null){
                if(A.val<B.val){
                    temp.next=A;
                    temp=temp.next;
                    A=A.next;
                }else{
                    temp.next=B;
                    temp=temp.next;
                    B=B.next;
                }
            }
            while(A!=null && B==null){
                temp.next=A;
                temp=temp.next;
                A=A.next;
            }
            while(B!=null && A==null){
                temp.next=B;
                temp=temp.next;
                B=B.next;
            }
        }
        return head.next;
    }
}
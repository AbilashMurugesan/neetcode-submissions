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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int buf=0;
        ListNode res=new ListNode(-1);
        ListNode temp=res;
        while(l1!=null || l2!=null){
            int a=0;
            if(l1!=null){
                a=l1.val;
                l1=l1.next;
            }
            int b=0;
            if(l2!=null){
                b=l2.val;
                l2=l2.next;
            }
            int add=a+b+buf;
            if(add>9){
                buf=1;
                add=add%10;
            }else{
                buf=0;
            }
            ListNode node=new ListNode(add);
            temp.next=node;
            temp=temp.next;
        }
        if(buf==1){
            ListNode node=new ListNode(1);
            temp.next=node;
        }
        return res.next;
    }
}

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
    public ListNode mergeKLists(ListNode[] lists) {
        Comparator<ListNode> comp=(n1,n2)-> Integer.compare(n1.val,n2.val);

        PriorityQueue<ListNode> pq=new PriorityQueue<>(comp);
        for(ListNode n:lists){
            pq.add(n);
        }
        ListNode res=new ListNode(-1);
        ListNode temp=res;
        while(!pq.isEmpty()){
            ListNode n=pq.poll();
            temp.next=n;
            temp=temp.next;
            if(n.next!=null){
                pq.add(n.next);
            }
        }
        return res.next;
    }
}

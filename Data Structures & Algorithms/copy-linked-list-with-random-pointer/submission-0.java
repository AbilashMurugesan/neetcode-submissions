/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node,Node> map=new HashMap<>();
        Node temp=head;
        while(temp!=null){
            map.put(temp,new Node(temp.val));
            temp=temp.next;
        }
        Node res=new Node(-1);
        temp=res;
        while(head!=null){
            Node node=map.get(head);
            node.random=map.get(head.random);
            res.next=node;
            res=res.next;
            head=head.next;
        }
        return temp.next;
    }
}

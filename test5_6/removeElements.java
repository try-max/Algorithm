//删除链表中等于给定值 val 的所有节点。
//
//示例:
//
//输入: 1->2->6->3->4->5->6, val = 6
//输出: 1->2->3->4->5
public Node removeElements(Node head, int val) {
        if (head==null){
            return head;
        }
        if (head.next==null){
            if (head.data==val){
                head=head.next;
                return head;
            }
            return head;
        }
        Node cur=head;
        Node prev=cur.next;
        while (cur!=null){
            if (prev.data==val){
                prev=prev.next;
                cur.next=prev;
            }else {
                prev=prev.next;
                cur=cur.next;
            }
        }
        if (head.data==val){
            return head.next;
        }
        return head;
}


/**
 * Partition List
 */
class Solution_86 {
    public ListNode partition(ListNode head, int x) {
        if(head==null)
            return head;
        ListNode first=new ListNode(0);
        first.next=head;
        ListNode pre=first,now=head;
        while(now!=null){
            if(now.val<x){
                pre=now;
                now=now.next;
            }
            else//找到第一个大于等于x的节点
                break;
        }
        if(now==null||now.next==null)
            return head;
        ListNode tmp=now.next;
        while(tmp!=null){
            if(tmp.val<x){
                now.next=tmp.next;
                tmp.next=pre.next;
                pre.next=tmp;
                pre=tmp;
                tmp=now.next;
            }
            else{
                now=tmp;
                tmp=tmp.next;
            }
        }

        return first.next;
    }
}
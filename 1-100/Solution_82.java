
import java.util.LinkedHashMap;
import java.util.Set;

/**
 * Remove Duplicates from Sorted List II
 *消除所有重复的数字
 * Given 1->1->1->2->3, return 2->3.
 */

public class Solution_82 {
    public ListNode deleteDuplicates(ListNode head) {
        LinkedHashMap<Integer,Integer> data=new LinkedHashMap<>();
        while(head!=null){
            if(data.containsKey(head.val)){
                data.put(head.val,data.get(head.val)+1);
            }
            else
                data.put(head.val,1);
            head=head.next;
        }
        Set<Integer> keys=data.keySet();
        head=new ListNode(0);
        ListNode ret=head;
        for (Integer i:keys ) {
            if (data.get(i)==1){
                ret.next=new ListNode(i);
                ret=ret.next;
            }
        }

        return head.next;
    }
}

import java.util.ArrayList;
import java.util.List;

public class MaximumTwinSumOfALinkedList {
    public int pairSum(ListNode head) {
        if(head.next==null || head==null){
            return 0;
        }
        if(head.next.next==null){
            return head.val + head.next.val;
        }
        int size=0;
        int maximum = Integer.MIN_VALUE;
        ListNode newHead = head;
        List<Integer> list = new ArrayList<Integer>();
        while(head!=null){
            list.add(head.val);
            head = head.next;
            size++;
        }
        for(int i=0;i<size/2;i++){
            int total = list.get(i) + list.get(size-1-i);
            maximum = Integer.max(total,maximum);
        }
        return maximum;
    }
}

import org.w3c.dom.ls.LSException;

/**
 * Created by Akash on 1/25/2017.
 */
class ListNode{
    int val;
    ListNode next;

    ListNode(int x){
        val = x;
        next = null;
    }
}
public class LinkedListLoop2 {

    public ListNode detectCycle(ListNode head){
        if(head == null) return null;
        ListNode runner = head;
        ListNode walker = head;

        while(runner.next.next != null && walker.next != null){

            runner = runner.next.next;
            walker = walker.next;

            if(runner == walker){
                runner = head;
                while(runner != walker){
                    runner = runner.next;
                    walker = walker.next;
                }
                return runner;
            }
        }
        return null;
    }

}

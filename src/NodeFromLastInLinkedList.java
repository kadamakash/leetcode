import java.util.Hashtable;

/**
 * Created by Akash on 2/4/2017.
 */
public class NodeFromLastInLinkedList {
    public ListNode findNthNodeFromEnd(ListNode head, int n) {
        if(head == null) return null;
        Hashtable<Integer,ListNode> h = new Hashtable<Integer,ListNode>();
        ListNode curr = head;
        int index = 1;
        // adding each node in hash table with its index number associated to it
        while(curr != null) {
            h.put(index++,curr);
            curr = curr.next;
        }
        // Fing the node's position from the end.
        int npos = h.size()-n+1;
        // find node in hashtable corresponding to the node's position
        return h.get(npos);
    }
}

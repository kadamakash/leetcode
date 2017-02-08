/**
 * Created by Akash on 2/2/2017.
 */
public class InsertInSinglyLinkedList {
    public ListNode insertAtPosition(ListNode head, int data, int pos) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            return newNode;
        }
        else if (pos == 1) {
            newNode.next = head;
            return newNode;
        }
        else {
            ListNode curr = head;
            ListNode prev = null;
            int count = 1;
            //find requested position in the list
            while(curr != null) {
                if(count == pos) {
                    break;
                }
                prev = curr;
                curr = curr.next;
                count++;
            }
            prev.next = newNode;
            newNode.next = curr;
        }
        return head;
    }
}

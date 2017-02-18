/**
 * Created by Akash on 2/12/2017.
 */
public class PlusOneLinkedList {

    private ListNode plusOne(ListNode head){
        if(Dfs(head) == 0){
            return head;
        } else {
            ListNode newHead = new ListNode(1);
            newHead.next = head;
            return newHead;
        }
    }

    private int Dfs(ListNode head){
        if(head == null){
            return 1;
        }

        int carry = Dfs(head.next);

        if(carry == 0) return 0;

        int val = head.val + 1;
        head.val = val % 10;
        return val / 10;
    }

    public static void main(String[] args){

    }
}

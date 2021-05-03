package JavaPracticeGitHub.C21_LinkedList;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {

        ListNode previous = null;
        ListNode current = head;

        while(current != null){
            ListNode temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }

        return previous;

    }

}

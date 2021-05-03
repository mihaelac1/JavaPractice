package JavaPracticeGitHub.C21_LinkedList;

public class RemoveLinkedListElements {

    public ListNode removeElements(ListNode head, int val) {

        if(head == null){
            return head;
        }

        ListNode it = head;

        ListNode myList = new ListNode(0, head);
        ListNode prev = myList;

        while(it != null){

            if(it.val == val){
                prev.next = it.next;
            }else{
                prev = prev.next;
            }
            it = it.next;
        }

        return myList.next;
    }

}

package JavaPracticeGitHub.C21_LinkedList;

public class RemoveDuplicatesII {
    public static ListNode deleteDuplicates(ListNode head) {

        if(head == null){
            return head;
        }

        ListNode first = new ListNode(0, head);

        ListNode prev = first;

        while(head != null){

            if(head.next != null && head.val == head.next.val) {

                while(head.next != null && head.val == head.next.val){
                    head = head.next;
                }

                prev.next = head.next;

            }else{
                prev = prev.next;
            }

            head = head.next;

        }
        return first.next;
    }

    public static void printLinkedList(ListNode l){
        ListNode parcours = l;
        while(parcours != null){
            System.out.print(parcours.val + ", ");
            parcours = parcours.next;
        }
    }


    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(1);
        l1.next.next =  new ListNode(4);

        printLinkedList(deleteDuplicates(l1));
    }
}

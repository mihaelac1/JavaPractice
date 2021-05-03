package JavaPracticeGitHub.C21_LinkedList;

public class RotateList {

    public static ListNode rotateRight(ListNode head, int k) {
        if(head == null){
            return head;
        }

        ListNode it  = head;
        int count = 1;
        while(it.next != null){
            it = it.next;
            count++;
        }

        it.next = head;

        k = k % count;
        int positionToBreak = count - k;
        count = 1;

        while(count < positionToBreak){
            head = head.next;
            count++;
        }

        ListNode firstList = head.next;
        head.next = null;

        return firstList;
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
        l1.next = new ListNode(2);
        l1.next.next =  new ListNode(3);
        l1.next.next.next =  new ListNode(4);
        l1.next.next.next.next =  new ListNode(5);

        printLinkedList(rotateRight(l1, 2));
    }
}

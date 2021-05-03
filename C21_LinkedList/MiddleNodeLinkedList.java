package JavaPracticeGitHub.C21_LinkedList;

public class MiddleNodeLinkedList {
    public static ListNode middleNode(ListNode head) {

        if(head == null){
            return head;
        }

        int count = 0;

        ListNode it = head;

        while(it != null){
            count++;
            it = it.next;
        }

        count = count / 2;

        for(int i = 0; i < count ; i++){
            head = head.next;
        }

        return head;
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
        l1.next.next =  new ListNode(4);

        printLinkedList(middleNode(l1));
    }
}

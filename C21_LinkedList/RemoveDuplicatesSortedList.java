package JavaPracticeGitHub.C21_LinkedList;

public class RemoveDuplicatesSortedList {

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode myList = head;
        while( myList != null && myList.next != null){
            int val1 = myList.val;
            int val2 = myList.next.val;
            if(val1 == val2){
                myList.next = myList.next.next;
            }else{
                myList = myList.next;
            }
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
        l1.next = new ListNode(1);
        l1.next.next =  new ListNode(4);

        printLinkedList(deleteDuplicates(l1));
    }
}

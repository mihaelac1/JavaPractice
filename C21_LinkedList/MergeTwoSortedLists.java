package JavaPracticeGitHub.C21_LinkedList;

public class MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode finalList = new ListNode(0);
        ListNode myList = finalList;

        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                myList.next = l1;
                l1 = l1.next;
            }else{
                myList.next = l2;
                l2 = l2.next;
            }
            myList = myList.next;
        }

        if(l1 != null){
            myList.next = l1;
        }

        if(l2 != null){
            myList.next = l2;
        }

        return finalList.next;
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

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next =  new ListNode(4);

        printLinkedList(mergeTwoLists(l1, l2));

    }

}

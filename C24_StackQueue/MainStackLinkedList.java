package JavaPracticeGitHub.C24_StackQueue;

public class MainStackLinkedList {

    public static void main(String[] args) {
//        StackList<String> myList = new StackList<>();
//       // System.out.println(myList.isEmpty());
//        myList.push("test 1");
//        myList.push("test 2");
//        myList.push("test 3");
//
//        System.out.println("peek() : " + myList.peek());
//        System.out.println(myList.poop());
//        System.out.println("peek() : " + myList.peek());


        MyIntLinkedList<Integer> myIntegerList = new MyIntLinkedList<>();
        myIntegerList.add(6);
        myIntegerList.add(3);
        myIntegerList.add(10);
        myIntegerList.add(6);

        System.out.println(" my integer list : ");
        myIntegerList.printList();

        myIntegerList.add(1,32);
        myIntegerList.printList();
        System.out.println(myIntegerList.get(1));
        System.out.println(myIntegerList.remove(1));
        myIntegerList.printList();

        System.out.println("size = : " + myIntegerList.size());

        System.out.println(myIntegerList.contains(5));
        myIntegerList.add(0,9);
        myIntegerList.printList();
        System.out.println();
        System.out.println("size = : " + myIntegerList.size());
        myIntegerList.add(4,9);
        myIntegerList.printList();
        System.out.println("get : " + myIntegerList.get(4));
        System.out.println("indexOf : " + myIntegerList.indexOf(3));
        System.out.println("last indexOf : " + myIntegerList.lastIndexOf(9));
        System.out.println(myIntegerList.removeElementAtIndex(1));
        myIntegerList.printList();
        System.out.println();
        System.out.println(myIntegerList.set(5, 8));
        myIntegerList.printList();
        System.out.println();

        MyIntLinkedList<Integer> myIntegerList2 = new MyIntLinkedList<>();
        myIntegerList2.add(1);
        myIntegerList2.add(2);
        myIntegerList2.add(3);
        myIntegerList2.add(4);

        System.out.println("List 2");
        myIntegerList2.printList();

//        MyIntLinkedList<Integer> myIntegerList3 = new MyIntLinkedList<>(myIntegerList2);
//        System.out.println("List 3");
//        myIntegerList3.printList();

        MyIntLinkedList<Integer> myIntegerList4 = new MyIntLinkedList<>();
        myIntegerList4.add(5);
        myIntegerList4.add(6);
        myIntegerList4.add(7);
        myIntegerList4.add(8);
        System.out.println("List 4: ");
        myIntegerList4.printList();


        System.out.println("List 2 + 4 concatenate");
        myIntegerList2.addAll(1,myIntegerList4);
        myIntegerList2.printList();

        MyIntLinkedList<Integer> myIntegerList5 = new MyIntLinkedList<>();
        myIntegerList2.addAll(myIntegerList5);
        myIntegerList2.printList();


//        System.out.println(myIntegerList2.toArray());
    }
}

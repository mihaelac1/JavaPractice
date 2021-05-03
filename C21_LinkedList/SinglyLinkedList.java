package JavaPracticeGitHub.C21_LinkedList;

public class SinglyLinkedList<T> {

    private Node listHead;

    // helper method to create a list from an array of values
    public SinglyLinkedList (T[] values) {
        Node head = new Node();
        Node it = head;
        for (T el : values) {
            Node newNode = new Node(el);
            it.next(newNode);
            it = it.next();
        }

        listHead = head.next();
    }

    public SinglyLinkedList () {}

    // iterate over all elements of a linked list
    public void iterate() {
        Node it = listHead; // The iterator points to the first element in the list
        while (it != null) { // while we have not reached the end of the list
            T crtElement = it.value(); // accessing the element in the Node indicated by the iterator
            System.out.println(crtElement); // for demo purpose: printing the element
            it = it.next(); // updating the iterator to point to the next node
        }
    }

    // search for a certain key in a linked list
    public boolean find(T searchKey) {
        // using a for loop for iteration
        for (Node it = listHead; it != null; it = it.next()) {
            if (it.value().equals(searchKey)) { // comparing 2 double values
                return true;
            }
        }
        return false;
    }

    // insert the 'newValue' in the list at the 'pos' position
    public void insert(T newValue, int pos) {
        // Insertion steps:
        // (0) - move the iterator 'it' on the node *before* the insertion
        Node it = listHead;
        for (int i=0; i<pos-1; i++) {
            it = it.next();
        }

        // (1) - create a node containing the new inserted element
        Node newNode = new Node(newValue);

        // (2) - newNode indicates the 'after' node
        newNode.next(it.next());

        // (3) - previous node indicates the new created node
        it.next(newNode);
    }

    // remove the element at the 'pos' position from the list and
    // return the value removed
    public T remove(int pos) {
        // Insertion steps:
        // (0) - move the iterator 'it' on the node *before* the one removed
        Node it = listHead;
        for (int i=0; i<pos-1; i++) {
            it = it.next();
        }

        // store the value from the deleted node
        T removedEl = it.next().value();

        // (1) - update the reference of the previous node
        //       to indicate the node after the deleted one
        it.next(it.next().next());

        // return the deleted value
        return removedEl;
    }

    private class Node {
        private T value;
        private Node next;

        public Node(T value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(T value) {
            this(value, null);
        }

        public Node() {}

        public void value(T value) {
            this.value = value;
        }

        public T value() {
            return value;
        }

        public Node next() {
            return next;
        }

        public void next(Node next) {
            this.next = next;
        }
    }

}

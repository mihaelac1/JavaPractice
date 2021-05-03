package JavaPracticeGitHub.C21_LinkedList;

public class DoubleLinkedList<T> {

    private Node listHead;
    // helper method to create a list from an array of values
    public DoubleLinkedList (T[] values) {
        Node head = new Node();
        Node it = head;
        for (T el : values) {
            Node newNode = new Node(el);
            it.next(newNode);
            it.previous = it;
            it = it.next();
        }

        listHead = head.next();
    }

    public DoubleLinkedList () {}

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
        newNode.previous(it);
        // (3) - previous node indicates the new created node
        it.next().previous(newNode);
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
        it.previous(it);

        // return the deleted value
        return removedEl;
    }

    private class Node {
        private T value;
        private Node next;
        private Node previous;

        public Node(T value, Node next, Node previous) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }

        public Node(T value) {
            this(value, null, null);
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

        public Node previous() {
            return previous;
        }

        public void previous(Node previous) {
            this.previous = previous;
        }
    }

}

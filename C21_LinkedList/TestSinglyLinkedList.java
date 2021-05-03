package JavaPracticeGitHub.C21_LinkedList;

public class TestSinglyLinkedList {

    public static void main(String[] args) {
        Double[] values = {24.15, 24.15, 3.33, 1.01, 19.30, 16.11};
        SinglyLinkedList<Double> list = new SinglyLinkedList<>(values);

        // 1. Iterate over elements
        list.iterate();
        System.out.println();

        // 2. Search for an element
        double searchKey = 12.45;
        System.out.println("Element " + searchKey + " exists? Answer: " + list.find(searchKey));
        System.out.println();

        // 3. Insert an element
        list.insert(87.26, 2);
        list.iterate();
        System.out.println();

        // 4. Remove an element
        list.remove(4);
        list.iterate();
    }
}

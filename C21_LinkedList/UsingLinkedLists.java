package JavaPracticeGitHub.C21_LinkedList;

public class UsingLinkedLists {

    //create a list from an array of values
    private static Node<Double> makeList(double[] values){
        Node<Double> head = new Node<>();
        Node<Double> it = head;
        for(double el : values){
            Node<Double> nextNode = new Node<>(el);
            it.next(nextNode);
            it = it.next();
        }
        return head.next();
    }

    //iterate all the elements from a linked list

    public static void iterate(Node<Double> listHead){
        Node<Double> it = listHead;
        while(it != null){
            double crtElement = it.value();
            System.out.println(crtElement);
            it = it.next();
        }
    }

    public static boolean find(Node<Double> listHead, double searchKey){
        for (Node<Double> it = listHead; it != null; it = it.next()) {
            if (it.value() == searchKey)  { // comparing 2 double values
                return true;
            }
        }
        return false;
    }

    public static void insert(Node<Double> listHead, double newValue, int pos){
        Node<Double> newNode = new Node<>(newValue);
        Node<Double> it =listHead;

        for(int i = 0; i < pos - 1; i++){
            it = it.next();
        }
        newNode.next(it.next());
        it.next(newNode);

    }

    public static double remove(Node<Double> listHead, int pos){
        Node<Double> it = listHead;
        for(int i = 0; i < pos - 1; i++){
            it = it.next();
        }
        double removedValue = it.next().value();

        it.next(it.next().next());

        return removedValue;

    }

    public static void main(String[] args) {
        double[] values = {24.15, 24.12, 25, 36, 10};
        Node<Double> list = makeList(values);
        iterate(list);

        double searchKey = 12.45;
        System.out.println("Element " + searchKey + " exists? Answer: " + find(list, searchKey));

        insert(list, 20.3, 1);
        iterate(list);

        remove(list, 4);
        iterate(list);

    }

}

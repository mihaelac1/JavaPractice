package JavaPracticeGitHub.C23_Stack_Queue;

import java.util.*;

public class DocPile {
    private Deque<String> pile;

    public DocPile(String containerType) {
        switch (containerType) {
            case "LinkedList":
                pile = new LinkedList<String>();
                break;
            case "ArrayDeque":
                pile = new ArrayDeque<String>();
                break;
            default:
                System.out.println("Error: Invalid type. Using the default: ArrayDeque");
                pile = new ArrayDeque<String>();
                break;
        }
    }

    public DocPile(Deque<String> container) {
        this.pile = container;
    }

    public DocPile() {
        pile = new ArrayDeque<String>();
    }

    public String readDoc() {
        return pile.peek();
    }

    public void addDoc(String doc) {
        pile.push(doc);
    }

    public String removeDoc() {
        return pile.pop();
    }

    public boolean isEmpty() {
        return pile.isEmpty();
    }
}

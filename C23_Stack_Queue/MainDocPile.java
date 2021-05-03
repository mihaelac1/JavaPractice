package JavaPracticeGitHub.C23_Stack_Queue;

public class MainDocPile {

    public static void main(String[] args) {
        DocPile docs = new DocPile();

        System.out.println(docs.readDoc());

        docs.addDoc("Implement the interface methods.");
        docs.addDoc("Remove 'public' declared fields.");

        System.out.println(docs.readDoc());

        docs.addDoc("Always reuse code where possible.");
        docs.addDoc("Don't forget 'StringBuilder' for editing Strings.");
        docs.addDoc("Use intuitive names for all entities.");

        docs.removeDoc();

        docs.addDoc("Write Efficient code.");

        while (!docs.isEmpty()) {
            System.out.println(docs.removeDoc());
        }
    }

}

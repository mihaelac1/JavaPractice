package JavaPracticeGitHub.C15_NestedClasses;

public class Bookkeeper {
    public static void main(String[] args) {

        Book masterOfTheGame = new Book(463);

//        Book.Page page23 = masterOfTheGame.new Page(23);
//        Book.Page page3 = masterOfTheGame.getPage(3);

        // The following 4 attempts to (wrongly) initialize a page will produce errors:
//        Book.Page page2 = new Page(23);
//        Book.Page page100 = new masterOfTheGame.Page(23);
//        Book.Page page1 = Book.new Page(23);
//        Book.Page page1 = new Book.Page(23);

//        System.out.println(page3.getText());

        // methods called only on Book instances
        System.out.println(masterOfTheGame.getPageContent(3));
        IPage page3 = masterOfTheGame.getPage(3);
        System.out.println(page3.getText());

    }
}
